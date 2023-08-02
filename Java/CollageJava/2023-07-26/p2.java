import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class p2 
{
    public static void main(String[] args) throws IOException
    {
        RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
        //raf.setLength(0);
        String s = "Fuck U! Mother Fucker!";
        System.out.println(raf.getFilePointer());
        raf.write(s.getBytes());
        System.out.println(raf.getFilePointer());
        raf.seek(0);
        System.out.println(raf.getFilePointer());
        int i = raf.read();
        while (i!=-1) 
        {
            System.out.print((char)i+"");
            i = raf.read();
        }
        raf.seek(3);
        i = raf.read();
        System.out.println("At 7 ==> " + (char)i);


    }
}