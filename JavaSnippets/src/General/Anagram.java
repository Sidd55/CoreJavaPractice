package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li = new ArrayList<String>();
		
		
		String arr[] ={"back","akbc","bkca","same","ames","indf","find"};
		
		for(String c : arr){
			
			char d[] = c.toCharArray();
			Arrays.sort(d);
			String s = String.valueOf(d);
			li.add(s);
			
		}
		
		
		
//		for(String c : li)
//		System.out.println(c);
		
		List<String> newList = li.stream().distinct().collect(Collectors.toList());
		
//		for(String c : newList)
//			System.out.println(c);
//		
		List<String> resList = new ArrayList<String>();
		
		for(int i=0; i< newList.size(); i++){
			
			for(int j = 0; j< li.size(); j++){
				
				if(newList.get(i).equals(li.get(j))){
					resList.add(arr[j]);
					break;
				}
			}
		}
		
		for(String c : resList)
			System.out.println(c);
		
//		for(int i=0 ; i< arr.length; i++){
//			
//			li.add(Arrays.sort(arr[i].toCharArray()));
//		}
		
		
//		String S = "QQQQ";
//		
//		StringBuilder ss = new StringBuilder("PPPP"); 
//		ss.append(S);
//		
//		System.out.println(ss);
	
	}

}
