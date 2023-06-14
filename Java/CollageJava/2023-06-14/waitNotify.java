//Produce and consumption
public class waitNotify
{
    
    public static void main(String[] args)
    {
        proCon pc = new proCon();
        //pc.produce(77);
        producer p = new producer(pc);
        consumer c = new consumer(pc);
        
        //pc.consume();

    }
}
class proCon
{
    boolean isMarked = false;
    int data;
    synchronized void produce(int n)
    {
        if (isMarked)
        {
            try
            {
                wait();
            } catch (Exception e)
            {
                // TODO: handle exception
            }
        }
        data=n;
        System.out.println("Data Produced! : "+data);
        isMarked=true;
        notify();
    }

    synchronized void consume()
    {
        if(!isMarked)
        {
            try
            {
                wait();
            } catch (Exception e)
            {
                // TODO: handle exception
            }
           

        }
        System.out.println("Comsumed Data : "+data);
            isMarked = false;
            notify();
    }
}
class producer extends Thread
{
    proCon pc;
    producer(proCon pc)
    {
        this.pc = pc ;
        start();

    }
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            pc.produce(i);
        }
        
    }
}

class consumer extends Thread
{
    proCon pc;
    consumer(proCon pc)
    {
        this.pc = pc;
        start();
    }
    
    public void run()
    {
    
        for (int i = 0; i < 100; i++)
        {
            pc.consume();
        }
    }
    
}