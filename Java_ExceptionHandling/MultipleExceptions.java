package Java_ExceptionHandling;

public class MultipleExceptions {
    public static void main(String[] args)
    {
        
    int[] arr = new int[5];
    
    int i=2;
    int j;
    

    
    //by default all values are zero

    try
    {
        j = 2/i;
        System.out.println("Some value "+arr[5]);
    }

    catch (ArithmeticException e)
    {
        System.out.println("Zero Division Error");
    }

    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Be in your limits"+e);
    }
    catch(Exception e)
{
    System.out.println("Something went wrong"+e);
}
    System.out.println("I guess Exceptions were successfully handled");

    }
}
