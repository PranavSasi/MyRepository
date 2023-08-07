package helloWorld;

import java.util.ArrayList;
import java.util.Collections;

public class ArraListForEachSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(45);
		obj.add(32);
		obj.add(23);
		Collections.sort(obj);
		for(Integer number:obj) {
			System.out.println(number);
		}
	}

}
