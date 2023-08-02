import java.util.PriorityQueue;

public class prioQue {
    public static void main(String[] args) throws Exception
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        // System.out.println(pq.peek());
        // System.out.println(pq.element());
        // System.out.println(pq.poll());
        // System.out.println(pq.remove());
        pq.add(98);
        pq.add(85);
        pq.add(88);
        pq.add(2);
        pq.add(4);//63
        pq.add(25);
        pq.add(37);
        pq.add(6);
        System.out.println(pq);


    }
}
