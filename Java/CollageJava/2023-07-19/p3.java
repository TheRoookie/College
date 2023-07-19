//count file and dir seperatly



import java.io.*;



// public class p3 {
//     public static void main(String[] args) {
//         File f1 = new File("demo");
//         File[] ss = f1.listFiles();
//         int filecount=0;
//         int dircount=0;
//         for (File ls : ss) {
//             if (ls.isFile()) {
//                 filecount++;
//             }
//             else
//             {
//                 dircount++;
//             }
//         }
//         System.out.println("File : "+filecount);
//         System.out.println("Dir : "+dircount);
        


//     }
// }


//Alternate--

public class p3 {
    public static void main(String[] args)
    {
        
        


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
}