package SchoolModel.Entites;

import SchoolModel.Interfaces.Courses;
//POLYMORPHISM BY OVERRIDING IN LINE 21
public class Student extends Person implements Courses {
    private String courseName;

    public boolean isStubborn() {
        return stubborn;
    }

    public void setStubborn(boolean stubborn) {
        this.stubborn = stubborn;
    }

    private  boolean stubborn;
    public Student(String name, int age, int id) {
        super(name, age, id);
    }

    @Override
    public void getCourseName(String courseTitle) {
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    void isTaking(){
        System.out.println(getName() + "with Student I.D FGGC/" + getId() + " is taking " + courseName);
    }
}
