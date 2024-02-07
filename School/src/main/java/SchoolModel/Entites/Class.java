package SchoolModel.Entites;

public class Class extends Student{
    private String classroom;
    public Class(String name, int age, int id) {
        super(name, age, id);
    }

    public Class(String name, int age, int id, String classroom) {
        super(name, age, id);
        this.classroom = classroom;
    }
    void putClass(){
        if(getAge()<=12){
            System.out.println(getName() + " should be in JSS1");
        } else if (getAge()<=13) {
            System.out.println(getName() + " should be in JSS2");
        } else if (getAge()<=14) {
            System.out.println(getName() + " should be in JSS3");
        } else{
            System.out.println(getName() + " either enrolled at a premature age or is older than her class");
        }
    }
}
