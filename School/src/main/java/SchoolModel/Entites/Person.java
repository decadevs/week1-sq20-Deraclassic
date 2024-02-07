package SchoolModel.Entites;
//ABSTRACTION
abstract public class Person {
    private String name;
    private int age;
    private int Id;
//    abstract void getName();
//    abstract void getAge();
//    abstract  void getId();

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
