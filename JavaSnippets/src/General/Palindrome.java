package General;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "madakhbkjgm";
		
		String pal = "";
		
		
		
		for(int i = S.length()-1; i >=0;i--){
			
			pal = pal + S.charAt(i);
		}
		
		System.out.println(pal);
		
		if(S.equals(pal)){
			System.out.println("String are palindrome");
		}
		
		else{
			System.out.println("Not Palindrome");
		}

	}

}
