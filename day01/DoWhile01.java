import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		int sum = 0;
		int num;

		do {
		    System.out.print("숫자를 입력하세요: ");
		    num = scan.nextInt();

		    sum += num;
		} while (num != 0);

		System.out.printf("지금까지 입력한 숫자의 합은 %d입니다.%n",sum);
		scan.close();
	}

}
