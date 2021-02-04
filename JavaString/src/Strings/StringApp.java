package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "I love my Country love my love";
		
		List<String> lString = new ArrayList<String>();
		
		String arr[] = S.split(" ");
		
		//S.s
		
		for ( String ss : arr) {
		    System.out.println(ss);
		    lString.add(ss);
		}
		
		System.out.println(lString);
		
		Map<String,Integer> mp = new HashMap<String,Integer>();
		
		for(String s : lString){
			
			mp.merge(s, 1, Integer::sum);
		}
		
		//Set<Map.Entry<String,Integer>>	set = mp.entrySet();
		String key ="";
		int value = 0;
		
		for(Map.Entry<String, Integer> tMap : mp.entrySet()){
			
			if(tMap.getValue() > value){
				value = tMap.getValue();
				key = tMap.getKey();
			}
		}
		
		System.out.println("The Frequent most word is "+key+" it repeated "+value+" times" );
		
		
		//System.out.println(mp);
		
		
//		for(int i = 0; i < lString.size(); i++){
//			
//			
//		}
//		
		

	}

}
