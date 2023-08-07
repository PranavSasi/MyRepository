package exception;

public class ExceptionSample {

	public void add() {
		int a=10;
try {		int b=a/0;
		System.out.println(b);
	}
catch(Exception e){
System.out.println(e);	
}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionSample obj=new ExceptionSample();
		obj.add();

	}

}
