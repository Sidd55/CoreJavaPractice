package Polymorphism;


class A{
	
	 int i=8;
	protected void display(){
		System.out.println("In A Display");
	}
}

class B extends A{
	
	int i=10;
//	void display(){
//		System.out.println("In B Display");
//	}
}

class C extends A{
	
	 public void display(){
		System.out.println("In C Display");
	}
}


public class OverridingMain {

	public static void main(String[] args) {
		
		//A a = new B();
		A a = new B();
		a.display();
		//System.out.println(a.i);
		System.out.println(a.i);
		
		
		
		A a1= new C();
		a1.display();
	
		

	}

}
