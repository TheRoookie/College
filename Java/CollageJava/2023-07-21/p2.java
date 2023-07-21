import java.io.*;

public class p2 
{
    public static void main(String[] args) throws Exception
    {
        FileWriter fw = new FileWriter("demo1.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(65);
        bw.newLine();
        bw.write("Haaaaaa...");
        bw.newLine();
        char[] ch = {'a','b','c','d','e','f','\n','\n'};
        bw.write(ch);
        
        bw.flush();


        FileReader fr = new FileReader("demo1.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line !=  null ) {
            System.out.print(line);
            line = br.readLine();
        }
        System.out.println();
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
    }
}