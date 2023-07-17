package com.Queue.PriorityQueue.Comparable;

import java.util.PriorityQueue;
import java.util.Iterator;


public class PriorityQueueMainClass {

	public static void main(String[] args) {
		
		PriorityQueue<Student> studentQueue = new PriorityQueue<>();
		studentQueue.offer(new Student("name1", 6));
		studentQueue.offer(new Student("name2", 5));
		studentQueue.offer(new Student("name3", 2));
		
		Iterator<Student> it = studentQueue.iterator(); // Iterator to iterate through queue
		while(it.hasNext()) {
			// delete and display the first element of the queue 
			System.out.println(" The item of the queue : " + studentQueue.poll());
		}
		
	}
}
