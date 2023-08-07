package helloWorld;

import java.util.ArrayList;

public class ArrListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Float> obj=new ArrayList<Float>();
		obj.add(2.4f);
		obj.add(2.7f);
		obj.add(3.4f);
		for(Float number:obj) {
			System.out.println(number);
		}

	}

}
