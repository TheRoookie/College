/*



interface I
{
    
    int x = 20;
    void m1();

    static void m2()
    {
        System.out.println("Inter I Static m2");
    }
    
    default void m3()
    {
        System.out.println("Inter I Default m3");
        m4();
    }

    private void m4()
    {
        System.out.println("Inter I privet m4");
    }


}

class B implements I
{

    public void m1()
    {
        System.out.println("Class B m1");
    }
    


}

class M
{
    M()
    {
        System.out.println("in Main Class");
        I i = new B();
        i.m1();
        I.m2();
        i.m3();
    }
    
}

public class p2
{
    public static void main(String[] args)
    {
        System.out.println("main");
        I interI = new B();
        interI.m1();
        I.m2();
        //interI.m2();
        interI.m3();

        M m = new M();
        
    }
}
*/