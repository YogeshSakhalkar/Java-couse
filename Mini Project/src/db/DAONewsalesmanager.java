/*package db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import model.AddSalesManager;


public class DAONewsalesmanager  {
	
	static ArrayList<AddSalesManager> list;
	static {
		list = new ArrayList<AddSalesManager>();
	}
	/*static AddSalesManager arr[];
	static int count;
	static {
		arr = new AddSalesManager[20];
		count=0;
	}
	public boolean insert(AddSalesManager a1) {
		// TODO Auto-generated method stub
		if(count<20) {
		arr[count]=a1;
		count++;
		return true;
		}else {
		return false;	
		}
	}
	
	public AddSalesManager validate(AddSalesManager s1) {
		// TODO Auto-generated method stub
		int flag=0;
		try {
		FileInputStream fis = new FileInputStream("D:\\Workplace\\SalesManager");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<AddSalesManager> a1 = (ArrayList)ois.readObject();
		if(a1.contains(s1)) {
			flag=1;

		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(flag==1) {
			return s1;
		}	
			return null;
	
		
	}

	public boolean insert(AddSalesManager s1) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("D:\\\\Workplace\\\\SalesManager");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			

			
			list.add(s1);
			oos.writeObject(list);
			System.out.println("Sucessfully added");
			System.out.println(list);
	
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return false;
	}

	public AddSalesManager verify(AddSalesManager s1) {
		// TODO Auto-generated method stub
		int flag=0;
		try {
			FileInputStream fis = new FileInputStream("D:\\\\Workplace\\\\SalesManager");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList<AddSalesManager> a1 = (ArrayList)ois.readObject();
			
			if(a1.contains(s1)) {
				int index = a1.indexOf(s1);
				AddSalesManager s2 = new AddSalesManager();
				s2=a1.get(index);
				s1.setId(s2.getId());
				s1.setName(s2.getName());
				s1.setSalary(s2.getSalary());
				s1.setIncentive(s2.getIncentive());
				s1.setTarget(s2.getTarget());
				flag=1;
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		if(flag==1) {
			return s1;
		}
		return null;
	}
	
	public AddSalesManager CalulateSalary(AddSalesManager s1) {
		// TODO Auto-generated method stub
		int flag=0;
		try {
			FileInputStream fis = new FileInputStream("D:\\\\Workplace\\\\SalesManager");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList<AddSalesManager> a1 = (ArrayList)ois.readObject();
			
			if(a1.contains(s1)) {
				int index = a1.indexOf(s1);
				AddSalesManager s2 = new AddSalesManager();
				s2=a1.get(index);
				s1.setId(s2.getId());
				s1.setName(s2.getName());
				s1.setSalary(s2.getSalary());
				s1.setIncentive(s2.getIncentive());
				flag=1;
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		if(flag==1) {
			return s1;
		}
		return null;
	}

	public AddSalesManager EditSM(AddSalesManager s1) {
		// TODO Auto-generated method stubint 
		int flag=0;
		try {
			FileInputStream fis = new FileInputStream("D:\\\\Workplace\\\\SalesManager");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList<AddSalesManager> a1 = (ArrayList)ois.readObject();
			
			if(a1.contains(s1)) {
				int index = a1.indexOf(s1);
				AddSalesManager s2 = new AddSalesManager();
				s2=a1.get(index);
				s1.setId(s2.getId());
				s1.setName(s2.getName());
				s1.setSalary(s2.getSalary());
				s1.setIncentive(s2.getIncentive());
				s1.setTarget(s2.getTarget());
				flag=1;
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		if(flag==1) {
			return s1;
		}
		return null;
	}
}
		/*int flag=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(a1.getId()==(arr[i].getId()) 
					&& a1.getName().equals(arr[i].getName())) 
			{
				 flag = 1;
				break;
			}
		}//for loop ends here
		
		if(flag==1) {
			return a1;
		}
		else
		{
			return null;
		}*/
		
		
	

