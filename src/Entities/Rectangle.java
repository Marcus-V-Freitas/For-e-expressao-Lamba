package Entities;

public class Rectangle {

	private double Width;
	private double Height;
	
	public Rectangle(double W, double H) {
		Width=W;
		Height=H;
	}
	
	public Rectangle() {}
	
	public void SetValues(double W, double H) {
		Width=W;
		Height=H;
	}
	
	public double Area() {
		return Width*Height;
	}
	
	public double Perimeter() {
		return 2*(Width+Height);
	}
	
	public double Diagonal() {
		return Math.sqrt((Width*Width)+(Height*Height));
	}
	
	public String toString() {
		return "Area= "+ String.format("%.2f", Area()) + "  Perimeter= " +String.format("%.2f", Perimeter()) +"  Diagonal= "+String.format("%.2f", Diagonal());
	}
}
