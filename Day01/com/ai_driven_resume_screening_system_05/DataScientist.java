package Day01.com.ai_driven_resume_screening_system_05;

//Data Scientist class which will extend the jobrole class.
class DataScientist extends JobRole {
    //constructor which pass the string to the super class
    public DataScientist() {
        super("Data Scientist");
    }

    //overriding method of super class
    @Override
    public String getRequiredSkills() {
        return "Python, Machine Learning, Statistics";
    }
}