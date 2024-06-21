package Java_InnerClass;
class A 
{
    int num;

    public void show()
    {
        System.out.println(" In A show");
    }    

}

public class AnonymousInnerClass {
    
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


