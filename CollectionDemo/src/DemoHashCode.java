import java.util.HashSet;

class Player{
	int jersy_number;
	String name;
	
	public Player(int jersy_number, String name) {
		super();
		this.jersy_number = jersy_number;
		this.name = name;
	}
	public int getJersy_number() {
		return jersy_number;
	}
	public void setJersy_number(int jersy_number) {
		this.jersy_number = jersy_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\n Player [jersy_number=" + jersy_number + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		System.out.println("In Player equals()");
		Player p1 = (Player)o;
		if(this.jersy_number == p1.jersy_number ) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		System.out.println("In hascode()");
		
		return this.jersy_number;
	}
	
	
}//class player class
public class DemoHashCode {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Player(10,"sachin"));
		hs.add(new Player(18, "Virat"));
		hs.add(new Player(7, "Dhoni"));
		hs.add(new Player(7, "Dhoni"));
		System.out.println(hs);
		
		/*if(hs.contains(new Player(19, "Virat"))) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}*/
		//duplication is not allowed
		//unordered and not sorted
		//hashset work on hashcode
		//it does'nt call equal
		//jdbc java database connectivity
		//1st we have use contains
		//2nd we have to override Hashcode
		//3ad we have to override equals to
		
	}
}
