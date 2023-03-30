package assignment;

	public class Rectangle {
	    private double length;
	    private double breadth;

	    public Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    public double getLength() {
	        return length;
	    }

	    public double getBreadth() {
	        return breadth;
	    }

	    public void setLength(double length) {
	        this.length = length;
	    }

	    public void setBreadth(double breadth) {
	        this.breadth = breadth;
	    }

	    public double calculateArea() {
	        return length * breadth;
	    }
	}

	

