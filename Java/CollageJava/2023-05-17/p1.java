//QB-99   



import java.util.Scanner;

public class p1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sub 1 marks : ");
        int m1 = sc.nextInt();
        System.out.println("Enter Sub 2 marks : ");
        int m2 = sc.nextInt();
        System.out.println("Enter Sub 3 marks : ");
        int m3 = sc.nextInt();
        System.out.println("Enter Sub 4 marks : ");
        int m4 = sc.nextInt();
        System.out.println("Enter Sub 5 marks : ");
        int m5 = sc.nextInt();

        
            //throw new fail();
            try
            {
                if(m1<35 || m2<35 || m3<35 || m4<35 || m5<35)
                {
                    throw new fail();
                }
                
            }
            catch(fail e)
            {
                // TODO: handle exception
                System.out.println("Failed!!");

            }
            finally
            {
                int tot = m1+m2+m3+m4+m5;
                double per = (double)tot/5;
                System.out.println("Total : "+tot);
                System.out.println("Percentage : "+per);
            }
        
        
        


    }
}

class fail extends RuntimeException
{
    fail()
    {
        super("Ur a piece of shit");
    }
    fail(String s)
    {
        super(s);
    }
    
}