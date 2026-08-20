import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("숫자를 입력하세요: ");
			int num = scan.nextInt();
		    sum += num;
		}
		
		System.out.printf("5개 숫자의 합은 %d입니다", sum);
		scan.close();
	}

}
