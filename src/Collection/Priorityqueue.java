package Collection;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(30);
		pq.add(10);
		pq.add(80);
		pq.add(40);
		pq.add(5);
		
		System.out.println("Priority Queue: " + pq);
		
		System.out.println("Heap Element: " + pq.peek());
		
		System.out.println("Poll remove head :" + pq.poll());
		System.out.println("After removing Head: "+ pq);
		
		
		pq.remove(40);
		System.out.println("After removing 40: " + pq);
		
		System.out.println("Contains 20? "+pq.contains(20));
		
		System.out.println("Size: "+pq.size());
		
		System.out.println("Is Empty? "+pq.isEmpty());
		
		pq.clear();
		
		System.out.println("After Clear: "+pq);
		
		
		
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
		p.add(30);
		p.add(10);
		p.add(80);
		p.add(40);
		
		System.out.println("\nMax Heap:"+p);
		
		while(!p.isEmpty()) {
			System.out.println(p.poll());
		}
	}

}
