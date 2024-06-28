class A extends Thread
{
    public void run()
    {
        for (int i=0;i<100;i++)
        {
            System.out.println("Hello");
        }
    }
}


class B extends Thread
{
    public void run()
    {
        for (int i=0;i<100;i++)
        {
            System.out.println("Hi");
        }
    }
}


public class ThreadsDemo
{
    public static void main(String[] args)
    {
        //create objects
        A obj1= new A();
        B obj2 = new B();


        System.out.println("Priority of obj1 is:"+obj1.getPriority()); 
        System.out.println("Priority of obj2 is :"+obj2.getPriority());

        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(3);

        obj1.start();
        obj2.start();
    }
}