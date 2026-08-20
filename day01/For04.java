import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요: ");
		int a = scan.nextInt();
		int result= 1;
		for(int i = a; i >= 1; i--) {
			result *= i;
		}
		System.out.printf("%d = %d", a,result);
		scan.close();
	}

}
