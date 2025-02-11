package Day01.com.multilevel_university_cource_management_system_03;

//ResearchCourse class
class ResearchCourse extends CourseType {
    //constructor to set the super class cources name
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    //overriding the parent class method
    @Override
    public String getEvaluationMethod() {
        return "Research-Based Evaluation";
    }
}
