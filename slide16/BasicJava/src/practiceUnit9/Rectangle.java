package practiceUnit9;

public class Rectangle extends Shape{
	public Rectangle(double w, double l) {
		super(w, l);
	}
	
	public double getArea() {
		return this.getHeight()*this.getWidth();
	}
	
	public double getPerimeter() {
		return 2*(this.getHeight()+this.getWidth());
	}
	
}
