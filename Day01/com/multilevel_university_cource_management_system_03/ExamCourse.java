package Day01.com.multilevel_university_cource_management_system_03;

//ExamCourse class
class ExamCourse extends CourseType {
    //constructor to set the super class course name
    public ExamCourse(String courseName) {
        super(courseName);
    }

    //overriding the parent class method
    @Override
    public String getEvaluationMethod() {
        return "Exam-Based Evaluation";
    }
}
