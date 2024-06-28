class A implements Runnable
{
    public void run()
    {
        for (int i=0;i<100;i++)
        {
            System.out.println("Hello");
        }
    }
}


class B implements Runnable
{
    public void run()
    {
        for (int i=0;i<100;i++)
        {
            System.out.println("Hi");
        }
    }
}






public class RunnableThreadsDemo {
    public static void main(String[] args)
    {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        //create two thread objects
       Thread t1 = new Thread(obj1);
       Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }   
}
