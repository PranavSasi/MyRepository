package helloWorld;

public class JavaFinalVariable {
	final int a=5;
	public void show() {
		//a=7;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaFinalVariable obj=new JavaFinalVariable();
		obj.show();
		//System.out.println(obj.a);
	}

}
