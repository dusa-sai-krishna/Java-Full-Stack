class Student
{

    private String name="Sai Krishna";


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
}
}


public class Encapsulation {
    

    public static void main(String[] args) {

        Student std = new Student();
        System.out.println(std.getName());

        std.setName("Krishna");
        System.out.println(std.getName());


    }

}
