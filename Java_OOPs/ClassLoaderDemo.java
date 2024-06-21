// Define your Student class
class Student {
    // Member variables
    int roll_no;

    // Constructor
    public Student() {
        roll_no = 0; // You might want to initialize roll_no here
        System.out.println("Constructor");
    }

    // Static block
    static {
        String school = "SRKVN";
        System.out.println("Static Block");
    }
}

// Main class where your program starts execution
public class ClassLoaderDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // Load the Student class (though this isn't strictly necessary for your example)
        Class.forName("Student");
    }
}
