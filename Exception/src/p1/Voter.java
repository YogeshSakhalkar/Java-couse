package p1;

public class Voter {
	
	int age;
	
	void ValidateAge() throws InvalidAgeException
	{
		if(this.age<18) 
		{
			
				throw new InvalidAgeException();
	
		}
		else
		{
			System.out.println("you can Vote..!");
		}
	}
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}


	public Voter(int i) {
		// TODO Auto-generated constructor stub
		this.age=i;
	}

}
