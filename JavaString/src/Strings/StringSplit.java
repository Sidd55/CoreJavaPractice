package Strings;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My Name is Siddharth";
		
		String arr[] = s.split(" ");
		
		for(String a: arr){
			
			System.out.println(a);
			
		}
	}

}
