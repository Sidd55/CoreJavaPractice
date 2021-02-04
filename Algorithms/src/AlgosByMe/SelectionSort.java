package AlgosByMe;

public class SelectionSort {
	
	static void selectSort(int arr[]){
		
		int temp, min, index;
		
		int length = arr.length;
		
		for(int i = 0; i < length-1;i++){
			
			min = arr[i];
			index = i;
			
			for(int j = i + 1; j < length;j++){
				
				if(min > arr[j]){
					min = arr[j];
					index = j;
				}
			}
			
			temp = arr[i];
			
			arr[i] = arr[index];
			
			arr[index] = temp;
			
		}
		
		for(int i : arr){
		System.out.println(i);
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {38,23,21,89,46};
		selectSort(arr);
		
	}

}
