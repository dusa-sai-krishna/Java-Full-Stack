
public class ThrowDemo
{
    public static void main(String[] args)
    {

        int i=20;
        int j;

        try{
            j = 18/i;
            if (j==0)
            {
                throw new ArithmeticException("Printing Default Value");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Don't divide by zero or "+e);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong "+e);
        }
    }
        
        
}