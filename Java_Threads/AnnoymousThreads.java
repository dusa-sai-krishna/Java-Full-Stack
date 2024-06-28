




public class AnnoymousThreads {
    public static void main(String[] args)
    {
        Runnable obj1 = new A()
        {
            public void run()
            {
                for (int i=0;i<100;i++)
                {
                    System.out.println("Hello");
                }
            }
        };
        Runnable obj2 = new B()
        {
            public void run()
            {
                for (int i=0;i<100;i++)
                {
                    System.out.println("Hi");
                }
            }
        };

        //create two thread objects
       Thread t1 = new Thread(obj1);
       Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }   
}
