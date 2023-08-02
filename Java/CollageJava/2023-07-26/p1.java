import java.io.FileInputStream;
import java.io.FileOutputStream;

public class p1 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("cpimg.png");

        FileInputStream fis = new FileInputStream("/home/parthdb/Desktop/TemperoryFiles/scr.png");
        short i = (short)fis.read();

        while (i!=-1) 
        {
            System.out.print(i+" ");
            fos.write(i);
            i=(short)fis.read();
        }
        //  /home/parthdb/Desktop/TemperoryFiles



    }
}
