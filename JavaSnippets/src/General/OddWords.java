package General;

import java.util.Random;

public class OddWords {
	
		static String word = "";
		
		static int N = 7;
		
		static char s[] =new char[26];
		
		static int i = 0;

		public static void main(String[] args) {
			
			char ch;
			
			for (ch='a'; ch<='z'; ch++){
				s[i] = ch;
				if(i < 26){
				i++;
				}
			}
			
			System.out.println(giveResult());
					
		}
	
			static String giveResult(){
				
				Random myRandom = new Random(); 
				int index = myRandom.nextInt(s.length);
				
				int length = myRandom.nextInt(N);
				//String word = "";
				while(word.length() <=N)
				//if(word.length() <=N)
					{
				
					if(length % 2 != 0 && length <=N && index < 27){
						
						
						for(int m = 0 ; m < length ;m++){
						word = word + s[index];
						//length = N - length;
						//N = N - length;
						length = N - length;
						index = myRandom.nextInt(s.length);
						}
						
					
					}
					
					else{
						
						giveResult();
					}
					
					index = myRandom.nextInt(s.length);
					length = myRandom.nextInt(N);
					
				}
				
				return word;
				
				
			}

}
