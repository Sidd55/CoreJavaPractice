package com.Learning.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class MainStreamApp {

	public static void main(String[] args) {
		
		Customer john = new Customer(1,"John P.",15);
		Customer sarah = new Customer(2,"Sarah J.",150);
		Customer shalini = new Customer(3,"Shalini S.",200);
		Customer chris = new Customer(4,"Chris N.",170);
		
		Customer tejas = new Customer();
		
		tejas.setName("Tejas S.");
		tejas.setPoints(156);
	
		
		List<Customer> customersList = Arrays.asList(john,sarah,shalini,chris,tejas);
		
		
		for(Customer customer: customersList)
		{
			System.out.println(customer.getName()+"=>"+customer.getPoints());
			
		}
		
		List<Integer> pointList = new ArrayList<Integer>();
		
		
		
	//======= Filtering Collection without using Streams ====================================
		for(Customer customer: customersList)
		{
			if(customer.getPoints()<100){
				pointList.add(customer.getPoints());
			}
		}
		
			System.out.println(pointList);	
			
	
		// ==== Filtering Collection using Streams ==============================
		    List<Integer> pointList2 = customersList.stream()
									.filter(c ->c.getPoints() > 100) // filtering as data
									.map(c -> c.getPoints())  // fetching points
									.collect(Collectors.toList());  // collecting as List
		
			System.out.println(pointList2);
			
			
			
		// ===============  Filtering and Iterating Collection ====================
			customersList.stream()
						.filter(c -> c.getPoints() > 150)
						.forEach(c -> System.out.println("\n id "+c.getId()+ " Name" +c.getName()));
						
	
	}

}
