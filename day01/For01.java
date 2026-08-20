import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
		    sum += i;
		}

		System.out.printf(
		    "1부터 %d까지의 합은 %d입니다.%n",
		    num, sum
		);
	}

}
