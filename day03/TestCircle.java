package classtest;

import java.util.Scanner;
import classtest.Circle;
public class TestCircle {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArea();//멤버선언시, static 키워드 추가, 객체생성 없이 클래스명으로 접근 
		
	}
	
	public static void printArea() {
		Scanner scan = new Scanner(System.in);
		//원의 객체 생성 
		//Circle c = new Circle(radius);
		
		//원의 면적 계산하여 출력
		//double area = c.getArea();
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름 : ");
		double radius = sc.nextDouble();

		double area = radius * radius * Circle.PI;
		System.out.println("반지름이 "+radius+"인 원의 넓이는"+area+" 입니다.");
		System.out.printf("반지름이 %.1f인 원의 넓이는 %.2f 입니다.", radius, area);
	}

}
