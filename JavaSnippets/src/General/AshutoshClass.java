package General;

public class AshutoshClass {
	
	
	
	static int function(int i){
		
		if(i!=0){
			
			return i + function(i-1);
		}
		
		else{
			
			return i;
		}
		
		//return i;
	}
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = function(5);
		
		System.out.println(k);
		
		
	}

}
