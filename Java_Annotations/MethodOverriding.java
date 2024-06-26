package Java_Annotations;

class A{

    public void ShowsTheDataIWant()
    {
        System.out.println("In A show");
    }
}

class B extends A{
    @Override
    public void ShowTheDataIWant()
    {
        System.out.println("In B show");
    }
}




public class MethodOverriding {
    
    public static void main(String[] args)
    {
        //create a method of A
        A obj = new A();
        obj.ShowsTheDataIWant();
    }
}
