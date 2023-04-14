package labwork;

abstract class Shape{

	public void draw()
	{
		System.out.println("Draw method in shape class");
	}
	
	public abstract double calculateArea();
}

class Rectangle extends Shape
{	
	double length;
	double breadth;
	
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {		
		return length*breadth;
	}
}

class Circle extends Shape
{
   double radius;
       
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return 3.14*radius*radius;
	}
}

public class AbstractClassEg {
	public static void main(String[] args)
	{
		System.out.println("--------------------------");
		Rectangle rec=new Rectangle(5, 6);
		rec.draw();
		System.out.println("Area of rectangle is "+rec.calculateArea());
		System.out.println("------------------------------------");
	
		Circle cir=new Circle(5);
		cir.draw();
		System.out.println("Area of circle is "+cir.calculateArea());
		System.out.println("--------------------------");
	}
}
 

