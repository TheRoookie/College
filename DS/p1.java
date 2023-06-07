import java.util.*;

public class p1
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base add : ");
        int ba = sc.nextInt();
        System.out.println("Row Index");
        int i = sc.nextInt();
        System.out.println("Collumn Index");
        int j = sc.nextInt();
        System.out.println("Size : ");
        int s = sc.nextInt();
        System.out.println("Lower row : ");
        int lr = sc.nextInt();
        System.out.println("Upper Row : ");
        int ur = sc.nextInt();
        System.out.println("Lower Collumn : ");
        int lc = sc.nextInt();
        System.out.println("Upper Collumn : ");
        int uc = sc.nextInt();
        System.out.println("Row Major : 1  || Column Major : 2");
        int res1 = sc.nextInt();

        int R = ur-lr+1;
        int C = uc-lc+1;
        





        if (res1==1) {

            int ansadd = ba + (s*(  ((i-lr)*C) + (j-lc) ) );
            System.out.println(ansadd);
            
        }
        else if(res1 == 2)
        {
            int ansadd = ba + (s*( (i-lr) + ((j-lc)*R) ) );
            System.out.println(ansadd);
        }
        else
        {
            System.out.println("What the fuck!!!");
        }




    }
}