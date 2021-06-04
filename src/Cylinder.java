
public class Cylinder implements C {
	double radius;
	double height;
	String color;
	
	public Cylinder(double r, double h, String c) {
		radius = r;
		height = h;
		color = c;
	}
	
	public double area() {
		return (2*PI*radius*height + 2*PI*radius*radius);
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	public double volume() {
		return PI*radius*radius*height;
	}
}
