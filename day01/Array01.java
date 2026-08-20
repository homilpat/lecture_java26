
public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] gradeArr = { 90, 70, 80, 79, 82, 50, 70, 90, 89, 89 };
		int sum = 0;
		double avg = 0;
		for(int i =0; i<=9; i++ ) {
			sum+= gradeArr[i];
		}
		avg = sum/10;
		// 코드 추가

		System.out.println(">> 합계: " + sum);
		System.out.println(">> 평균: "+ avg);

	}

}
