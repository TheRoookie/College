import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class p4 {
    public static void main(String[] args) throws Exception
    {
        files f = new files();
        //f.write();
        f.read();


    }
}
class files
{
    void count()
    {
        File f1 = new File("demo");
        String[] ss = f1.list();
        int filecount=0;
        int dircount=0;
        for (String ls : ss) {
            File f0 = new File(f1, ls);
            if (f0.isFile()) {
                filecount++;
            }
            else
            {
                dircount++;
            }
        }
        System.out.println("File : "+filecount);
        System.out.println("Dir : "+dircount);
    }
    void write() throws Exception
    {
        FileWriter fw = new FileWriter("File1.txt",true); 
        
        //#OR
        
        // File f1 = new File("File1.txt");
        // f1.createNewFile();
        // FileWriter fw1 = new File1(f1,true);

        for(int i = 0 ; i<1000 ; i++)
        {
            fw.write("Fuck\n");
        }
        fw.flush();
        fw.close();
    }
    void read() throws Exception
    {
        File f = new File("File1.txt");
        FileReader fr = new FileReader(f);
        int i = fr.read();
        while (i!=-1) 
        {
            System.out.print((char)i);
            i = fr.read();
        }
        System.out.println();
    }
}
