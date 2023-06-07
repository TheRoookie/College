/*Q-1 . > Ask user to enter 2 integer values using command line argumants ,
wap to handle array index out of bound execption , 
numberformat execption and arethematio ecception in following cases
case 1. if user enters less than 2 values it throws execpton
case2. if user enter values other then integer
case3. perfect value then check wether the second value is zero or not.throw execption
eg - n1/n2 and n2 is 0(zero)


this program is my own , this is not the exatct answer that was on board


*/

public class p2
{
    public static void main(String[] yo)
    {
        System.out.println("Start");
        
        

        try
        {
            try
            {
            int a = Integer.parseInt(yo[0]);
            int b = Integer.parseInt(yo[1]);
            try
            {
                int c = a/b;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            finally
            {
                System.out.println("Arithematic");
            }
            }
            catch(NumberFormatException e)
            {
                System.out.println(e);
            }
            finally
            {
                System.out.println("Format");
            }

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Array out of bound");
        }
        System.out.println("End");
        


        

        

    }
}

/*

public class p3
{
    public static void main(String[] yo)
    {
        System.out.println("Start");
        
        try
        {
            try
            {
                int a = Integer.parseInt(yo[0]);
                int b = Integer.parseInt(yo[1]);
                try
                {
                    int c = a/b;
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("End");

    }
}

 */