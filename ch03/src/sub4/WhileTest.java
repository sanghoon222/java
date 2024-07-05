package sub4;

public class WhileTest {
	public static void main(String[] args) {
		int sum = 0;
		int k = 1;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		int total = 0;
		int j =1;
		
		do {
			if(j % 2 ==0)
			{
				total += j;							
			}
	
			j++;
		}while(j<=10);
			
		System.out.println("1부터 10까지 짝수 합 : " + total);
		
		int num =1;
		
		while(true) {
			if(num % 5 == 0 && num % 7 == 0) {
				break;
			}
			
			num++;
		}
		
		System.out.println("5와 7의 chlthrhdqotn : " + num);
		
		int tot = 0;
		int i=0;
		
		while(i <= 10) {
			i++;
			
			if(i % 2 == 1) {
				continue;
			}
			
			tot += i;
		}
		
		System.out.println("1부터 10까지 짝수합 : " + tot);
	}
}
