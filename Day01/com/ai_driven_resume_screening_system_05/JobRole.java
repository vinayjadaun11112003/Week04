package Day01.com.ai_driven_resume_screening_system_05;

//Abstract Job Role Class
abstract class JobRole {
    private String jobTitle;

    //constructor to set the jobrole
    public JobRole(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //method to get the jobtitle.
    public String getJobTitle() {
        return jobTitle;
    }

    //abstract method
    public abstract String getRequiredSkills();
}
