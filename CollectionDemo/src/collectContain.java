

import java.util.ArrayList;
import java.util.Collections;

public class collectContain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		
		a1.add(10);
		a1.add(2);
		a1.add(20);
		a1.add(1);
		
		if(a1.contains(99)) {
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		/*System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);*/
	}

}
