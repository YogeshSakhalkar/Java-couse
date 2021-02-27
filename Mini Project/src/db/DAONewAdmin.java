/*package db;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.AddAdmin;
import model.AddHr;
import model.AddSalesManager;

public class DAONewAdmin {

	public boolean insert(AddAdmin a1) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("D:\\\\Workplace\\\\Admin");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			
			
			ArrayList<AddAdmin> list = new ArrayList<AddAdmin>();
			
			list.add(a1);
			oos.writeObject(list);
	
			System.out.println(list);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return false;
	}


	public AddAdmin validate(AddAdmin aa1) {
		// TODO Auto-generated method stub
		int flag=0;
		try {
		FileInputStream fis = new FileInputStream("D:\\Workplace\\Admin");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<AddAdmin> a1 = (ArrayList)ois.readObject();
		if(a1.contains(aa1)) {
			flag=1;
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(flag==1) {
			return aa1;
		}
		else
		{
			return null;
		}
	}

}*/
