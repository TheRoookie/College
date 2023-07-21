//wap to merge data from all files present in /home/parthdb/Desktop/Temperory Files to output.txt

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FolderFileDataCopy 
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("/home/parthdb/Desktop/Temperory Files");
        FileWriter fw = new FileWriter("output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        File files[] = f.listFiles();
        for (File file : files)
        {
            if(file.isFile())
            {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while (line!=null) {
                    bw.write(line);
                    bw.newLine();
                    line = br.readLine();
                }
                br.close();
            }
        }

        bw.close();

        new displayFile("output.txt");
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