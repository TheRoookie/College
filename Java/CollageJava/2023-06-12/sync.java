public class sync
{
    public static void main(String[] args)
    {
        display d = new display();
        Thr t1 = new Thr(d,"Kohli");
        Thr t2 = new Thr(d,"Gavtum");
        t1.start();
        t2.start();
    }
}
class display extends Thread
{
    synchronized void curse(String name) 
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println(name+" says : Fuck You! "+ (i+1) +" times.");
        }
    }
}
class Thr extends Thread
{
    display d;
    String thName;
    Thr(){}
    Thr(display d , String thName)
    {
        this.d = d;
        this.thName = thName;
    }
    public void run()
    {
        d.curse(thName);
    }
}