package Day01.com.ai_driven_resume_screening_system_05;

//Software Engineer class which extend jobrole class.
class SoftwareEngineer extends JobRole {
    //constructor which pass the string to the super class
    public SoftwareEngineer() {
        super("Software Engineer");
    }

    //overriding the method of super class.
    @Override
    public String getRequiredSkills() {
        return "Java, Python, Data Structures, Algorithms";
    }
}
