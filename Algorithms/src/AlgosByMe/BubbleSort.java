package AlgosByMe;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,8,2,7,9,3};
		
		int temp;
		
		for(int i= 0;i< arr.length-1;i++){
			
			for(int j=0; j< arr.length-i-1; j++){
				
				if(arr[j] > arr[j+1]){
					
					temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
					
				}
			}
		}
		
		for(int i:arr)
		System.out.print(" "+i);

	}

}
