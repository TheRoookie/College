/*
qus - creat a threadd center by extending thread class that says "Hii" , and crt a th reciver by implementation of runable interface says "by"



*/

public class p2
{

    public static void main(String[] args) throws Exception
    {
        center sir = new center("center");
        reciver me = new reciver();
        sir.bol();
        me.bol();
        sir.setPriority(3);
        

    }
}
class center extends Thread
{
    public final String getname = getName();
    center(){}
    center(String s)
    {
        super(s);
    }
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Hii"+i+getPriority());
        }
    }
    void bol()
    {
        run();
    }
}
class reciver implements Runnable
{
    {Thread.currentThread().setName("Me");}
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Bye"+i+Thread.currentThread().getPriority());
        }
    }



    void bol()
    {
        run();
    }
}