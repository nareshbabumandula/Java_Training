package collections;

import java.util.*;  

class HashMapTest{  
	public static void main(String args[]){  
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
		
		System.out.println("Initial list of elements: "+hm);  
		hm.put(100,"Amit");  
		System.out.println(hm.remove(100));
		hm.put(101,"Vijay");    
		hm.put(102,"Rahul");   
		hm.put(107,"Usha");
		hm.put(108,"Vijay"); 
		System.out.println(hm.values());
		System.out.println(hm.get(107));
		System.out.println(hm.keySet());
		System.out.println(hm.isEmpty());

		System.out.println("After invoking put() method ");  
		for(Map.Entry m:hm.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}  

		hm.putIfAbsent(103, "Gaurav");  
		System.out.println("After invoking putIfAbsent() method ");  
		for(Map.Entry m:hm.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}  
		HashMap<Integer,String> map=new HashMap<Integer,String>();  
		map.put(104,"Ravi");  
		map.putAll(hm);  
		System.out.println("After invoking putAll() method ");  
		for(Map.Entry m:map.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}  
	}  
}  