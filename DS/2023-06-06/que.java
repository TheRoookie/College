import java.util.Scanner;


public class que
{
    public static void main(String[] args)
    {
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Que size?");
        queue q;
        try
        {
            q = new queue(sc.nextInt());
            q.run(q);
        }
        catch(Exception e)
        {
            System.out.println("##########Error Trying all Again#############");
            main(args);
        }
        
        
        
        
        
        
        


    }
}


class queue
{
    void run(queue q)
    {
        Scanner sc = new Scanner(System.in);
        boolean nowat = true;
        System.out.println("\nIn or Out?");
        String restr = sc.next();
        char res = restr.charAt(0);
        if(res == 'o' || res == 'O')
        {
            nowat = false;
        }
        if(nowat)
        {
            System.out.println("Enter number to que : ");
            q.in(sc.nextInt());
            run(q);
            
        }
        else
        {
            q.del();
            run(q);
        }
    }
    
    
    int[] q;
    int f = -1 , r = -1 , n;

    queue(){}
    queue(int n)
    {
        q = new int[n];
        this.n = n;

    }
    void dis()
    {
        for (int i = f; i < r+1; i++) {
            System.out.print(q[i]+" : ");
        }
    }
    
    void in(int y)
    {
        if( r >= (n-1) )
        {
            System.out.println("Overflow");
        }
        else
        {
            r++;
            q[r] = y;
            if(f == -1 )
            {
                f=0;
            }
            dis();
        }
    }
    void del()
    {
        if(f == -1)
        {
            System.out.println("Underflow");
            return;
        }
        int y = q[f];

        if(f == r)
        {
            f = -1;
            r = -1;

        }
        else
        {
            f++;
        }
        System.out.println("Deleted : "+y);
        dis();
        

    }
}