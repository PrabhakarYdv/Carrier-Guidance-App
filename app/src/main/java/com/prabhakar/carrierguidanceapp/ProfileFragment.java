package com.prabhakar.carrierguidanceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;


public class ProfileFragment extends Fragment {
    private TextView userName, userEmail;
    private ImageView userPhoto;
    private Button logoutButton;
    private FirebaseAuth firebaseAuth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        userName = view.findViewById(R.id.userName);
        userEmail = view.findViewById(R.id.userEmail);
        userPhoto = view.findViewById(R.id.userPhoto);
        logoutButton = view.findViewById(R.id.logoutButton);

        firebaseAuth = FirebaseAuth.getInstance();

        // Fetch user info
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(requireContext());
        if (account != null) {
//            userName.setText(account.getDisplayName());
            userEmail.setText(account.getEmail());

            // Load photo using Glide
            Glide.with(this)
                    .load(account.getPhotoUrl())
                    .circleCrop()
                    .into(userPhoto);
        }

        // Logout button click
        logoutButton.setOnClickListener(v -> {
            if (firebaseAuth.getCurrentUser() != null) {
                firebaseAuth.signOut();
                startActivity(new Intent(getActivity(), LoginActivity.class));
                requireActivity().finish();
            }

        });

        fadeInView(view);


        return view;
    }

    private void fadeInView(View view) {
        AlphaAnimation fadeIn = new AlphaAnimation(0f, 1f);
        fadeIn.setDuration(800);
        view.startAnimation(fadeIn);
    }
}