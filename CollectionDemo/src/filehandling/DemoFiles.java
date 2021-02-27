package filehandling;

import java.io.*;

public class DemoFiles {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\\\Workplace\\\\Test");
			
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Workplace\\Test");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeChars("FirstBit");
			System.out.println("file is created and Written");
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
