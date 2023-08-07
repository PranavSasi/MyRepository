package helloWorld;

import java.util.LinkedList;

public class LinkedListPollLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj=new LinkedList();
		obj.add(343);
		obj.add(24);
		obj.add("sad");
		System.out.println(obj.pollLast());
		System.out.println(obj);
	}

}
