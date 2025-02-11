package Day01.com.ai_driven_resume_screening_system_05;

//Generic-Based Resume Class which accept any type of sub-class comes under the jobRole class
class Resume<T extends JobRole> {
    private T jobRole;
    private String candidateName;

    //constructor which set the class members
    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    //display resume method to print the method
    public void displayResumeDetails() {
        System.out.println("Candidate: " + candidateName);
        System.out.println("Applying for: " + jobRole.getJobTitle());
        System.out.println("Required Skills: " + jobRole.getRequiredSkills());
    }
}
