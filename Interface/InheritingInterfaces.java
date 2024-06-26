package Interface;

interface A{

    void show();
    
}

interface D {

    void config1();
}

interface B extends A,D
{

    void config();
}

class C implements B
{
    public void show()
    {
        System.out.println("In C show");
    }
    public void config()
    {
        System.out.println("In C config");
    }

    public void config1()
    {
        System.out.println("In C config1");
    }
}
 public class  InheritingInterfaces {

    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.config();
        c.config1();
    }
    
}
