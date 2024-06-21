package Java_InnerClass;
abstract class A 
{
    int num;

    public abstract void show(); 

}

public class AbstractAndAnonymousInnerClass {
    
    public static void main(String[] args)
    {
        //creating an object of A
            A obj = new A()
            {
                public void show()
                {
                    System.out.println(" In anonymous show");
                }    

            };

            obj.show();
    }
    

}


