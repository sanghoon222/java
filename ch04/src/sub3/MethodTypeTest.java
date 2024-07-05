package sub3;

public class MethodTypeTest {
	public static void main(String[] args) {
		double t1 = type1(2.3);
		System.out.println("t1 : " + t1);
		type2(true);
		boolean t3 = type3();
		System.out.println("t3 : " + t3);
		type4();
		
	
		
	}
	
	public static double type1(double x) {
		double y = (x * x) * Math.PI;
		return y;
	}
	
	public static void type2(boolean status) {
		if(status) {
			System.out.println("참 입니다.");
		}
		else {
			System.out.println("거짓 입니다.");
		}
	}
	
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void type4() {
		double result = type1(5.0);
		System.out.println("반지름 길이가 5인 원의 넓이 : " + result);
	}
}
