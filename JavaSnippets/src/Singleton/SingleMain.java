package Singleton;

public class SingleMain {

	public static void main(String[] args) {
		
		Single s = null;
		
		s= Single.createObject();
		
		System.out.println(s.x);
		
		Single s1 = null;
		
		s1 = Single.createObject();
		
		System.out.println(s1.x);
		
		System.out.println(s == s1);

	}

}
