import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// TODO Auto-generated method stub

	}
	public static void ninenine(Scanner scan) {
		for (int i = 1; i <= 9; i++)  {
			System.out.println("숫자를 입력하세요: ");
			int num = scan.nextInt();
			System.out.printf("[구구단 %d단]\n", num);
			System.out.printf("%d x %d = %d", num, i, num*i);
			
		}
	}
}
