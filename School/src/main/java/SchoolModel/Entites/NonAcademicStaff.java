package SchoolModel.Entites;

public class NonAcademicStaff extends Person{
    private String duty;

    public NonAcademicStaff(String name, int age, int id, String duty) {
        super(name, age, id);
        this.duty = duty;
    }

    public NonAcademicStaff(String name, int age, int id) {
        super(name, age, id);
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    void stateDuty(){
        System.out.println(getName() + " works as a " + getDuty());
    }
}
