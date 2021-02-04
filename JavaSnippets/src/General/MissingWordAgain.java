package General;

import java.util.ArrayList;
import java.util.List;

public class MissingWordAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sOne = "Hello I am Siddharth";
		String sTwo = "I am Siddharth";
		
		List<String> lone = new ArrayList<String>();
		
		List<String> ltwo = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		
		
		int index = 0;
		
		for(int i = 0 ; i<sOne.length(); i++){
			
			if(((sOne.charAt(i) == ' ') ||  (i == sOne.length()-1)) && (( i == sOne.length()-1) || (sOne.charAt(i+1)!=' '))){
				
				if(i == sOne.length()-1){
					
					lone.add(sOne.substring(index, i+1));
				}
				
				else{
					
					lone.add(sOne.substring(index, i));
					
				}
				
				index = i+1;
				
			}
		}
		
		
		int index1=0;
		for(int i = 0 ; i<sTwo.length(); i++){
			
			if((sTwo.charAt(i) == ' ' ||  i == sTwo.length()-1) && ( i == sTwo.length()-1 || sTwo.charAt(i+1)!=' ')){
				
				if(i == sTwo.length()-1){
					
					ltwo.add(sTwo.substring(index1, i+1));
				}
				
				else{
					
					ltwo.add(sTwo.substring(index1, i));
					
				}
				
				index1 = i+1;
				
			}
		}
		
		System.out.println(lone);
		System.out.println(ltwo);
		
		
		int flag = 0;
		for(int i = 0; i< lone.size();i++){
			
			flag = 0;
			for(int j = 0 ; j < ltwo.size();j++){
				
				
				if(lone.get(i).equals(ltwo.get(j))){
					
					flag = 1;
				}
				
			}
			
			if(flag == 0){
				result.add(lone.get(i));
			}
		}
		
		
		System.out.println(result);
		

	}

}
