package sub1;

public class VariableTest {
	public static void main(String[] args) {
		int a= 1;
		int b= 2;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		a=3;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		final int num = 10;
//		num = 7;
		System.out.println(num);
	}
}
