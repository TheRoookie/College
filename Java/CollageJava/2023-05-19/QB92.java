public class QB92
{
    public static int[] chkInt(String[] args)
    {
        int[] vec = new int[args.length];
        for (int i = 0 ; i<args.length ; i++)
        {
            try {
                vec[i] = Integer.parseInt(args[i]);
                //throw new NumberFormatException("Enter only integers");
            } catch (NumberFormatException e) {
                // TODO: handle exception
                try {
                    throw new NumberFormatException("Enter only integers");
                } catch (NumberFormatException ex) {
                    // TODO: handle exception
                    System.out.println(ex);
                }
            }
        }
        return vec;
    }
    public static int chkVal(int[] num)
    {
        int sum = 0;
        for (int i : num)
        {
            if (i<0) {
                try {
                    throw new IllegalArgumentException("Negetive value!");
                } catch (IllegalArgumentException e) {
                    // TODO: handle exception
                    System.out.println(e);
                }
                
            }
            else if(i%10==0)
            {
                try {
                    throw new IllegalArgumentException("Divisible by 10!");
                } catch (IllegalArgumentException e) {
                    // TODO: handle exception
                    System.out.println(e);
                }
            }
            else if(i>1000 && i<2000)
            {
                try {
                    throw new IllegalArgumentException("Number between 1000 and 2000 not allowed!");
                } catch (IllegalArgumentException e) {
                    // TODO: handle exception
                    System.out.println(e);
                }
            }
            else if(i>7000)
            {
                try {
                    throw new IllegalArgumentException("Greater then 7000 !");
                } catch (IllegalArgumentException e) {
                    // TODO: handle exception
                    System.out.println(e);
                }
            }
            else
            {
                sum+=i;
            }
            




            

        }
        return sum;
    }
    public static void main(String[] args)
    {
        int[] yo = chkInt(args);
        int sum = chkVal(yo);
        System.out.println("Done "+sum);
    }

}
