package helloWorld;

public class Book {

	String bookname;
	int price;
	Author obj;
	Book(String bookname,int price,Author obj){
		this.bookname=bookname;
		this.price=price;
		this.obj=obj;
	}
	
	public static void main(String[] args) {
		Author obj=new Author("Uma",53,"Chennai");
		Book obj2=new Book("I am become Death",700,obj);
		System.out.println("Book NAme: "+obj2.bookname);
		System.out.println("Book Price: "+obj2.price);
		System.out.println("Author Details");
		System.out.println("Author Name: "+obj2.obj.authorname);
		System.out.println("Author Age: "+obj2.obj.age);
		System.out.println("Author Place: "+obj2.obj.place);
	}

}