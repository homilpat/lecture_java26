import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 선택 함수를 실행합니다. 
		while (true) {
			System.out.println("선택 함수를 실행합니다 (1,2,3,4 종료0)");
			int fc = scan.nextInt();
			if(fc == 0){
				break;
				
			} else if (fc == 1) {
			    first(scan);

			} else if (fc == 2) {
			    second(scan);

			} else if (fc == 3) {
			    third(scan);

			} else if (fc == 4) {
			    fourth(scan);

			} else {
			    System.out.println("잘못 입력했습니다.");
			}
			
		}
		scan.close();
		
	}
	public static void first(Scanner scan) {
		
		
		// TODO Auto-generated method stub
		System.out.print("직사각형의 가로 길이:");
		Double length = scan.nextDouble();
		System.out.print("직사각형의 세로 길이:");
		Double width = scan.nextDouble();
		System.out.println("직사각형의 넓이는"+length*width+"입니다");
		
	}
	public static void second(Scanner scan) {
		
		
		System.out.println("정수를 입력하세요: ");
		int a = scan.nextInt();
		if(a % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
	}
	
	public static void third(Scanner scan) {
		
		Double PI = 3.14;
		System.out.println("원의 반지름을 입력하세요(cm): ");
		Double rad = scan.nextDouble();
		System.out.printf("원의 넓이는 %.2fcm 입니다.",rad*rad*PI);
		
	}
	public static void fourth(Scanner scan) {
		
		System.out.println("금액 :");
		int price = scan.nextInt();
		
		int price500 =price/500;
		int d = price % 500;
		int price100 =d/100;
		
		System.out.println("동전의 수>");
		System.out.printf("500원짜리 = %d개\n",price500);
		System.out.printf("100원짜리 = %d개\n",price100);
}
 // 합수옆 Scanner scan 참고 함. 
}
