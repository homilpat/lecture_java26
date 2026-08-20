import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("세 개의 숫자를 입력하세요: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max = a;
		
		if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
        scan.close();
	}

}
