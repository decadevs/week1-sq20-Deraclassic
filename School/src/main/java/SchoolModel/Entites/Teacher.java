package SchoolModel.Entites;
//INHERITANCE AND IMPLEMENTATION OF INTERFACE
import SchoolModel.Interfaces.Courses;

public class Teacher extends Person implements Courses{
    private String courseName;
    public Teacher(String name, int age, int id) {
        super(name, age, id);
    }

    @Override
    public void getCourseName(String courseTitle) {
        System.out.println("The title of the course you Teach is " + courseTitle );

    }
    void teachingCourse(String courseName){
        System.out.println(getName() + " is teaching "+ courseName);
    }
}
