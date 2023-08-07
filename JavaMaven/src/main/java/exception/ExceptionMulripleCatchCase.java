package exception;

public class ExceptionMulripleCatchCase {
	public void add() {
		try {			int a=10;
	int b=a/0;
		System.out.println(b);
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);	
			}
		catch(ArithmeticException e){
			System.out.println(e);	
			}
		catch(NullPointerException e){
			System.out.println(e);	
			}
		//Because it is a "Checked Exception" it needs to be resolved before Running
		/*	catch(IOException e){
			System.out.println(e);	
			}*/
		catch(Exception e){
			System.out.println(e);	
		}}
	public static void main(String[] arg)
	{
		// TODO Auto-generated method stub
		ExceptionMulripleCatchCase obj=new ExceptionMulripleCatchCase();
		obj.add();
		System.out.println("End");
	}

}

