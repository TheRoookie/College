public class p1
{

    public static void main(String[] args) throws Exception
    {
        System.out.println(Thread.currentThread());
        
        th t = new th();
        th2 th2 = new th2("Bitch");
        t.start();
        th2.start();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("MotherFucker");
        System.out.println(Thread.currentThread().getName());
        //System.out.println(10/0);
        t.setName("Nigga");
        System.out.println(t.getName());
        
        

    }
}
class th extends Thread
{
    th(){}
    th(String s)
    {
        super(s);
    }
    public void run()
    {
        while(true)
        {
            System.out.println(getName());
            for (int i = 0; i < 100000000; i++)
            {
                int a = i+i+i;
                System.out.print("");
            }
        }
    }
}
class th2 extends Thread
{
    th2(){}
    th2(String s)
    {
        super(s);
    }
    public void run()
    {
        while(true)
        {
            System.out.println(getName());
            for (int i = 0; i < 100000000; i++)
            {
                int a = i+i+i;
                System.out.print("");
            }
        }
    }
}