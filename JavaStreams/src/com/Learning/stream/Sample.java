package com.Learning.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			int arr[] = {2,3,4,5,1,7,9};  //j
			
			//Arrays.sort(arr);
			
			//List<Integer> aa = Arrays.asList(arr).sort(c);;
			
			List<Integer> li =  new ArrayList<Integer>();
			for(int ar : arr){
				
				
				li.add(ar);
				
			}
			
			
			
			Collections.sort(li);
			
			int arrs[] = new int[li.size()];
			
			int s=-1;
			for(int i=0;i< li.size();i++){
				
				arrs[i] = li.get(i);
				
				
			}
			
			System.out.println(li);
			
			for(int a:arrs)
			System.out.println(a);
		
			
			int flag = 0;
						//0
			for(int i = arr[0]; i<=arr[arr.length-1]; i++){   //0123456789
				
				flag = 0;
				for(int j = 0; j<arr.length;j++){
					
					if(i == arr[j]){
						
						flag = 1;
					}
					
					
				}
				
				if(flag == 0){
					
					System.out.println(i);
				}
				
			}
			
//			int b = 0;
//			int a = 0;
//			for (a=1; a<arr.length ; a++){
//				
//				b=a-1;
//				
//				if(arr[a] - arr[b] == 1){
//					
//				}
//				else{
//					System.out.println(arr[b]+1);
//				}
//				
//			}
			
			
	}

}
