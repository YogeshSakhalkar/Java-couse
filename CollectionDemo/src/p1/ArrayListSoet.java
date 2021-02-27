package p1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSoet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		
		a1.add(10);
		a1.add(2);
		a1.add(20);
		a1.add(1);
		
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
	}

}
