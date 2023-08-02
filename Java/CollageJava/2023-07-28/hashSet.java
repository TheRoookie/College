import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) 
    {
        HashSet<Integer> hs1 = new HashSet<Integer>();//default is 16
        System.out.println(hs1.size());
        System.out.println(hs1.isEmpty());
        System.out.println(hs1.add(27));
        System.out.println(hs1.add(25));
        
        System.out.println("?".hashCode());

        HashSet<Integer> hs2 = new HashSet<Integer>();
        //hs2.addAll(hs1);
        System.out.println(hs2.add(7));
        System.out.println(hs2.add(3));
        System.out.println(hs1);
        System.out.println(hs2);
        System.out.println(hs1.hashCode());
        System.out.println(hs2.hashCode());
        System.out.println(hs1.equals(hs2));



    }
}
