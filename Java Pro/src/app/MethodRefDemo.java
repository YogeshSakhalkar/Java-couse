package app;

import java.util.function.BiFunction;

class Calc{
	static int mult(int a,int b) {
		return a*b;
	}
}
public class MethodRefDemo {

	public void m1() {
		//instance method ref
		System.out.println("Instance method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		MethodRefDemo meDemo = new MethodRefDemo();
		MyInterface myInterface = meDemo::m1;
		myInterface.display();
		*/
		BiFunction<Integer, Integer, Integer> obj = Calc::mult;
		int res = obj.apply(20,40);
		System.out.println("result is"+res);
	}

}
