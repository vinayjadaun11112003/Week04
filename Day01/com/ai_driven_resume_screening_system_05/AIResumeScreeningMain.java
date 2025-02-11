package Day01.com.ai_driven_resume_screening_system_05;


//AIResumeScreening--->Class to control the execution of code
public class AIResumeScreeningMain {
    //Main method to control the flow of code.
    public static void main(String[] args) {

        //Creating object of resumes of different catagory,
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>("Vinay Jadaun", new SoftwareEngineer());
        Resume<DataScientist> dataScientistResume = new Resume<>("Ankit Rajpoot", new DataScientist());
        Resume<ProductManager> productManagerResume = new Resume<>("Abhishek jat", new ProductManager());

        //Creating object of screening system and adding different resume data into it.
        ResumeScreeningSystem screeningSystem = new ResumeScreeningSystem();
        screeningSystem.addResume(softwareEngineerResume);
        screeningSystem.addResume(dataScientistResume);
        screeningSystem.addResume(productManagerResume);

        //printing all resume object from screening system.
        System.out.println("AI-Driven Resume Screening Results:");
        screeningSystem.showAllResumes();
    }
}
