import java.util.*;
import java.io.IOException;

public class p1
{

    public static void main(String[] args)
    {
        A a = new A();
        System.out.println("a is instance of A : " +  (a instanceof A)  );
        B ab = new B();
        System.out.println("a is object of A : " +  (a instanceof B)  );
        B b = new B();
        System.out.println("a is object of A : " +  (a instanceof B)  );
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        //System.out.print("\033[H\033[2J");
        Runtime.getRuntime().exec("cls");

        
    }
}

class A
{
    int x = 10;
    void m1()
    {
        System.out.println("yo");
    }

    
}

class B extends A
{

    int x = 20 ;
    void m1()
    {
        System.out.println("Jo");
    }
    
    






}