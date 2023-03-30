package assignment;

	public class RectangleTest {
	    public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(20, 40);
	        double area = rectangle.calculateArea();
	        System.out.println("Area = " + area);

	        rectangle.setLength(30);
	        rectangle.setBreadth(30);
	        double newArea = rectangle.calculateArea();
	        System.out.println("New area = " + newArea);
	    }
	}

