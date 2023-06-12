import java.util.Scanner;



public class p1 {

    public static void main(String[] args)
    {
        que q_all = new que(5);

        
        
        
        q_all.CQIn(1,false);
        q_all.CQIn(2,false);
        q_all.CQIn(3,false);
        q_all.CQIn(4,false);
        q_all.CQIn(5,false);
        q_all.CQueOut();
        q_all.CQueOut();
        q_all.CQueOut();
        q_all.CQueOut();

        
        q_all.dis();
        

        
    }
}

class que
{
    int[] q_all;
    int[] q_even;
    int[] q_odd;

    int f = -1 , r = -1 , n = 0;
    int fe = -1 , re = -1 ,ne = 0;
    int fo = -1 , ro = -1 , no = 0;

    que(int n)
    {
        q_all = new int[n];
        q_even = new int[n];
        q_odd = new int[n];

        this.n = n;
    }
    void CQIn(int y , boolean state)
    {
        if(  ((fe==0 && re == n-1) || (fe == r+1) ) && state )//here we can use if(f==(r+1)%n){sout overflow}
        {
            System.out.println("Overflow Sub que Even");

        }
        if(  ((fo==0 && ro == n-1) || (fo == r+1) ) && state )//here we can use if(f==(r+1)%n){sout overflow}
        {
            System.out.println("Overflow Sub que Odd");

        }
        if( ((f==0 && r == n-1) || (f == r+1) ) && !state )//here we can use if(f==(r+1)%n){sout overflow}
        {
            System.out.println("Overflow");

        }
        else
        {
            if(!state)
            {
                if( r == n-1 && f > 0 )//this if else can be replacd by r=(r+1)%n;
                {
                    r=0;
                }
                else
                {
                    r++;
                    q_all[r] = y;
                }
                
                if(f == -1)
                {
                    f=0;
                }
            }
            if(state)
            {
                if(y%2==0)
                {
                    if( re == n-1 && fe > 0 )//this if else can be replacd by r=(r+1)%n;
                    {
                        re=0;
                    }
                    else
                    {
                        re++;
                        q_all[r] = y;
                    }
            
                    if(fe == -1)
                    {
                        fe=0;
                    }
                }
                else
                {
                    if( ro == n-1 && fo > 0 )//this if else can be replacd by r=(r+1)%n;
                    {
                        ro=0;
                    }
                    else
                    {
                        ro++;
                        q_all[r] = y;
                    }
            
                    if(fo == -1)
                    {
                        fo=0;
                    }
                }
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
                    System.out.println("Deleted : "+q_all[f]);
                    CQIn(q_all[f],true);
                    // if(q[f]%2==0)
                    // {
                    //     q_even.CQIn(q[f]);
                    // }
                    // else
                    // {
                    //     q_odd.CQIn(q[f]);
                    // }
                    //q_all[f] = 0;*****************************************************
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
                for (int i = f-1; i < q_all.length; i++)
                {
                    System.out.print(q_all[i] + " : ");

                }
                for(int i = 0 ; i <= r ; i++)
                {
                    System.out.print(q_all[i] + " : ");
                }
            }
            else
            {
                for (int i = f ; i <= r; i++)
                {
                    System.out.print(q_all[i] + " : ");
                }
                
            }
            System.out.println();


            



        }
        System.out.println("******EVEN*****");
        //dis even
        if(fe == -1)
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
            
            if(fe>re)
            {
                for (int i = fe-1; i < q_even.length; i++)
                {
                    System.out.print(q_even[i] + " : ");

                }
                for(int i = 0 ; i <= re ; i++)
                {
                    System.out.print(q_even[i] + " : ");
                }
            }
            else
            {
                for (int i = fe ; i <= re; i++)
                {
                    System.out.print(q_even[i] + " : ");
                }
                
            }
            System.out.println();

            



        }
        System.out.println("******ODD*****");
        //dis even
        if(fe == -1)
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
            
            if(fo>ro)
            {
                for (int i = fo-1; i < q_odd.length; i++)
                {
                    System.out.print(q_odd[i] + " : ");

                }
                for(int i = 0 ; i <= ro ; i++)
                {
                    System.out.print(q_odd[i] + " : ");
                }
            }
            else
            {
                for (int i = fo ; i <= ro; i++)
                {
                    System.out.print(q_odd[i] + " : ");
                }
                
            }
            System.out.println();


            



        }
    }
}