package helloWorld;

public class SampleInterfaceChild implements SampleInterfaceParant1,SampleInterfaceParant2  {
	public void add() {
		System.out.println("Hello");
	}
		public void sub() {
			System.out.println("World");
		}
		public static void main(String args[]) {
			SampleInterfaceChild obj=new SampleInterfaceChild();
			obj.add();
			obj.sub();
		}
}
