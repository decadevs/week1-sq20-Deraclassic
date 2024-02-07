package SchoolModel.Entites;

public class Applicants extends Person {

    public Applicants(String name, int age, int id) {
        super(name, age, id);
    }
    public void apply(){
        System.out.println("My ward, " + getName() + ", age "+ getAge() + ", exam number ONN/ED/" + getId() + ", hereby applies for admission into your noble school");
    }
}
