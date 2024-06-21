package Polymorphism;
class A
{
    public void show(){
        System.out.println("In A show");
    }

    public void config(){
        System.out.println("Some config of A");
    }

}

class B extends A
{
    public void show()
    {
        System.out.println("In B show");
    }


}
public class MethodOveriding {
        public static void main(String[] args)
        {
            B obj = new B();
            obj.show();
        }
}   
