package app;

public interface DefalutMethodDemo {
 default void m1() {
	 System.out.println("hello this is Default method");
 }
 
 public static void main(String[] args) {
	 System.out.println("I am under static interface");

 }
}
