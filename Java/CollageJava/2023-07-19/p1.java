import java.io.File;

/**
 * p1
 */
public class p1 
{

    public static void main(String[] args) throws Exception
    {
        File f1 = new File("demo");
        f1.mkdir();
        File f2 = new File(f1,"d1.txt");
        f2.createNewFile();
        File f3 = new File(f1,"d2.txt");
        f3.createNewFile();
        File f5 = new File("/home/parthdb/Desktop");
        File[] f55 = f5.listFiles();
        for (File file : f55)
        {
            System.out.println(file);
        }

        

    }
}
class fileDemo
{
    File[] listFiles()
    {
        File[] ff = new File[10];
        for (File ff1 : ff) {
            
            System.out.println("List : "+ff1);
        }
        
        
        
        
        return ff;
    }
}