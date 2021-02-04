package AlgosByMe;

public class SelectionSortAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,8,1,5,7,6,9};
		
		int temp,index,min;
		
		for(int i =0;i<arr.length-1;i++){
			
			min = arr[i];
			index =i;
			for(int j=i+1;j<arr.length;j++){
				
				if(min > arr[j]){
					min = arr[j];
					index = j;
					
				}
			}
			
			temp = arr[i];
			
			arr[i] = arr[index];
			
			arr[index] = temp;
		}
		
		for(int i:arr)
		System.out.print(i);
	}

}
