package app;

import java.awt.List;
import java.util.ArrayList;

public class CollectionOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("mobile");
		list.add("laptop");
		list.add("yab");
		list.forEach((name)->System.out.println(name));
	}

}
