package step1;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		
		int b_1 = Integer.parseInt(b.substring(0,1));
		int b_2 = Integer.parseInt(b.substring(1,2));
		int b_3 = Integer.parseInt(b.substring(2,3));
		
		System.out.println(a*b_3);
		System.out.println(a*b_2);
		System.out.println(a*b_1);
		System.out.println(a * Integer.parseInt(b));
		
		sc.close();
	}
}
