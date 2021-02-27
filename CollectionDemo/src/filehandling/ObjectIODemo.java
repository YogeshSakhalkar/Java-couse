package filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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
public class ObjectIODemo {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\\\Workplace\\\\ObjectTest");
			
			DataInputStream dis = new DataInputStream(fis);
			
			ObjectInputStream ois = new ObjectInputStream(dis);
			
			employee e1 =(employee)ois.readObject();
			System.out.println(e1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public static void main1(String[] args) {
	 try {
		FileOutputStream fos = new FileOutputStream("D:\\\\Workplace\\\\ObjectTest");
		
		DataOutputStream dos = new DataOutputStream(fos);
		
		ObjectOutputStream oos = new ObjectOutputStream(dos);
		
		oos.writeObject(new employee(101, "yogesh"));
		System.out.println("sucessfully added");
	} catch (Exception e) {
		// TODO Auto-genernated catch block
		e.printStackTrace();
	}
}
}
