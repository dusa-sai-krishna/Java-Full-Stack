

class A 
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Calc");
    }
    
}

public class ThrowsExceptionDemo {
    
    public static void main(String[] args)
    {
        try
        {
            A obj = new A();
            obj.show();
        }

        catch(ClassNotFoundException e)
        {
            System.out.println("Class Not found");
            e.printStackTrace();
        }
    }
}
