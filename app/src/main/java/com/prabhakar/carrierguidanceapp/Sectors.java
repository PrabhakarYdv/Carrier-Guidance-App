package com.prabhakar.carrierguidanceapp;

import androidx.annotation.NonNull;

public class Sectors {
    String[] sectors;


    @NonNull
    @Override
    public String toString() {

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i <= sectors.length; i++) {
            if (i != sectors.length) {
                newString.append(sectors[i] + ", ");
            } else {
                newString.append(sectors[i]);
            }
        }
        return newString.toString();
    }
}
