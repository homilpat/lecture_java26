import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요: ");
		int a = scan.nextInt();
		if (a >= 90) {
		    System.out.println("등급은 A입니다.");
		} else if (a >= 80) {
		    System.out.println("등급은 B입니다.");
		} else if (a >= 70) {
		    System.out.println("등급은 C입니다.");
		} else if (a >= 60) {
		    System.out.println("등급은 D입니다.");
		} else {
		    System.out.println("등급은 F입니다.");
		}
		scan.close();
	}

}
