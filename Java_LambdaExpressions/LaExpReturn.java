package Java_LambdaExpressions;

@FunctionalInterface
interface A{
    int add(int i , int j); 
}

public class LaExpReturn {
    public static void main(String[] args)
    {
        A obj = (int i, int j) ->  i+j;
        
        System.out.printf("Sum is %d",obj.add(3,2));
    }
}
