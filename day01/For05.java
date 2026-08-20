import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("양의 숫자를 입력하세요: ");
		int num = scan.nextInt();
		while (num <= 0) {
		    System.out.print("양의 숫자가 아닙니다. 다시 입력하세요: ");
		    num = scan.nextInt();
		}
		int sum = 0;
		for (int i = 1; i <= num; i++) {
		    sum += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.%n",num, sum);
		scan.close();
	}
}
