package sub3;

public class ForTest {
	public static void main(String[] args) {
		for(int i=0; i<10; i++)
		{
			System.out.println("i : " + i);
		}
		
		int sum = 0;
		for(int k=1; k<=10; k++)
		{
			sum += k;
		}
		
		System.out.println("1부터 10까지의 합 : " + sum);
		
		int total = 0;
		
		for(int i=1; i<=10; i++)
		{
			if(i % 2 == 1)
				continue;
			
			total += i;
		}
		
		System.out.println("짝수의 합 : " + total);
		
		for(int a=1; a<3; a++)
		{
			System.out.println("a : " + a);
			for(int b=1; b<=5; b++)
			{
				System.out.println("b : " + b);
			}
		}
		
		for(int x=2; x<=9; x++)
		{
			System.out.println(x + "단");
			for(int y =1; y<=9; y++)
			{
				
				int z = x * y;
				
				System.out.println(x + " x " + y + " = " + z);
			}
		}
		
		for(int start=10; start>0; start--)
		{
			
			for(int end=1; end <= start; end++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
