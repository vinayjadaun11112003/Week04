package Day01.com.multilevel_university_cource_management_system_03;

//Generic Course Class
class Course<T extends CourseType> {
    private T courseType;

    //constructor to set the class member.
    public Course(T courseType) {
        this.courseType = courseType;
    }

    //method to get the cource type
    public T getCourseType() {
        return courseType;
    }

    //method to display the cource details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseType.getCourseName() + ", Evaluation Method: " + courseType.getEvaluationMethod());
    }
}
