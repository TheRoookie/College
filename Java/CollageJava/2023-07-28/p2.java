import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2 
{
    public static void main(String[] args) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter");
        String s = br.readLine();
        System.out.println(s);
    }
}
