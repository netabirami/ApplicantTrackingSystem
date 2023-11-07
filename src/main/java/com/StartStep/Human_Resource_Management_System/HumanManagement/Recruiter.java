package com.StartStep.Human_Resource_Management_System.HumanManagement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Recruiter {
        // Attributes or variables
        private String name;
        private List<JobPosition> jobPositionsManaged;
        private Set<String> specializedIndustries;
        private Set<String> specializedRoles;

        // Constructor
        public Recruiter(String name) {
            this.name = name;
            this.jobPositionsManaged = new ArrayList<>(); // Initialize the list of job positions.
            this.specializedIndustries = new HashSet<>();
            this.specializedRoles = new HashSet<>();
        }

        // Methods
        public void assignJobPosition(JobPosition jobPosition) {
            // Assign a job position to the recruiter.
            jobPositionsManaged.add(jobPosition);
        }

        public void reviewApplicant(Applicant applicant) {
            // Review an applicant's information and update their status to "Reviewed."
            applicant.setStatus("Reviewed");
        }

        public boolean isSpecializedFor(JobPosition jobPosition) {
            String jobIndustry = jobPosition.getIndustry();
            String jobRole = jobPosition.getRole();
            // Check if the recruiter is specialized for a given job position.
            return specializedIndustries.contains(jobPosition.getIndustry()) && specializedRoles.contains(jobPosition.getRole());
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public List<JobPosition> getJobPositionsManaged() {
            return jobPositionsManaged;
        }

        public Set<String> getSpecializedIndustries() {
            return specializedIndustries;
        }

        public Set<String> getSpecializedRoles() {
            return specializedRoles;
        }
    }




