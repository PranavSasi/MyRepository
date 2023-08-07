package exception;

public class HowToCreateCustomeExceptionSample {
	void show(int a) throws LicenceException {
		if(a<18) {
			throw new LicenceException("Invalid"); 
		}
		else{
			System.out.println("valid");
		}
	}
	public static void main(String[] args) throws LicenceException {
		// TODO Auto-generated method stub
		HowToCreateCustomeExceptionSample obj=new HowToCreateCustomeExceptionSample();
		obj.show(10);
	}

}
