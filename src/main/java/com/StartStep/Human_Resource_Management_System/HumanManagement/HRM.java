package com.StartStep.Human_Resource_Management_System.HumanManagement;

import java.util.Arrays;
import java.util.List;

public class HRM {

        public static void main(String[] args) {
            // Your main program logic goes here
            // You can create instances of Applicant, JobPosition, Recruiter, and HRSystem
            // Perform operations on these instances to simulate the HR management system

            List<String> previousCompanies = Arrays.asList("Company A", "Company B");
            String currentCity = "Current City";
            String preferredLocation = "Preferred Location";
            double expectedSalary = 60000.0;
            String status = "Pending";
            Applicant applicant1 = new Applicant(previousCompanies,currentCity,preferredLocation,expectedSalary,status);
            String title = "Job Title";
            String description = "Job Description";
            double offeredSalaryRangeStart = 50000.0;
            double offeredSalaryRangeEnd = 80000.0;
            List<String> requiredSkills = Arrays.asList("Skill1", "Skill2");
            String location = "Job Location";
            JobPosition jobPosition1 = new JobPosition(title,description,offeredSalaryRangeStart,offeredSalaryRangeEnd,requiredSkills,location);
            Recruiter recruiter1 = new Recruiter("Recruiter Name");
            

            HRSystem hrSystem = new HRSystem();
            hrSystem.addApplicant(applicant1);
            hrSystem.addJobPosition(jobPosition1);
            hrSystem.addRecruiter(recruiter1);

            // Perform other operations as needed

            // Generate reports
            hrSystem.generateReports();
        }
    }

