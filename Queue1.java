import java.util.*;
public class Queue1 {
    public static void main(String[] args){
        /* 
        Queue<Integer> q = new LinkedList<>(); 
            q.offer(12);
            q.offer(13);
            q.offer(90);
            System.out.println(q);
            System.out.println(q.poll());
            System.out.println(q);
            System.out.println(q.peek);
        */
        /* 
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(12);
        pq.offer(90);
        pq.offer(20);

        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.peek()+10);
        */
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offerFirst(14);
        adq.offerLast(56);
        adq.offer(20);
        System.out.println(adq);
        System.out.println(" peek first:"+ adq.peekFirst());

    }
    
}
