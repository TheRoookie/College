//Demonstrate a program number or files and directory in a given directory.

import java.io.File;

public class p2
{
    public static void main(String[] args)
    {
        File f1 = new File("demo");
        String[] ss = f1.list();
        int count = 0 ;
        for (String s1 : ss) {
            count++;
            System.out.println(s1);
        }
        System.out.println(count);

    }
}
