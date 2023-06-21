import java.util.*;

public class Vec 
{

    public static void main(String[] args)
    {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        System.out.println(v);
        System.out.println(v.capacity());
        Vector<Integer> v1 = new Vector<>(1, 6);
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v1.add(6);
        v1.add(7);
        v1.add(8);
        v1.add(9);
        v1.add(10);

        System.out.println(v1);
        System.out.println(v1.capacity());
        System.out.println(v1.elementAt(3));
        System.out.println(v.equals(v1));

        Vector<Integer> v2 = (Vector)v1.clone();
        System.out.println(v2);
        



    }
}