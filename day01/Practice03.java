import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int num = scan.nextInt();
		System.out.printf("[구구단 %d단]\n", num);

		
		ninenine(num);
		
		for (int dan = 2; dan <= 9; dan++) {
			System.out.printf("[구구단 %d단]\n",dan);
		    ninenine(dan);
		   }
		 scan.close();
		
		// TODO Auto-generated method stub

	}
	public static void ninenine(int num) {
		
		for (int i = 1; i <= 9; i++)  {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
			
		}
	}
}
