// wap to write data from 2 files into a third file.(Merge)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class p3
{
    public static void main(String[] args) throws Exception
    {
        FileWriter fw = new FileWriter("c.txt");
        BufferedWriter bw  = new BufferedWriter(fw);

        FileReader fr1 = new FileReader("a.txt");
        BufferedReader br1 = new BufferedReader(fr1);

        FileReader fr2 = new FileReader("b.txt");
        BufferedReader br2 = new BufferedReader(fr2);

        String line1 = br1.readLine();
        String line2 = br2.readLine();

        while (line1 != null || line2 != null) 
        {
            if (line1!=null) {
                bw.write(line1);
                bw.newLine();
                line1 = br2.readLine();
            }
            if (line2!=null) {
                bw.write(line2);
                bw.newLine();
                line2 = br1.readLine();
            }
            
            
        }

        // while (line!=null)
        // {
        //     System.out.print(line);
        //     bw.write(line);
        //     bw.newLine();
        //     line = br2.readLine();
        // }

        bw.close();
        br1.close();
        br2.close();
        
        new displayFile("c.txt");

    }
}
class displayFile
{
    displayFile(String filePath) throws Exception
    {
        FileReader fr = new FileReader(filePath);
        int demo = fr.read();
        while (demo != -1)
        {
            System.out.print((char)demo);
            demo = fr.read();
        }
        System.out.println();
        fr.close();
    }
}