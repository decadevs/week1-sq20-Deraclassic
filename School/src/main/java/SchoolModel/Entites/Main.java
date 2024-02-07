package SchoolModel.Entites;

public class Main {
    public static void main(String[] args) {

   Teacher teacher = new Teacher("Usman",25,9);
   teacher.teachingCourse("Literature");
   teacher.getCourseName("Social Studies");

Principal principal = new Principal("Emma Yellow", 34, 1);
Applicants applicants = new Applicants("Vivian Abu", 24, 676);
applicants.apply();
principal.admitApplicants(applicants);

Student student = new Student("Chubby Samuel", 19,9);
student.setStubborn(false);
principal.expelStudents(student);

NonAcademicStaff cook = new NonAcademicStaff("Jone Snow",45,4567, "Cook");
cook.stateDuty();

Class class1 = new Class("Blessing Audu", 14,1334);
class1.putClass();
    }
}