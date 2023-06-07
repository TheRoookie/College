





import java.util.*;;
public class p1
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        /*B a = (B)new A();     1***
        a.m1();
        //A.m1();
        //B.m1();*/

        A a = new B();
        a.m1();



    }
}


/*class A// extends B
{
    static void m1()
    {
        System.out.println("A");            1***
    }
    
}

class B extends A
{
    static void m1()
    {
        System.out.println("B");
    }
}*/


abstract class A
{
    int x;
    String s;
    
    /*public A()
    {
        System.out.println("Const  A");
        System.out.println(x);
    }*/

    

    abstract void m1();
    public A()
    {

    }
    public A(int x)
    {
        this.x = x;
    }
    
    public A(int x, String s)
    {
        this.x = x;
        this.s = s;
        
    }
    synchronized void dis()
    {
        System.out.println(x);
    }
}

class B extends A
{
    
    /*B()
    {
        System.out.println("Constr B");
        System.out.println(super.x);
        
    }*/
    
    B()
    {

    }
    B(int x , String s)
    {

    }

    void m1()
    {
        System.out.println("B m1");
        System.out.println(super.x+super.s);
    }


}

