package exception;

public class ExeptionFinallySample {


	public void add() {
		int a=10;
try {		int b=a/0;
		System.out.println(b);
	}
finally{
System.out.println("ABC");	
}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExeptionFinallySample obj=new ExeptionFinallySample();
		obj.add();
		System.out.println("End");
	}

}
