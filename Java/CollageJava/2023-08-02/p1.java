import java.util.*;

public class p1
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
        hm1.put(6, "F");

        System.out.println(hm1);

        Set s = hm1.entrySet();
        System.out.println(s);
        Iterator itr = s.iterator();
        while (itr.hasNext())
        {
            Map.Entry e = (Map.Entry) itr.next();
            System.out.println(e.getValue());
        }
        Set<Map.Entry<Integer,String>> set = hm1.entrySet();
        for (Map.Entry<Integer,String> entry : set)
        {
            System.out.println(entry.getKey()+" is " + entry.getValue() );
        }

    }
}
