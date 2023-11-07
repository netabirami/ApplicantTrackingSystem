package com.StartStep.Human_Resource_Management_System.HumanManagement;

import java.util.List;

public class JobPosition {
    // Attributes
    private String title;
    private String description;
    private double offeredSalaryRangeStart;
    private double offeredSalaryRangeEnd;
    private List<String> requiredSkills;
    private String location;
    private String industry;
    private String role;

    // Constructor
    public JobPosition(String title, String description, double offeredSalaryRangeStart, double offeredSalaryRangeEnd, List<String> requiredSkills, String location, String industry, String role) {
        this.title = title;
        this.description = description;
        this.offeredSalaryRangeStart = offeredSalaryRangeStart;
        this.offeredSalaryRangeEnd = offeredSalaryRangeEnd;
        this.requiredSkills = requiredSkills;
        this.location = location;
        this.industry = industry;
        this.role = role;
    }

    public JobPosition(String title, String description, double offeredSalaryRangeStart, double offeredSalaryRangeEnd, List<String> requiredSkills, String location) {
        this.title=title;
        this.description=description;
        this.offeredSalaryRangeStart=offeredSalaryRangeStart;
        this.offeredSalaryRangeEnd=offeredSalaryRangeEnd;
        this.requiredSkills=requiredSkills;
        this.location=location;
    }

    // Methods
    public boolean isWithinBudget(Applicant applicant) {
        return (applicant.getExpectedSalary() >= offeredSalaryRangeStart) && (applicant.getExpectedSalary() <= offeredSalaryRangeEnd);
    }

    // Getters and Setters (for accessing and modifying attributes)
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getOfferedSalaryRangeStart() {
        return offeredSalaryRangeStart;
    }

    public double getOfferedSalaryRangeEnd() {
        return offeredSalaryRangeEnd;
    }

    public List<String> getRequiredSkills() {

        return requiredSkills;
    }

    public String getLocation() {
        return location;
    }

    public String getIndustry() {
        return industry;
    }

    public String getRole() {
        return role;
    }

    public void setOfferedSalaryRange(double start, double end) {
        if (start <= end) {
            this.offeredSalaryRangeStart = start;
            this.offeredSalaryRangeEnd = end;
        } else {
            System.out.println("Error: Salary range start must be less than or equal to range end.");
        }
    }
}




