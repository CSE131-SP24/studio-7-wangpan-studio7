package studio7;

public class Rectangle {
	private double width;
	private double length;
	private double areaRec;
	private boolean sizeRec;
	private boolean squareRec;
	//private double otherArea;

	public Rectangle(double w, double l) {
		width = w;
		length = l;
		areaRec = area();
		sizeRec = size(otherRectangle(5.0,5.0));
		squareRec = square();
	}
	
	public double otherRectangle(double a, double b) {
		double otherWidth = a;
		double otherLength = b;
		double otherArea = otherWidth * otherLength;
		return otherArea;
	}

	public double area() {
		double area = width * length;
		return area;
		//double perimeter  = (w*2) + (l*2);
	}

	public boolean size(Rectangle otherRec) {
		//otherArea = otherRec;
		if (this.area() >= otherRec.area()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean square() {
		if(width == length) {
			return true;
		} else {
			return false;
		}
	}


public static void main(String[] args) {
	Rectangle one = new Rectangle(5,6);
	
	System.out.println(one);
}
}

