import java.io.File;
import java.io.FileReader;

public class p1
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader("demo.txt");
        int demo = fr.read();
        while (demo != -1)
        {
            System.out.print((char)demo);
            demo = fr.read();
        }
        System.out.println();
        //charFileReader cfr = new charFileReader();
        //cfr.read();

    }
}
class charFileReader
{
    void read() throws Exception
    {
        File f = new File("demo.txt");
        FileReader fr = new FileReader(f);
        char[] ch = new char[(int)f.length()];
        fr.read(ch);
        for (char c : ch) 
        {
            System.out.print(c);
        }
        System.out.println();
    }
}