package General;

class A{
	
	void sendMessage(){
		
		System.out.println("I am in A Class");
	}
}

class B extends A{
	
	void sendMessage(){
		
		System.out.println("I am in B Class");
	}
}

public class MainApp {
	
	public static int i =8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		i= i+2;
//		System.out.println("Incremented no is "+i);
		
		A a = new B();    // Upcasting
		
		a.sendMessage();
		
		B b = new B();
		
		b.sendMessage();
		
		B c = (B) new A();   // downcasting
		
	}

}
