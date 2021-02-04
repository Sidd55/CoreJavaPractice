package Strings;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharCountJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "gaurav";
		
		int count,index;
		
		Map<Character,Integer> mp = new HashMap<>();
		
		for(int i= 0;i< word.length();i++){
			
			count =1;
			index = i;
			if(!(i==word.length()) && (!(i == index))){
			for(int j=i+1;j<word.length();j++){
				
				if(word.charAt(i) == word.charAt(j)){
					
					count ++;
					
					if(count>1){
						index = j;
					}
					
				}
			}
		}
			//mp.put(word.charAt(i), count);
			System.out.println(word.charAt(i)+"=> "+count);
		}
		
		//System.out.println(mp);
		
	}

}
