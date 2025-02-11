package Day01.com.multilevel_university_cource_management_system_03;

//UniversitySystemMain class --> Class to control the execution of code
public class UniversitySystemMain {
    //Main method to control the flow of code.
    public static void main(String[] args) {

        //Creating object of cource of different type
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Mathematics"));
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("Literature"));
        Course<ResearchCourse> researchCourse = new Course<>(new ResearchCourse("Physics"));

        //Creating CourceManagement object and adding cources to it.
        CourseManagement courseManagement = new CourseManagement();
        courseManagement.addCourse(examCourse);
        courseManagement.addCourse(assignmentCourse);
        courseManagement.addCourse(researchCourse);

        //printing data of each type of cources
        System.out.println("University Course List:");
        courseManagement.showAllCourses();
    }
}
