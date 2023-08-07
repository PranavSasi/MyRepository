package helloWorld;

import java.util.ArrayList;

public class ArraListForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(45);
		obj.add(32);
		obj.add(23);
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
	}

}
