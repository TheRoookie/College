import java.util.*;

public class p2 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> hm1 = new HashMap<>();
        System.out.println(hm1.put(1, "A"));
        System.out.println(hm1.put(1, "Z"));
        System.out.println(hm1.put(2, "B"));
        hm1.put(3, "C");
        hm1.put(4, "D");
        hm1.put(5, "E");
        hm1.put(6, "Fuck");

        // Hashtable<Integer, String> ht = Hashtable(hm1);
        hm1.remove(hm1);
        System.out.println(hm1);

        System.out.println(hm1.containsValue("Fuck"));
        String s = hm1.toString();
        System.out.println(s);

    }

}
