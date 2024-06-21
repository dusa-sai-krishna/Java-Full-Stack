package Java_InnerClass;
class A 
{
    int num;

    public void show()
    {
        System.out.println(" In A show");
    }

    static class B
    {
        public void config()
        {
            System.out.println("Some config of A from B");
        }
    }

}

public class StaticInnerClass {
    
    public static void main(String[] args)
    {
        //creating an object of A
            A obj = new A();
            obj.show();

            //accessing child class
            A.B obj1 = new A.B();
            obj1.config();
    }
    

}


