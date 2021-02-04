package algos;

public class BubbleSort {
	
	static void bubbleSort(int arr[]){
		
		int len = arr.length;
		
		int temp;
		
		for(int i = 0 ; i< len-1;i++){
			
			for(int j=0; j< len - i -1 ; j++){
				
				if (arr[j] > arr[j+1]){
					
					temp = arr[j];
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
					
				}
			}
			
		}
		for(int i : arr)
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {38,23,21,89,46};
		bubbleSort(arr);

	}

}
