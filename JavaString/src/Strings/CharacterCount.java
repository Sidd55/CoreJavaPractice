package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "geeksforgeeks";
		
		Map<Character,Integer> mCount = new LinkedHashMap<>();
		
		int count = 0;
		
		for(int i = 0; i< str.length(); i++){
			
			count = 1;
			
			for(int j = 0; j< str.length(); j++){
				
				if(!(i == j)){
					
					if(str.charAt(i)==str.charAt(j)){
						count++;
					}
				}
				
			}
			
			//System.out.println("Char at "+str.charAt(i)+ "is repated "+count);
			
			mCount.put(str.charAt(i), count);
		}
		
		for(Map.Entry<Character, Integer> hp : mCount.entrySet()){
			
			System.out.println("Character "+hp.getKey()+" Its count is "+hp.getValue());
		}
		
		
//		Map<Character,Integer> mp = new LinkedHashMap<>();
//		
//		for(char c : str.toCharArray()){
//			
//			mp.merge(c,1,Integer::sum);
//		}
//		
//		for(Map.Entry<Character, Integer> hp : mp.entrySet()){
//			
//			System.out.println("Character "+hp.getKey()+" Its count is "+hp.getValue());
//		}

	}

}
