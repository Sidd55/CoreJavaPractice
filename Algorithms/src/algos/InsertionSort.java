package algos;

public class InsertionSort {
	
	static void insertionSort(int arr[]){
			
			int len = arr.length;
			
			int temp;
			
			for(int i = 1 ; i< len; i++){
				
				temp = arr[i];
				int j = i;
				
				while(j > 0 && arr[j-1] > temp){
					arr[j] = arr[j-1];
					j--;
				}
				arr[j] = temp;
				
			}
			for(int i : arr)
			System.out.println(i);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {38,23,21,89,46};
		insertionSort(arr);
	}

}
