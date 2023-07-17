package com.Queue.PriorityQueue.Comparable;

public class Student implements Comparable<Student>{

	private int rank;
	private String name;
	
	public Student(String name, int rank) { // Constructor to set name and rank of Student
	
		this.name = name;
		this.rank = rank;
	}
	
	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(rank < st.rank) {
			return -1;
		}else if(rank > st.rank) {
			return 1;
		}
			
		return 0;
	}

	public String toString() {
		
		String result = " Student name : " + name + " , rank " + rank;
		return result;
	}
}
