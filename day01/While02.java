import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = 1;

		while (a == 1) {
		    System.out.print("숫자를 입력하세요: ");
		    int b = scan.nextInt();

		    if (b % 2 == 0) {
		        System.out.println(">> 짝수입니다.");
		    } else {
		        System.out.println(">> 홀수입니다.");
		    }

		    System.out.print("계속 하시겠습니까? (0-멈춤/1-계속): ");
		    a = scan.nextInt();
		}
		scan.close();
		

	}

}
