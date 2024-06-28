class KrishnaException extends Exception
{
    public KrishnaException(String string)
    {
        super(string);
    }
}


public class CustomExceptionDemo {
    
    public static void main(String[] args)
    {
        int i=20;
        int j ;

        try{
            j= 18/i;
        
            if (j==0)

            {
                throw new KrishnaException("Just checking out Custom Exceptions");
            }
        }
            catch(KrishnaException e)
            {
                System.out.println("Krishna Exception:"+e);
            }
            catch(Exception e)
            {
                System.out.println("Something went wrong"+e);
            }
        
    }
}
