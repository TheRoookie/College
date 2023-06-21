import java.util.ArrayList;
import java.util.Comparator;
import  java.util.Arrays;


public class arayList 
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(20);
        c.add(55);
        c.remove(1);
        //c.add("Fuck");
        c.add(1,4);
        c.add( null );
        System.out.println(c.get(3));
        System.out.println(c);
        System.out.println(c.lastIndexOf(20));
        c.sort(Comparator.naturalOrder());
        System.out.println(c);
        c.sort(Comparator.reverseOrder());
        
        System.out.println(c);
        System.out.println(c.size());
        c.sort(Comparator.nullsFirst(null));
        
    }
}