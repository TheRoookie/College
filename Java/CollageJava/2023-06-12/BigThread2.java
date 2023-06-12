public class BigThread2
{
    public static void main(String[] args) throws InterruptedException
    {
        even e = new even();
        odd o = new odd();
        e.setName("Even");
        o.setName("Odd");
        //eo1.join(1000);
        o.start();
        e.start();

    }
    
}
class even extends Thread
{
    public void run()
    {
        Thread t = Thread.currentThread();
        String s = t.getName();


        



        for (int i = 0; i <= 100; i++)
        {
            if ( i%2==0 ) 
            {
                System.out.println("Even Num. : "+i);

            }
        }
        System.out.println(t.getName());
        

        
    }
}

class odd extends Thread
{
    public void run()
    {
        
        Thread t = Thread.currentThread();
        String s = t.getName();
        
        for (int i = 0; i <= 100; i++) 
        {
            if(i%2!=0)
            {
                System.out.println("Odd Num. : "+i);
            }
        }
        System.out.println(t.getName());
    }
    
}