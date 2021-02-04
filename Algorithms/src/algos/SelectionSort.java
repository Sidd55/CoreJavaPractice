package algos;

public class SelectionSort {
	
	
	static void sel_sort(int a[])
	  {
	   
		  int index;
		  int min,temp;
		  
		   int n =a.length;    
	       for(int i=0;i<n-1;i++)
	        {
		         min=a[i];
				 index=i;	
				
		        for(int j=i+1;j<n;j++)
		        {
		         if(min > a[j])
		          {
		           min=a[j];
				   index=j;
		          }
		        }  
				   temp=a[i];
			        a[i]=a[index];
			        a[index]=temp;
	     }
	       
	       for(int i:a){
	    	   System.out.println(i);
	       }

	  }

	public static void main(String[] args) {
		
		
		  int a[]={45,89,21,44,55};
		  
		  sel_sort(a);
		 

	}
}