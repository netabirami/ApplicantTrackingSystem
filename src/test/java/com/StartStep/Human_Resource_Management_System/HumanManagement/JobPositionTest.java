package com.StartStep.Human_Resource_Management_System.HumanManagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JobPositionTest {

    @Test
    public void testIsWithinBudget_True() {
        // Create a job position with a salary range of 50000 to 80000
        JobPosition jobPosition = new JobPosition("Software Engineer", "Job Description", 50000.0, 80000.0, null, "Location");

        // Create an applicant with an expected salary within the job position's budget
        Applicant applicant = new Applicant(null, "City", "Preferred Location", 60000.0, "Pending");

        assertTrue(jobPosition.isWithinBudget(applicant));
    }

    @Test
    public void testIsWithinBudget_False_LowerBoundary() {
        JobPosition jobPosition = new JobPosition("Software Engineer", "Job Description", 50000.0, 80000.0, null, "Location");

        Applicant applicant = new Applicant(null, "City", "Preferred Location", 45000.0, "Pending");

        assertFalse(jobPosition.isWithinBudget(applicant));
    }

    @Test
    public void testIsWithinBudget_False_UpperBoundary() {
        JobPosition jobPosition = new JobPosition("Software Engineer", "Job Description", 50000.0, 80000.0, null, "Location");

        Applicant applicant = new Applicant(null, "City", "Preferred Location", 85000.0, "Pending");

        assertFalse(jobPosition.isWithinBudget(applicant));
    }

    @Test
    public void testIsWithinBudget_BoundaryValues() {
        JobPosition jobPosition = new JobPosition("Software Engineer", "Job Description", 50000.0, 80000.0, null, "Location");

        Applicant lowerBoundaryApplicant = new Applicant(null, "City", "Preferred Location", 50000.0, "Pending");
        Applicant upperBoundaryApplicant = new Applicant(null, "City", "Preferred Location", 80000.0, "Pending");

        assertTrue(jobPosition.isWithinBudget(lowerBoundaryApplicant));
        assertTrue(jobPosition.isWithinBudget(upperBoundaryApplicant));
    }
}
