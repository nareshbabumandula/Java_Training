package control.statements;

public class ForLoopTest {
	
	public void ForLoopExample()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("Iteration is : "+ i);
		}
	}
	
	

	public static void main(String[] args) {
		ForLoopTest fl = new ForLoopTest();
		fl.ForLoopExample();

	}

}
