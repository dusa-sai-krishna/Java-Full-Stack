package Interface;

interface A
{
    public void show();
}

class B implements A
{
    public void show()
    {
        System.out.println("In B show");
    }
}



public class InterfaceDemo {
    
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
