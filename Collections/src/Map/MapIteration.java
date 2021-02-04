package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> hashMap = new HashMap<String,String>();
		
		hashMap.put("One", "Siddharth");
		hashMap.put("Two", "Sam");
		hashMap.put("Three", "Ram");
		
		List<String> stud = new ArrayList<>();
		
		stud.add("Siddhartth");
		stud.add("Champ");
		stud.add("Rjjkop");
		
		
		Iterator<String> itStud = stud.iterator();
		
		
		
		for(Map.Entry<String, String> entry : hashMap.entrySet()){
			
			System.out.println("Key is "+entry.getKey()+ " And Value is "+entry.getValue());
			
		}
		
		Iterator<Map.Entry<String,String>> itrMap = hashMap.entrySet().iterator();
		while(itrMap.hasNext()){
			
			Map.Entry<String, String> entMap = itrMap.next();
			System.out.println("Key is "+entMap.getKey()+" Value is" +entMap.getValue());
		}

	}

}
