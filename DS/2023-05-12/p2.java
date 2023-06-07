import java.util.*;

class p2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("n???");
        int n = sc.nextInt();
        p2 p = new p2();
        p.get(n);
        System.out.println(i);
        
        
    }
    static int i = 0;
    void get(int n)
    {
        i++;
        if(n<1)
        {
            //i--;
            return;
        }

        get(n-1);
        get(n-3);
        //System.out.println(n);
        //System.out.println(i);
    }

}