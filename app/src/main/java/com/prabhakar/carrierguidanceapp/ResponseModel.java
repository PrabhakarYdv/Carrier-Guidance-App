package com.prabhakar.carrierguidanceapp;

import java.util.ArrayList;

public class ResponseModel {
    private String uniqueId;
    private String role;
    private String collegeName;
    private double rating;
    private double cutoff;
    private String tier;
    private String address;

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setCutoff(double cutoff) {
        this.cutoff = cutoff;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSectors(ArrayList<String> sectors) {
        this.sectors = sectors;
    }

    public void setAdmissionRequirements(String admissionRequirements) {
        this.admissionRequirements = admissionRequirements;
    }

    public void setCollegeDetails(String collegeDetails) {
        this.collegeDetails = collegeDetails;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public String getRole() {
        return role;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public double getRating() {
        return rating;
    }

    public double getCutoff() {
        return cutoff;
    }

    public String getTier() {
        return tier;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<String> getSectors() {
        return sectors;
    }

    public String getAdmissionRequirements() {
        return admissionRequirements;
    }

    public String getCollegeDetails() {
        return collegeDetails;
    }

    private ArrayList<String> sectors;
    private String admissionRequirements;
    private String collegeDetails;



}
