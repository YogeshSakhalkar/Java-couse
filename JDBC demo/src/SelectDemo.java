import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3307/test";
			Connection con = DriverManager.getConnection(url,"root","root");
			
			Statement stmt = con.createStatement();
			ResultSet rs= stmt.executeQuery("select * from employee where id<101");
			//we need to use either if statement for 1 result
			//while loop to display all result
			//need to used rs.next eitherwise it will give error
			//sql exception error will come
			/*rs.next();
			 this will give error sql execption error;*/
			if(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
				//System.out.println(rs.getString(1));
				//System.out.println(rs.getString(2));
			}else {
				System.out.println("Result is empty");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
