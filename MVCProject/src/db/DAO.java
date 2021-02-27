package db;

import model.User;

public class DAO {
	static User arr[];
	static int count;
	static {
		arr = new User[3];
		count=0;
	}
	public boolean insert(User obju) {
		// TODO Auto-generated method stub
		if(count<3) {
		arr[count] = obju;
		count++;
		return true;
		}
		else {
			return false;
		}
	}
	
	public User validate(User u1) {
		int flag=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(u1.getUsername().equals(arr[i].getUsername()) 
					&& u1.getPassword().equals(arr[i].getPassword())) 
			{
				u1.setCity(arr[i].getCity());
				 flag = 1;
				break;
			}
		}//for loop ends here
		
		if(flag==1) {
			return u1;
		}
		else
		{
			return null;
		}

		/*if(u1.getUsername().equals("vinayak") && u1.getPassword().equals("firstbit")) {
		u1.setCity("solapur");
		return u1;
	}
	else {
		return null;
	}*/
	
	}//validate ends here

}//class  DAO ends here
