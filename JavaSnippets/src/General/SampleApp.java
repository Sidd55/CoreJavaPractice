package General;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee{
	
	private int id;
	
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class SampleApp {
	
	

	public static void main(String[] args) {
		
//		Integer i = 10;
//		Integer j = 10;
//		
//		System.out.println(i == j);
//		
//		System.out.println(i.equals(j));
//		
//		Integer k = new Integer(10);
//		
//		Integer l =  new Integer(10);
//		
//		System.out.println(k == l);
//		
//		System.out.println(k.equals(l));
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(1,"Sid"));
		list.add(new Employee(2,"Sam"));
		list.add(new Employee(3,"Chris"));
		list.add(new Employee(4,"Rob"));
		
		System.out.println(list);
		
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next().getName());
			list.remove(itr.next().getId());
		}

	}

}
