public class p1
{
    public static void main(String[] args)
    {
        
        MyThread1 t1 = new MyThread1();
        //t1.setPriority(10);
        MyThread2 t2 = new MyThread2();
        t1.start();
        
        //t2.start();
        //t2.start();
        //t1.start();
        
        System.out.println("Main");



    }
}

class MyThread1 extends Thread
{
    
    public void start()
    {
        super.start();
        System.out.println("Start");
    }
    public void run()
    {
        System.out.println(1);
    }
    
}

class MyThread2 extends Thread
{
    public void run()
    {
        for(int i = 1 ; i<10 ; i++)
        {
            System.out.println(2);
        }
    }
    
}
class testThread1 extends MyThread1
{
    public void run()
    {
        for(int i = 11 ; i<21 ; i++)
        {
            System.out.println("2 t : "+i);
            
        }
    }
}