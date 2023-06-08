import java.util.Scanner;



public class p1 {

    public static void main(String[] args)
    {
        que q = new que(5);
        
        
        q.CQIn(1);
        q.CQIn(1);
        q.CQIn(1);

        //q.CQueOut();
        
        q.dis();
        System.out.println();
    }
}
/*class runner
{
    void run()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("In or Out");
        char res = sc.nextLine().charAt(0);
        if(res == 'i' || res == 'I')
        {

        }

    }
}*/
class que
{
    int[] q;
    int f = -1 , r = -1 , n = 0;

    que(int n)
    {
        q = new int[n];
        this.n = n;
    }
    void CQIn(int y)
    {
        if((f==0 && r == n-1) || (f == r+1))//here we can use if(f==(r+1)%n){sout overflow}
        {
            System.out.println("Overflow");

        }
        else
        {
            if( r == n-1 && f > 0 )//this if else can be replacd by r=(r+1)%n;
            {
                r=0;
            }
            else
            {
                r++;
            }
            q[r] = y;
            if(f == -1)
            {
                f=0;
            }
        }
    }
    void CQueOut()
    {
        if( f == -1 )
        {
            System.out.println("Underflow");
        }
        else
        {
            
            if(f==r)
            {
                f = -1;
                r = -1;
            }
            else
            {
                if( f == n-1 )
                {
                    f=0;
                }
                else
                {
                    System.out.println("Deleted : "+q[f]);
                    q[f] = 0;
                    f++;
                }
            }
        }
        
    }
    
    
    
    
    
    
    void dis()
    {
        if(f == -1)
        {
            System.out.println("Empty");
        }
        else
        {
            /*Here an better alternative is
             * 
             * for (int i = f; i != r; i= (i+1)%n)
                {
                    System.out.println(q[i]+" : ");
                }
                System.out.println(q[r]);
             * 
             */
            
            if(f>r)
            {
                for (int i = f; i < q.length; i++)
                {
                    System.out.print(q[i] + " : ");

                }
                for(int i = 0 ; i <= r ; i++)
                {
                    System.out.print(q[i] + " : ");
                }
            }
            else
            {
                for (int i = f ; i <= r; i++)
                {
                    System.out.print(q[i] + " : ");
                }
            }


            



        }
    }
}