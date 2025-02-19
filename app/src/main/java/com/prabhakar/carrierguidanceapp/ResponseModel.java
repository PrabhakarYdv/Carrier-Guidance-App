package com.prabhakar.carrierguidanceapp;

public class ResponseModel {


    String uniqueId;
    String role;
    String collegeName;
    double rating;
    double cutoff;
    String tier;
    String address;
    Sectors sector;
    String admissionRequirement;
    String collegeDetails;

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getCutoff() {
        return cutoff;
    }

    public void setCutoff(double cutoff) {
        this.cutoff = cutoff;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sectors getSector() {
        return sector;
    }

    public void setSector(Sectors sector) {
        this.sector = sector;
    }

    public String getAdmissionRequirement() {
        return admissionRequirement;
    }

    public void setAdmissionRequirement(String admissionRequirement) {
        this.admissionRequirement = admissionRequirement;
    }

    public String getCollegeDetails() {
        return collegeDetails;
    }

    public void setCollegeDetails(String collegeDetails) {
        this.collegeDetails = collegeDetails;
    }
}