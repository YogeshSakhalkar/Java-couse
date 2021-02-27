package ExceptionRectangle;

public class Rectangle {
	float length;
	float width;
	int flag=0;
	public Rectangle() {
		this.length=1;
		this.width= 1;
	}
	public Rectangle(float length, float width) {
		super();
		setLength(length);
		setWidth(width);
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		try {
		if(length>0 && length<=20) 
		{
			this.length = length;
		}
		else
		{
			throw new IIlegalInputException();
		}}
		catch (IIlegalInputException e) {
			// TODO: handle exception
			System.out.println(e);
			flag=1;
		}
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		try {
		if(width>0 && width<=20)
		{
			this.width = width;
		}
		else
		{
			throw new IIlegalInputException();
		}}
		catch (IIlegalInputException e) {
			// TODO: handle exception
			System.out.println(e);
			flag=1;
		}
	}
	public double calcArea() {
		return length*width;
	}
	
	public double calcPeri() {
		return 2*(length+width);
	}
	public void display() {
		if (flag==1) {
			return;
		}
		else {
		System.out.println("Length is:"+length);
		System.out.println("Width is:"+width);
		System.out.println("Area is:"+calcArea());
		System.out.println("Perimeter is:"+calcPeri());
		}
	}
}
