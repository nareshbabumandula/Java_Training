package control.statements;

public class ForEachLoopTest {
	
	public void ForEachLoopExample()
	{
		String[] strNames = {"selenium","uft","testcomplete","ranorex","codedui","sikuli","autoit"}; 
		System.out.println(strNames.length);
		
		for (String name : strNames) {
			System.out.println(name);
		}
	}
	
	

	public static void main(String[] args) {
		ForEachLoopTest fl = new ForEachLoopTest();
		fl.ForEachLoopExample();

	}

}
