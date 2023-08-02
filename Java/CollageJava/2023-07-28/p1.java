import java.io.RandomAccessFile;

public class p1 
{
    public static void main(String[] args) throws Exception
    {
        RandomAccessFile raf = new RandomAccessFile("abc.txt", "rw");
        // raf.writeInt(3);
        // raf.writeInt(4);
        // raf.writeInt(5);
        // raf.writeInt(6);
        // raf.writeInt(7);
        // raf.seek(0);
        // System.out.println(raf.readInt());
        // System.out.println(raf.readInt());
        // raf.seek(3);
        // System.out.println(raf.readInt());

        raf.setLength(0);
        raf.writeUTF("Hell");
        //raf.seek(0);
        //System.out.println(raf.read());
        System.out.println(raf.getFilePointer());
        raf.seek(0);
        System.out.println(raf.readUTF());
        System.out.println(raf.getFilePointer());

        
        
    }
}
