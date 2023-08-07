package exception;

public class ExceptionNullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=null;
		char b=a.charAt(3);
		System.out.println(b);
	}

}
