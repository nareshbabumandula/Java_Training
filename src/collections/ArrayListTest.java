package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {


	public void ArrayListExample()
	{
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		
		list.add(0, "naresh");
		System.out.println(list.get(0));
		list.add("Ravi");//Adding object in arraylist    
		list.add("Vijay");    
		list.add("Ravi"); 
		list.add("Vijay");
		list.add("Ajay"); 
		list.remove(0);
		//Invoking arraylist object   
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.isEmpty());
		//Notes: Arraylist accepts duplicate values
		Iterator names = list.iterator();
		
		while (names.hasNext()) {
			Object object = (Object) names.next();
			System.out.println(object);
		}
		
		
	}


	public static void main(String[] args) {

		ArrayListTest al = new ArrayListTest();
		al.ArrayListExample();
	}

}
