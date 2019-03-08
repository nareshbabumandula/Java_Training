package basics;

public class StringBufferBuilderTest {


	public void StringBufferBuilderExample()
	{
		//String is immutable
		String s1 = "Example";
		String s2 = new String("Example");
		String s3 = "Example";
	

		StringBuffer demo1 = new StringBuffer("Hello") ;
		// The above object stored in heap and its value can be changed .
		demo1 =new StringBuffer("Bye");
		System.out.println(demo1);

	}


	public static void main(String[] args) {

		StringBufferBuilderTest sb = new StringBufferBuilderTest();
		sb.StringBufferBuilderExample();

	}

}
