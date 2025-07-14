package practiceUnit9;

public class Circle extends Shape{
	private double r;
	public Circle(double r) {
		super();
		this.r=r;
	}
	
	public double getArea() {
		return 2*Math.PI*Math.pow(r, 2);
	}
	
	public double getCircumference() {
		return 2*r*Math.PI;
	}
}
