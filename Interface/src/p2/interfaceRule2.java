package p2;
interface inter1{
	void abc();
}
interface inter2 extends inter1 {
	void xyz();
}
class class1 implements inter2{

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("interface 1 in class1");
	}

	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		System.out.println("interface 2 in class 1");
	}

}
class class2 extends class1 implements inter1,inter2 {
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("interface 1 in class 2");
	}
}
class class3 extends class1 implements inter2{
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("interface 1 in class 3");
	}
	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		System.out.println("interface 2 in class 3");
	}
}
public class interfaceRule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 i1 = new class1();
		i1.abc();
		i1.xyz();
		System.out.println();
		
		
		class2 i2 = new class2();
		i2.abc();
		System.out.println();
		
		
		class3 i3 = new class3();
		i3.abc();
		i3.xyz();
		System.out.println();
	}

}


