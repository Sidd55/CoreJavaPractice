package General;

public class MaxMinNumbers {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,6,7,1,8,9};
		
		// for maximum no
		int max = arr[0];
		
		for(int i = 0;i<arr.length;i++){
			
			if(max < arr[i]){
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		
		// for minimum number
		int min = arr[0];
		
		for(int i = 0;i<arr.length;i++){
			
			if(min > arr[i]){
				min = arr[i];
			}
		}
		
		System.out.println(min);

	}

}
