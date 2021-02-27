package p1;

import java.util.Comparator;

public class MarkComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student s1 =(Student)o1;
		Student s2 = (Student)o2;
		
		if(s1.marks < s2.marks) {
			return -1;
		}else if(s2.marks < s1.marks){
			return 1;
		}else
		return 0;
	}

}
