package hibernateExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class ConnectionFactory {

	public static Connection getConnection()
	{
		Connection retVal= null;
		try {
			
		FileInputStream fin = new FileInputStream("classname.txt");
		Scanner sc = new Scanner(fin);
		String classname=sc.nextLine();
		Class meta = Class.forName(classname);
		retVal=DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","root");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
}
