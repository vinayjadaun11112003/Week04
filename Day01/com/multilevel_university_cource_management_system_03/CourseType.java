package Day01.com.multilevel_university_cource_management_system_03;

//Abstract Course Type class
abstract class CourseType {
    private String courseName;

    //Constructor to set the courcetype
    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    //method to get the course name
    public String getCourseName() {
        return courseName;
    }

    //abstract method
    public abstract String getEvaluationMethod();
}
