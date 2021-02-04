package com.Learning.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		
		
		// Adding new Customers
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer(1,"Rohit",2500));  
        customerList.add(new Customer(2,"Shalini",3000));  
        customerList.add(new Customer(3,"Tushar",2800));  
        customerList.add(new Customer(4,"Aniruddha",2800));  
        customerList.add(new Customer(5,"Gaurav",500));
        customerList.add(new Customer(6,"Iravati",800));
        
      //  System.out.println(customerList);
        
        // Converting Product List into a Map  
        
       //Map<Integer,String> customerListMap = customerList.stream().collect(Collectors.toMap(p->p.id,p->p.name));
        Map m=customerList.stream().collect(Collectors.toMap(Customer::getId,Customer::getName));
        
        Map<Integer,String> map = new HashMap<>();
        
        for(Customer ch : customerList){
        	
        	map.put(ch.getId(), ch.getName());
        	
        }
        
        
        System.out.println(m);
        
        System.out.println(map);
        
       // System.out.println(customerListMap);
        
        
	}

}
