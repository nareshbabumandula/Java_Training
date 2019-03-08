package control.statements;

public class DoWhileTest {
	
	public void dowhileExample()
	{
		int i =1;
		
		do {
			System.out.println("Value is : " + i);
			i++;
			if(i==4)
			{
				break;
			}
		} while (i<10);
		
		
	}

	public static void main(String[] args) {
		DoWhileTest  dw = new DoWhileTest();
		dw.dowhileExample();

	}

}
