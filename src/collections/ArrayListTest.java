package collections;

import java.util.ArrayList;

public class ArrayListTest {


	public void ArrayListExample()
	{
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist    
		list.add("Vijay");    
		list.add("Ravi"); 
		list.add("Vijay");
		list.add("Ajay"); 
		list.remove(0);
		//Invoking arraylist object   
		System.out.println(list);
		System.out.println(list.get(0));
		//Notes: Arraylist accepts duplicate values
	}


	public static void main(String[] args) {

		ArrayListTest al = new ArrayListTest();
		al.ArrayListExample();
	}

}
