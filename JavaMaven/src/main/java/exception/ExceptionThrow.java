package exception;

public class ExceptionThrow {
	public void age(int a) {
		if(a<18) {
			throw new ArithmeticException("Not Valid");
		}
		else {
			System.out.println("Valid");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionThrow obj=new ExceptionThrow();
		obj.age(16);
	}

}
