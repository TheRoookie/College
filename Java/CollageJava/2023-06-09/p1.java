public class p1
{

    public static void main(String[] args) throws InterruptedException
    {
        thr1 t1 = new thr1();
        t1.setPriority(1);
        //System.out.println(t1.getPriority());
        thr2 t2 = new thr2();
        t2.setPriority(10);
        //System.out.println(t2.getPriority());
        
        t1.start();
        t1.join(1000);
        t1.sleep(1000);

        //t2.start();
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Main");
        }
    }
}
class thr1 extends Thread
{
    public void run()
    {
        // thr2 t2 = new thr2();
        // t2.start();
        // try
        // {
        //     t2.join();
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }
        // thr1 t = new thr1();
        // t.start();

        for (int i = 0; i < 5 ; i++)
        {
            System.out.println("Class Th 1");
        }
    }
    
}
class thr2 extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5 ; i++)
        {
            System.out.println("Class Th 2");
        }
    }
}