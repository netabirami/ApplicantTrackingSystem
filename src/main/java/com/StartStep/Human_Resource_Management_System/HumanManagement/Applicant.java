package com.StartStep.Human_Resource_Management_System.HumanManagement;

import java.util.List;

public class Applicant {
    private List<String> previousCompanies;
    private String currentCity;
    private String preferredLocation;
    private double expectedSalary;
    private String status;

    public Applicant(List<String> previousCompanies, String currentCity, String preferredLocation, double expectedSalary, String status) {
        this.previousCompanies = previousCompanies;
        this.currentCity = currentCity;
        this.preferredLocation = preferredLocation;
        this.expectedSalary = expectedSalary;
        this.status = status;
    }

    public boolean isRelocationPreferred() {
        // Implement logic to check if relocation is preferred based on location attributes.
        return !currentCity.equals(preferredLocation);
    }

    public List<String> getPreviousCompanies() {
        return previousCompanies;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public String getPreferredLocation() {
        return preferredLocation;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String reviewed) {
        return;
    }

}
