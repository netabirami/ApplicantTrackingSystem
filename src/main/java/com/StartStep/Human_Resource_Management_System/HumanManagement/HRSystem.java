package com.StartStep.Human_Resource_Management_System.HumanManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HRSystem {
    // Attributes
    private List<JobPosition> jobPositions;
    private List<Recruiter> recruiters;
    private List<Applicant> applicants;

    // Constructor
    public HRSystem() {
        jobPositions = new ArrayList<>();
        recruiters = new ArrayList<>();
        applicants = new ArrayList<>();
    }

    // Method to add a job position to the system
//    that offeredSalaryRangeStart is less than or equal to offeredSalaryRangeEnd.

    public void addJobPosition(JobPosition jobPosition) {//Input parameter
        if (jobPosition != null && jobPosition.getOfferedSalaryRangeStart() < jobPosition.getOfferedSalaryRangeEnd()) {
            jobPositions.add(jobPosition);
        }
    }

    // Method to add a recruiter to the system
    public void addRecruiter(Recruiter recruiter) {
        if (recruiter != null) {
            recruiters.add(recruiter);
        }
    }

    // Method to add an applicant to the system
    public void addApplicant(Applicant applicant) {
        if (applicant != null) {
            applicants.add(applicant);
            System.out.println("Applicant added to the system.");
        } else {
            System.out.println("Error: Cannot add a null applicant to the system.");
        }
    }

    // Method to generate reports on the recruitment process
    public void generateReports() {
        System.out.println("Total Number of Applicants " + getApplicants().size());
        System.out.println("Total Number of Jobs " + getJobPositions().size());
        System.out.println("Total Number of Recruiters " + getRecruiters().size());

        System.out.println("Number of Applicants by status");

        int numberOfApplicantsInReviewStatus = 0;
        int numberOfApplicantsInPendingStatus = 0;
        int numberOfApplicantsInOfferedStatus = 0;
        int numberOfApplicantsInRejectedStatus = 0;

        for (int i = 0; i < getApplicants().size(); i++) {
            if (getApplicants().get(i).getStatus().equals("Reviewed")) {
                numberOfApplicantsInReviewStatus++;
            }
            if (getApplicants().get(i).getStatus().equals("Pending")) {
                numberOfApplicantsInPendingStatus++;
            }
            if (getApplicants().get(i).getStatus().equals("Offered")) {
                numberOfApplicantsInOfferedStatus++;
            }
            if (getApplicants().get(i).getStatus().equals("Rejected")) {
                numberOfApplicantsInRejectedStatus++;
            }
        }

        System.out.println("Number of Applicants in Reviewed status = " + numberOfApplicantsInReviewStatus);
        System.out.println("Number of Applicants in Pending status = " + numberOfApplicantsInPendingStatus);
        System.out.println("Number of Applicants in Offered status = " + numberOfApplicantsInOfferedStatus);
        System.out.println("Number of Applicants in Rejected status = " + numberOfApplicantsInRejectedStatus);
    }

    public List<JobPosition> getJobPositions() {
        return jobPositions;
    }

    public List<Recruiter> getRecruiters() {
        return recruiters;
    }

    public List<Applicant> getApplicants() {
        return applicants;
    }
}


