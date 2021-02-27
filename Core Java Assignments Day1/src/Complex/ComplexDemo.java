 package Complex;

public class ComplexDemo {
	float real;
	float imag;
	public ComplexDemo() {
		this.real=0;
		this.imag=0;
	}
	public ComplexDemo(float real, float imag) {
		super();
		this.real = real;
		this.imag = imag;
	}
	public float getReal() {
		return real;
	}
	public void setReal(float real) {
		this.real = real;
	}
	public float getImag() {
		return imag;
	}
	public void setImag(float imag) {
		this.imag = imag;
	}
	
	public ComplexDemo sub(ComplexDemo c) {
		ComplexDemo temp = new ComplexDemo();
		temp.real = this.real - c.real;
		temp.imag =  this.imag - c.imag;
		return temp;
	}
	
	public ComplexDemo add(ComplexDemo c) {
		ComplexDemo temp = new ComplexDemo();
		temp.real = this.real + c.real;
		temp.imag = this.imag + c.imag;
		return temp;
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("operation result are : a"+real+"+b"+imag);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexDemo c1 = new ComplexDemo(60,40);
		ComplexDemo c2 = new ComplexDemo(20,10);
		ComplexDemo c3= new ComplexDemo();
		
		c3=c1.add(c2);
		c3.display();
		
		c3= c1.sub(c2);
		c3.display();
	}

}
