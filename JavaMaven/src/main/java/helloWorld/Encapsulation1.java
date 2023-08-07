package helloWorld;

public class Encapsulation1 {

	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		obj.setName("ABC");
		obj.setSalary(25000);
		System.out.println("Name: "+obj.getName());
		System.out.println("Salary: "+obj.getSalary());
	}

}