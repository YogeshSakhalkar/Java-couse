package p1;
class player{
	int jesry_no;
	String name;
	
	public player()
	{
		this.jesry_no=0;
		this.name="not given";
	}
	public player(int jesry_no, String name) {
		super();
		this.jesry_no = jesry_no;
		this.name = name;
	}
	public int getJesry_no() {
		return jesry_no;
	}
	public void setJesry_no(int jesry_no) {
		this.jesry_no = jesry_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void display()
	{
		System.out.println("Jersy no is : "+jesry_no);
		System.out.println("Player name is :"+name);
	}
}
class cricketer extends player{
	String team;
	int run;
	int wickets;
	
	public cricketer() {
		super();
		// TODO Auto-generated constructor stub
		this.team="not given";
		this.run=0;
		this.wickets=0;
	}
	public cricketer(int jesry_no, String name,String t,int r,int w) {
		super(jesry_no, name);
		// TODO Auto-generated constructor stub
		this.team=t;
		this.run=r;
		this.wickets=w;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	void display()
	{
		super.display();
		System.out.println("Team name is: "+team);
		System.out.println("Runs scored are: "+run);
		System.out.println("wickets taken are: "+wickets);
	}
}

class footballer extends player{
	String club;
	int no_of_goals;
	public footballer() {
		super();
		// TODO Auto-generated constructor stub
		this.club="Not given";
		this.no_of_goals=0;
	}
	public footballer(int jesry_no, String name, String club, int goals) {
		super(jesry_no, name);
		// TODO Auto-generated constructor stub
		this.club=club;
		this.no_of_goals=goals;
		
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public int getNo_of_goals() {
		return no_of_goals;
	}
	public void setNo_of_goals(int no_of_goals) {
		this.no_of_goals = no_of_goals;
	}
	void display()
	{
		super.display();
		System.out.println("Club name is: "+club);
		System.out.println("No of goals scored are:"+no_of_goals);
 	}
}

public class PlayerInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cricketer c1 = new cricketer(18,"virat","India",12000,2);
		c1.display();
		footballer f1 = new footballer(99,"ganguly","KKR",98);
		f1.display();
	}

}
