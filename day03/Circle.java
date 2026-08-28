package classtest;

public class Circle {
	final static double PI = 3.141592;
	double radius;
	public Circle(double radius) {
		this.radius = radius; // radius는 위에 parameter로 받은 radius로 세팅
	}
	double getArea() {
		return PI*radius*radius;
	}
}
