package General;

class Emp{
	
	private Integer id;
	
	private String name;
	
	public void setId(Integer id){
		
		this.id = id;
	}
	
	public void setName(String name){
		
		this.name = name;
	}
	
	public Integer getId(){
		
		return this.id;
	}
	
	public String getString(){
		
		return this.name;
	}
	
}

public class EncapsulationApp {
	
	

	public static void main(String[] args) {
		
		Emp e = new Emp();
		
		e.setId(1);
		
		e.setId(2);
		
		System.out.println(e.getId());

	}

}
