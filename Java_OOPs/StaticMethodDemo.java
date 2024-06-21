

class Student{
    // static variable
    static String school = "SRKVN";
    // instance variable
    int rank;
    int roll_no;
    String name;

    //instance method
    
    //static method
   

    public void display(){
        System.out.println("Hello "+name+" your rank is "+rank+" and roll number is "+roll_no);
    }

    // static method
    public static void display2(){
        //System.out.println("Hello "+name+" your rank is "+rank+" and roll number is "+roll_no+"school"+school);
         // This will throw an error because name, rank, roll_no are instance variable.
         //Their value is derived with the object they are associated with.
         // Since here no object is passed, Java doesn't know which object to use to get their values
         // This causes ambiguity. Hence java throws an error.
    }

    public static void display3(Student std){
        System.out.println("Hello "+std.name+" your rank is "+std.rank+" and roll number is "+std.roll_no+"school"+std.school);
        // This is the official workaround for this problem.
    }

    }

public class StaticMethodDemo {
    public static void main(String [] args){

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
        
        //call display instance method
        st1.display();
        //Student.display2();

        Student.display3(st1);
    }

}
