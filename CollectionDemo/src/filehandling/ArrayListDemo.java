package filehandling;

import java.io.*;
import java.util.ArrayList;

class employee implements Serializable{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "\n\n employee [id=" + id + ", name=" + name + "]";
	}
	
}

public class ArrayListDemo {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\\\Workplace\\\\EmpList");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList a1=(ArrayList) ois.readObject();
			
			System.out.println(a1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\\\Workplace\\\\EmpList");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			ArrayList  list = new ArrayList();
			list.add(new employee(202, "virat"));
			list.add(new employee(303, "rahul"));
			list.add(new employee(393,"sachin"));
			
			oos.writeObject(list);
			
			System.out.println("Data added Sucecessfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
