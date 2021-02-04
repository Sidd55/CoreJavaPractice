package General;

public class ReverseCompliment {
	
	static void compliment(StringBuilder st){
		
		for(int i=0;i<st.length();i++){
			
			if(st.charAt(i) == 'A'){
				st.setCharAt(i, 'T');
			}
			
			else if(st.charAt(i) == 'T'){
				st.setCharAt(i, 'A');
			}
			
			else if(st.charAt(i) == 'G'){
				st.setCharAt(i, 'C');
			}
			
			else if(st.charAt(i) == 'C'){
				st.setCharAt(i, 'G');
			}
		}
		
		String compStr = st.toString();
				
		
		System.out.println("Its Compliment is " +compStr);
		
		
	}

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("ATGTAGTAATTCG");
		
		System.out.println("String is "+sb);
		
		sb.reverse();
		
		
		System.out.println("Reverse is "+sb);
		
		compliment(sb);

	}

}
