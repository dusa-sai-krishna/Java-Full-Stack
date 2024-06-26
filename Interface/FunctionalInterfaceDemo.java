package Interface;

@FunctionalInterface
interface A{
    void show();
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args)
    {
        A obj = new A() {
            public void show()
            {
                System.out.println("In Inner class show");
            }
        };
        obj.show();
    }
}
