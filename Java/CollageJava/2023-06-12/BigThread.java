public class BigThread
{
    public static void main(String[] args) throws InterruptedException
    {
        evenOdd eo1 = new evenOdd();
        evenOdd eo2 = new evenOdd();
        eo1.setName("Even");
        eo2.setName("Odd");
        eo1.start();
        //eo1.join(1000);
        eo2.start();

    }
    
}
class evenOdd extends Thread
{
    public void run()
    {
        Thread t = Thread.currentThread();
        String s = t.getName();
        if(s.equals("Even"))
        {
            for (int i = 0; i <= 100; i++)
            {
                if ( i%2==0 ) 
                {
                    System.out.println("Even Num. : "+i);
                }
            }

        }
        else
        {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            for (int i = 0; i <= 100; i++) 
            {
                if(i%2!=0)
                {
                    System.out.println("Odd Num. : "+i);
                }
            }

        }
    }
}