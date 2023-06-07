//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.*;

public class IO
{
    public static void main(String[] args)// throws FileNotFoundException
    {
        System.out.println("Start");
        try
        {
            FileReader Fr = new FileReader("/home/parthdb/Desktop/College_Stuff/Java/file.txt");
            System.out.println("Flie Found!");
        }
        catch (FileNotFoundException e)
        {
            //TODO: handle exception
            //System.out.println(e);
            e.printStackTrace();

        }
        finally
        {
            System.out.println("End");
        }
        

    }
}
