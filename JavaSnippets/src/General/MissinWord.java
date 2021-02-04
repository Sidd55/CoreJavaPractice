package General;

import java.util.ArrayList;
import java.util.List;

public class MissinWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> res = new ArrayList<String>();
		
		String s1 = "My Full Name is Siddharth Shinde and";
		
		String s2 = "Name is Siddharth";
		
		res = missingWord(s1, s2);
		
		System.out.println(res);
		
		

	}
	
	static List<String> missingWord(String s1,String s2){
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		List<String> result = new ArrayList<String>();
		
		int index1 = 0;
		for(int i = 0; i < s1.length(); i++){
			
			if(((s1.charAt(i)==' ') || (i == s1.length()-1)) && ((i == s1.length()-1) ||(s1.charAt(i+1)!= ' ' )  ) ){
				
				if(i == s1.length()-1){
					list1.add(s1.substring(index1,i+1));
				}
				else{
				list1.add(s1.substring(index1,i));
				}
				index1= i+1;
				
			}
		}
		
		System.out.println(list1);
		
		int index2 = 0;
		for(int j = 0; j < s2.length(); j++){
			
			if(((s2.charAt(j)==' ') || (j == s2.length()-1)) && ((j == s2.length()-1) || (s2.charAt(j+1)!=' ')) ){
				
				if(j == s2.length()-1){
					list2.add(s2.substring(index2,j+1));
				}
				else{
				list2.add(s2.substring(index2,j));
				}
				index2 = j+1;
				
			}
		}
		System.out.println(list2);
		
		int flag = 0;
		
		for(int k = 0; k < list1.size(); k++){
			
			flag = 0;
			
			for(int m = 0; m< list2.size(); m++){
				
				if(list1.get(k).equals(list2.get(m))){
					
					flag = 1;
				}
				
				
			}
			
			
			if(flag == 0){
				result.add(list1.get(k));
			}
			
			
			
		}
		
		
		return result;
		
	}

}
