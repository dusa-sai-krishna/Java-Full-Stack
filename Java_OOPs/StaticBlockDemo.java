
class Student{

	

	public Student(){
		int roll_no;
		System.out.println("Constructor");
		}

    static
	{
	String school = "SRKVN";
	System.out.println("Static Block");
	}
}


public class StaticBlockDemo {
    
    public static void main(String[] args) {
        Student std = new Student();
        Student st2 = new Student();
		
    
    
    }
}
