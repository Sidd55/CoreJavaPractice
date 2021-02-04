package com.Learning.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class MapStreamComparatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> hm = new HashMap<>();
		
		hm.put("Siddharth", 59);
		hm.put("Bram", 34);
		hm.put("Gram", 95);
		hm.put("Rafle", 90);
		
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x-> lhm.put(x.getKey(), x.getValue()));
		
		for(Map.Entry<String, Integer> map : lhm.entrySet()){
			
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
		LinkedHashMap<String, Integer> desHmap = new LinkedHashMap<>();
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x-> desHmap.put(x.getKey(), x.getValue()));
		
		for(Map.Entry<String, Integer> map : desHmap.entrySet()){
			
			System.out.println(map.getKey()+" "+map.getValue());
		}

	}
	
	
	
	

}
