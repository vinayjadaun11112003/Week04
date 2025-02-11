package Day01.com.ai_driven_resume_screening_system_05;
import java.util.*;
//Resume Screening System
class ResumeScreeningSystem {
    private List<Resume<? extends JobRole>> resumes = new ArrayList<>();

    //method to addResume in the list
    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    //method to print the resume
    public void showAllResumes() {
        for (Resume<? extends JobRole> resume : resumes) {
            resume.displayResumeDetails();
            System.out.println();
        }
    }
}
