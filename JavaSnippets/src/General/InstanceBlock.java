package General;

class ABC{
	
	{
		System.out.println("A");
	}
	static{
		System.out.println("B");
	}
	public ABC(){
		System.out.println("C");
	}

	
}

public class InstanceBlock  {
	
	
	public static void main(String[] args) {
		
		ABC a = new ABC();
		
		ABC d = new ABC();
		
	}

}
