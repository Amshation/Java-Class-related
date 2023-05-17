package class_related;

class A{
	int a;
	A(){
	{
		System.out.println("Mayank");
	}// instance block
	
	}
	A(int a){ // constructor overloading
		this.a=a;
		System.out.println(a);
	}
	
}
	

public class first {

	public static void main(String []arg) {
		
	A a1=new A();
	A a2=new A();
	A a3=new A(10);
	
		
		
	}
	
}
