package Day01.com.multilevel_university_cource_management_system_03;
import java.util.*;
//Course Management class
class CourseManagement {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    //method to add cources to the list of cources
    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    //method to show courses data
    public void showAllCourses() {
        for (Course<? extends CourseType> course : courses) {
            course.displayCourseDetails();
        }
    }
}
