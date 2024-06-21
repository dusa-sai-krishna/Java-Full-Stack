package Java_OOPs;

class Student{
    // static variable
    static String school = "SRKVN";
    // instance variable
    int rank;
    int roll_no;
    String name;
}






public class Static_Demo {
    public static void main(String[] args){

        //create two objects
        Student st1 = new Student();
        Student st2 = new Student();

        st1.name = "Sai";
        st1.rank = 10;
        st1.roll_no = 23;

        
        st2.name = "Krishna";
        st2.rank = 20;
        st2.roll_no = 13;

        System.out.printf("Student 1 school is : %s and Student 2 school is : %s",Student.school,Student.school);
        
        // let's change the value of the static variable
        Student.school = "DAV";

        System.out.printf("\n After changing Student 1 school is : %s and Student 2 school is : %s",Student.school,Student.school);
    
    }

}
