/**
 w an app that searches thru its command line argument if an argument is found 
 */
public class argTracker
{

    public static void main(String[] args) throws Exception
    {
        
        if (args.length==0)
        {
            System.out.println("Write something!");
            
        }
        else
        {
            checkArg(args);
            System.out.println("Done!");
        }
        
    }
    public static void checkArg(String[] args)
    {
        for(String s : args)
        {
            if(!Character.isUpperCase(s.charAt(0)))
            {
                try
                {
                    throw new IllegalArgumentException("First letter not capital!");
                }
                catch(IllegalArgumentException e)
                {
                    
                    System.out.println(e);

                }
            }
        }
    }

}