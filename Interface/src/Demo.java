interface shape{
	void draw();
	abstract double calArea();
	public double calPera();
}

class Circle implements shape{
	int radius;
	public Circle(int r) {
		this.radius=r;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("circle is drawn");
	}
	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}
	@Override
	public double calPera() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}
	
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shape s1;
		s1 = new Circle(10);
		s1.draw();
		System.out.println(s1.calArea());
		System.out.println(s1.calPera());
	}

}
