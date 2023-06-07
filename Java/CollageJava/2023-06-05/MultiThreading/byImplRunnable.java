public class byImplRunnable
{
    public static void main(String[] args)
    {
        f2c1 mt1 = new f2c1();
        //Thread t1 = new Thread(mt1);
        /*t1.start();
        Thread t2 = new Thread();
        t2.start();
        for(int i = 0; i<10 ; i++)
        {
            System.out.println("Main  : "+i);
        }*/
        Thread[] thr = new Thread[30];
        for(int i = 0 ; i<30 ; i++)
        {
            thr[i] = new Thread(mt1);
        }
        for(int i = 0 ; i<30 ; i++)
        {
            thr[i].start();
        }
    }
}
class f2c1 implements Runnable
{
    public void run()
    {
        for(int i = 0; i<10 ; i++)
        {
            System.out.println("MyT : " + i);
        }
    }
    
}