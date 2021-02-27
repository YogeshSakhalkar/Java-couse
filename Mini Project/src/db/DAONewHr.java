/*package db;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.AddHr;




public class DAONewHr {

	static ArrayList<AddHr> list;
	static {
		list = new ArrayList<AddHr>();
	}
	public boolean insert(AddHr ah1) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Workplace\\HR");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			

			list.add(ah1);
			oos.writeObject(list);
	
			System.out.println(list);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return false;
	}

	public AddHr validate(AddHr h1) {
		// TODO Auto-generated method stub
		int flag=0;
		try {
		FileInputStream fis = new FileInputStream("D:\\Workplace\\HR");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList <AddHr> ah1 = (ArrayList)ois.readObject();
		if(ah1.contains(h1)) {
			flag=1;
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(flag==1) {
			return h1;
		}
		else
		{
			return null;
		}
	}



}*/
