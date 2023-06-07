import java.util.*;

class p1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Disks??");
        int n = sc.nextInt();
        p1 p = new p1();
        p.TOH(n,'A','B','C');
        



    }

    void TOH(int n , char A , char B , char C)
    {
        if(n>0)
        {
            TOH(n-1,A,B,C);
            System.out.println("Move disk "+n+" From "+A+" to "+C);
            TOH(n-1,B,A,C);






        }
    }


}
