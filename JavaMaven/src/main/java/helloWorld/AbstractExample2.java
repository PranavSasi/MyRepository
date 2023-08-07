package helloWorld;

public class AbstractExample2 extends AbstractExample1{
	public void display() {
	System.out.println("SHNKDS");
	}
	public void show() {
		System.out.println("Abcd");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExample2 obj=new AbstractExample2();
		obj.display();
		obj.show();
		obj.add();
		obj.sub();
	}

}
