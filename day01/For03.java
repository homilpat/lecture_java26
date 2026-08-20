import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		System.out.printf("[구구단 %d단]\n", num);
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++)  {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
		scan.close();
	}

}
