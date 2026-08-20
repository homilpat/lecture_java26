
public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num = 2; num<=9; num++) {
			System.out.printf("[구구단 %d단]\n", num);
			// TODO Auto-generated method stub
			for (int i = 1; i <= 9; i++)  {
				System.out.printf("%d x %d = %d\n", num, i, num*i);
			}
		}
	}

}
