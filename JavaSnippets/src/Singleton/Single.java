package Singleton;

public class Single {
	
	int x = 10;
	
	static Single obj;
	
	private Single(){}
	
	static Single createObject(){
		
		if(obj == null)
		{
			obj = new Single();
			return obj;
		}
		
		else{
			
			return obj;
		}
	}

}
