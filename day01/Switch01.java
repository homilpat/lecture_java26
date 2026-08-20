import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요 ");
		int a = scan.nextInt();
		switch(a%2) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		default:
			System.out.println("홀수입니다.");
			break;
		}
		scan.close();
	}

}
