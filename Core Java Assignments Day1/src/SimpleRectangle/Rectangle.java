package SimpleRectangle;

public class Rectangle {
	float length;
	float breadth;
	
	public Rectangle() {
		this.length=0;
		this.breadth=0;
	}
	
	public Rectangle(int l,int b) {
		this.length=l;
		this.breadth=b;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	public void calcArea() {
		System.out.println("Area is:"+(length*breadth));
	}
	public void display() {
		System.out.println("Length is:"+length);
		System.out.println("Breadth is:"+breadth);
		calcArea();
	}
}
