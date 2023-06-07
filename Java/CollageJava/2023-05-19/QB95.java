import java.util.Scanner;

public class QB95
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ExceptionDemo d = new ExceptionDemo();

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        d.compute(n);

    }
    
}

class ExceptionDemo
{
    public static void compute(int n)
    {
        if(n%7 == 0 && n%5 != 0 )
        {
            try {
                throw new MyException();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }

        }
        else
        {
            System.out.println("Good Boy...");
        }  

    }
}

class MyException extends RuntimeException
{
    MyException()
    {
        super("Fuck You!!!");
    }
    MyException(String yo)
    {
        super(yo);
    }
    
}