package Java_LambdaExpressions;

@FunctionalInterface
interface A{
    void show(int i);
}

public class LambdaExpreDemo {
    
    public static void main(String[] args)
    {
        A obj = (int i) -> System.out.println("In Annonymous Inner Class:"+i);
            
       

        obj.show(5);
    }
}
