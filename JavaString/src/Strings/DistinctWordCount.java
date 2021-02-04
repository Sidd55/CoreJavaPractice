package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DistinctWordCount {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
		      list.add("Gaurav");//Adding object in arraylist    
		      list.add("Siddharth");    
		      list.add("Gaurav");    
		      list.add("Tushar");
		      list.add("Gaurav");//Adding object in arraylist    
		      list.add("Siddharth");    
		      list.add("Gaurav");    
		      list.add("Tushar"); 
		      list.add("Ram");
			
			printDistinctCharsWithCount(list);
			
			
			Integer count = 0;
			Map<String,Integer> hm = new HashMap<>();
			
			for(int i = 0 ; i< list.size() ; i++ ){
				//i=0,1
			 count = 1;
				for(int j = 0 ; j < list.size() ; j++){
					
					if(i == j){
						
						count = count;
					}
					
					else{
						
						if(list.get(i).equals(list.get(j))){
							count++;
						}
						
					}
					
					
				}
				
				hm.put(list.get(i), count);
			}
			
			System.out.println(hm);
			
		}
		
		private static void printDistinctCharsWithCount(ArrayList<String> list) {
			Map<String, Integer> charsWithCountMap = new HashMap<>();

			// using Map merge method from Java 8
			for (String c : list)
				charsWithCountMap.merge(c, 1, Integer::sum);
			//charsWithCountMap.merge(c, 1, Integer::sum);
			System.out.println(charsWithCountMap);

		}
		
		
		
	}
