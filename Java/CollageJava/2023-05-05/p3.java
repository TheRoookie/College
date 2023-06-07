
class A
{
    void m0()
    {
        System.out.println("m0 in A");
    }
    
}



interface I1
{
    void m1();
    
    
}
interface I2 extends I1
{
    void m2();
}
class C extends A  implements I1
{
    public void m1()
    {
        System.out.println("m1 in C");
    }
    /*public void m2() 
    {
        System.out.println("m1 in C");
    }*/


}

public class p3
{
    public static void main(String[] args)
    {
        System.out.println("Start");

        C c = new C();
        c.m0();
        c.m1();
        //c.m2();








        System.out.println("End");
    }
}