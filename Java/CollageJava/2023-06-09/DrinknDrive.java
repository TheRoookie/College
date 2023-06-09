public class DrinknDrive
{
    public static void main(String[] args) throws InterruptedException
    {
        Drive d = new Drive();
        d.start();
        d.join();
        for (int i = 0; i < 11; i++)
        {
            System.out.println("Cheers....");
        }
        System.out.println(d.isAlive());
        
    }
}
class Drive extends Thread
{
    public void run()
    {
        for (int i = 0; i < 11; i++)
        {
            System.out.println("Sututut....");
            try
            {
                Thread.sleep(2000);
            } catch (Exception e)
            {
                // TODO: handle exception
                //System.out.println(e);
            }
        }
    }
}