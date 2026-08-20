import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int num = scan.nextInt();
		
		int[] scores = new int[num];
        int sum = 0;
        
		System.out.printf("%d 명의 성적 :",num);
		for (int i = 0; i < num; i++) {
            scores[i] = scan.nextInt();
            sum += scores[i];
        }

        int avg =  sum / num;

        System.out.println(">> 합계: " + sum);
        System.out.printf(">> 평균: %d", avg);

        scan.close();
	}
}
