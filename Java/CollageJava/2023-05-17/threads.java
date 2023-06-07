//import java.io.*;

public class threads
{

    public static void main(String[] args) throws Exception
    {
        
        System.out.println("Start");
        Thread.sleep(2000);
        System.out.println("End");
        threads_class1 c = new threads_class1();
        c.m1();




    }
}

class threads_class1
{
    void m1() throws Exception
    {
        System.out.println("Start");
        Thread.sleep(2000);
        System.out.println("End");
    }
    
}