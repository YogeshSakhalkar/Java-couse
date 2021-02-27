import java.util.ArrayList;
import java.util.TreeSet;

public class Demo {

	public static void main1(String[] args) {
		TreeSet t1 = new TreeSet();
		t1.add(20);
		t1.add(10);
		t1.add(30);
		System.out.println(t1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList a1 = new ArrayList();
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Yogesh");
		a1.add("Nihaab");
		//a1.add(20);
		
		for (int i = 0; i < a1.size(); i++) {
			
			String str=(String)a1.get(i);
			System.out.println(str.length());
		}
		
		System.out.println(a1);
	}

}
