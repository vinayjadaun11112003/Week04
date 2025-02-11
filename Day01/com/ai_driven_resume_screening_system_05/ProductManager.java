package Day01.com.ai_driven_resume_screening_system_05;

//Product Manager class which extend the jobrole class.
class ProductManager extends JobRole {
    //constructor which pass the string to the super class
    public ProductManager() {
        super("Product Manager");
    }

    //overriding the method of super class
    @Override
    public String getRequiredSkills() {
        return "Market Analysis, Agile Methodologies, Leadership";
    }
}
