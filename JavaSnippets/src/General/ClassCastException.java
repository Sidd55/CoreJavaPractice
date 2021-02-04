package General;

class P{
	
	int i=10;
	
}

class Q extends P{
	
	int j=20;
	
}

class R extends Q{
	
	int c = 30;
	
	
	public static void main(String[] args) {
		
		Object x = new Float(10F);
		//Integer i=(Integer)x;
	     System.out.println((Double)x);
		
		P p = new R(); //
		Q q=(Q)p;
		R r = (R)q;
		
		
		
	}
}

public class ClassCastException {

}
