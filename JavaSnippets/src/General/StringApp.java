package General;

public class StringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Mukesh";    // Pool Single Obj
		
		String s1 = new String("Mukesh");  // 2 Object , 1 in heap and other in Pool
		
		System.out.println(s==s1.intern());
		
		String rev = "";
		
		for(int i = s1.length()-1 ; i>=0; i--){
			
			rev += s1.charAt(i);
		}
		
		System.out.println(rev);
		
		StringBuilder sb= new StringBuilder();
		
		sb.append(rev);
		
		sb.reverse();
		
//		sb.at
//		
//		String revStr = sb.toString();
		
		
		
		
		System.out.println(sb);
	}

}
