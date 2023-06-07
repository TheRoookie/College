import java.util.Scanner;

public class voter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age : ");
        int age = sc.nextInt();
        if (age<18)
        {
            try
            {
                throw new UnderAgeExecption();
            }catch (UnderAgeExecption e) {
                // TODO: handle exception
                //e.getMessage();
                System.out.println(e);


            }
        }
        else
        {
            System.out.println("Go fuck your self then!!");
        }


    }
}

class UnderAgeExecption extends RuntimeException
{
    UnderAgeExecption()
    {
        super("Ur a minor and can't vote , You little maget");
    }
    UnderAgeExecption(String s)
    {
        super(s);
    }
    
}