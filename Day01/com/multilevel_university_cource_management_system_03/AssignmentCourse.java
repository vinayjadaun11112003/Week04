package Day01.com.multilevel_university_cource_management_system_03;

//AssignmentCourse class
class AssignmentCourse extends CourseType {
    //constructor to set the super class course name
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    //overriding method of super class.
    @Override
    public String getEvaluationMethod() {
        return "Assignment-Based Evaluation";
    }
}
