package com.prabhakar.carrierguidanceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import java.util.List;

public class ExploreFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        LinearLayout container = view.findViewById(R.id.cardContainer);

        for (ExploreCardData card : exploreCards) {
            View cardView = LayoutInflater.from(getContext()).inflate(R.layout.item_explore_card, container, false);

            ((TextView) cardView.findViewById(R.id.card_title)).setText(card.title);
            ((TextView) cardView.findViewById(R.id.card_subtitle)).setText(card.subtitle);
            ((ImageView) cardView.findViewById(R.id.card_icon)).setImageResource(card.iconRes);

            cardView.setOnClickListener(v -> startActivity(new Intent(requireContext(), card.targetActivity)));

            container.addView(cardView);
        }
    }

    public static class ExploreCardData {
        String title;
        String subtitle;
        int iconRes;
        Class<?> targetActivity;

        public ExploreCardData(String title, String subtitle, int iconRes, Class<?> targetActivity) {
            this.title = title;
            this.subtitle = subtitle;
            this.iconRes = iconRes;
            this.targetActivity = targetActivity;
        }
    }

    private final List<ExploreCardData> exploreCards = Arrays.asList(
            new ExploreCardData(
                    "Trending Courses",
                    "Explore the most in-demand skills",
                    R.drawable.ic_trending,
                    TrendingCoursesActivity.class
            ),
            new ExploreCardData(
                    "After 12th",
                    "Courses & Streams after 12th",
                    R.drawable.ic_12th,
                    After12thActivity.class
            ),
            new ExploreCardData(
                    "Explore by Interest",
                    "Discover what suits you",
                    R.drawable.ic_interest,
                    InterestExplorerActivity.class
            ),
            new ExploreCardData(
                    "Top Colleges",
                    "Best institutes in India",
                    R.drawable.ic_college,
                    TopCollegesActivity.class
            )
    );
}