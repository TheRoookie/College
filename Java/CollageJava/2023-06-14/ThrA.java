public class ThrA
{   public static void main(String[] args) throws InterruptedException
    {
        thrb b = new thrb();
        b.start();
        //b.join(0,1);
        synchronized(b)
        {
            b.wait();
            System.out.println(b.total);
        }
    }
}

class thrb extends Thread
{
    int total= 0;
    public void run()
    {
        synchronized(this)
        {
            for(int i = 0; i < 1000000000; i++)
            {
                total += i;
            }
            this.notify();
            
        }
        System.out.println("Done");
    }
}