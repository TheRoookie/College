import java.io.FileNotFoundException;
import java.io.FileReader;

public class IO_1
{
    public static void main(String[] args)// throws FileNotFoundException
    {
        System.out.println("Start");
        Read r = new Read();
        try
        {
            r.read();
        }
        catch(FileNotFoundException e)
        {
            // TODO: handle exception
            System.out.println("File Not Found");
            System.out.println("Execption Handled");
            
        }
        System.out.println("End");

    }
}
class Read
{
    void read() throws FileNotFoundException
    {
        System.out.println("Read Start");
        FileReader Fr = new FileReader("/home/parthdb/Desktop/College_Stuff/Java/file.txt");
        System.out.println("File Found!");
        System.out.println("Read End");
    }
}