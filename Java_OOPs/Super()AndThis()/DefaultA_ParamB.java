class A
{
    public A()
    {
        super();
        System.out.println("In default constructor of A");
    }

    public A(int n)
    {
        super();
        System.out.println("In parameterized constructor of A");
    }

}
class B extends A
{
    public B()
    {
        super();
        System.out.println("In default constructor of B");
    }

    public B(int n)
    {
        super();
        System.out.println("In parameterized constructor of B");
    }

}




public class DefaultA_ParamB {
    
public static void main(String[] args)
{
    B obj = new B(5);


}

}
