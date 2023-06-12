//package JASH;

public class p1
{
    public static void main(String[] args) 
    {
        c1[] c = new c1[10];
        c[0] = new b();
        c[1] = new c1(6);
        c[2] = new c1(2);
        c[3] = new c1(8);
        c[4] = new c1(4);
        c[5] = new c1(8);

        // for (int i = 0; i < c.length; i++)
        // {
        //     c[i] = new c1();
        // }

        c[2].m1();



    }
}
class c1
{
    c1(){System.out.println("A");}
    c1(int a)
    {
        System.out.println(a);
    }
    void m1()
    {
        
    }
    
}
class b extends c1
{
    b()
    {
        System.out.println("B");
    }
}