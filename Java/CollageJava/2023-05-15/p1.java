public class p1
{

    public static void main(String[] args)
    {
        System.out.println("1");
        int a = 10;
        int b =0;
        int c;
        System.out.println("2");
        try
        {
            System.out.println("3");
            //System.out.println(c);XXXXXXXXX
            c=a/b;
            System.out.println(c);
            System.out.println("4");


        }
        catch (ArithmeticException e)
        {
            // TODO: handle exception
            System.out.println("5");
            System.out.println(e);
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            //System.out.println(c);XXXXXXXXX
            System.out.println("6");

        }

        System.out.println("7");


    }


}
