package helloWorld;

public class SampleInterfaceClass implements  SampleInterface{
	public void show() {
		System.out.println("Abc");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleInterfaceClass obj=new SampleInterfaceClass();
		obj.show();
	}

}