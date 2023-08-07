package helloWorld;

public class Abstraction1 extends Abstraction {
	public void show() {
		System.out.println("ABCD");
	}
	public static void main(String args[]) {
		Abstraction1 obj=new Abstraction1();
		obj.show();
	}
}