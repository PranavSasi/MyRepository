package helloWorld;

public class Agrigation2 {

String house;
int pin;
Agrigation obj;
Agrigation2(String house,int pin,Agrigation obj){
	this.house=house;
	this.pin=pin;
	this.obj=obj;
}
public void sub() {
	System.out.println(house+" "+pin);
	System.out.println(obj.name+" "+obj.age);
}
	public static void main(String[] args) {
		Agrigation obj2=new Agrigation("Uma",22);
		Agrigation2 obj3=new Agrigation2("ABC",62277,obj2);
		obj3.sub();
	
	}

}