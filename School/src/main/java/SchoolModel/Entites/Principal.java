package SchoolModel.Entites;
//INHERITANCE
public class Principal extends Person{
    public Principal(String name, int age, int id) {
        super(name, age, id);
    }
    public void expelStudents(Student student){
        if(student.isStubborn()){
            System.out.println("You have been expel from this school");
        }else {
            System.out.println("Continue to be of good behaviour.");
        }
    }
    public void admitApplicants(Applicants applicants){
        if (applicants.getAge() < 12){
            System.out.println("You  are ineligible to apply");
        }else {
            System.out.println("Congratulations! you have been offered admission!");
        }
    }

}
