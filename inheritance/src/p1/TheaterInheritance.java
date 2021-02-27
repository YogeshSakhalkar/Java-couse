package p1;
class theater{
	String Theather_name;
	String Theather_location;
	String Show_name;
	int No_of_seats;
	public theater() {
		this.Theather_name="Not given";
		this.Theather_location="Not given";
		this.Show_name="Not given";
		this.No_of_seats=0;
	}
	public theater(String theather_name, String theather_location, String show_name, int no_of_seats) {
		super();
		Theather_name = theather_name;
		Theather_location = theather_location;
		Show_name = show_name;
		No_of_seats = no_of_seats;
	}
	public String getTheather_name() {
		return Theather_name;
	}
	public void setTheather_name(String theather_name) {
		Theather_name = theather_name;
	}
	public String getTheather_location() {
		return Theather_location;
	}
	public void setTheather_location(String theather_location) {
		Theather_location = theather_location;
	}
	public String getShow_name() {
		return Show_name;
	}
	public void setShow_name(String show_name) {
		Show_name = show_name;
	}
	public int getNo_of_seats() {
		return No_of_seats;
	}
	public void setNo_of_seats(int no_of_seats) {
		No_of_seats = no_of_seats;
	}
	void display() {
		System.out.println("Theater name is: "+Theather_name);
		System.out.println("Theater Location is: "+Theather_location);
		System.out.println("Show name is: "+Show_name);
		System.out.println("Total number of seats are: "+No_of_seats);
	}
}//theater ends here

class Movie_Theater extends theater{
	int No_of_projector_screen;
	int No_of_projector_room;
	
	public Movie_Theater() {
		super();
		// TODO Auto-generated constructor stub
		this.No_of_projector_screen=0;
		this.No_of_projector_room=0;
	}
	public Movie_Theater(String theather_name, String theather_location, String show_name, int no_of_seats, int no_of_projector_screen, int no_of_projector_room) {
		super(theather_name, theather_location, show_name, no_of_seats);
		// TODO Auto-generated constructor stub
		this.No_of_projector_screen=no_of_projector_screen;
		this.No_of_projector_room=no_of_projector_room;
	}
	public int getNo_of_projector_screen() {
		return No_of_projector_screen;
	}
	public void setNo_of_projector_screen(int no_of_projector_screen) {
		No_of_projector_screen = no_of_projector_screen;
	}
	public int getNo_of_projector_room() {
		return No_of_projector_room;
	}
	public void setNo_of_projector_room(int no_of_projector_room) {
		No_of_projector_room = no_of_projector_room;
	}
	void display() {
		super.display();
		System.out.println("Total no of screen are: "+No_of_projector_screen);
		System.out.println("Total no of projector room are: "+No_of_projector_room);
	}
}//movie ends here

class Drama_Theater extends theater{
	int No_of_Theater_stages;
	int No_of_Makeup_Artist;
	int No_of_Constume_designer;
	
	public Drama_Theater() {
		super();
		// TODO Auto-generated constructor stub
		this.No_of_Theater_stages=0;
		this.No_of_Makeup_Artist=0;
		this.No_of_Constume_designer=0;
	}
	public Drama_Theater(String theather_name, String theather_location, String show_name, int no_of_seats, int no_of_Theater_stages, int no_of_Makeup_Artist, int no_of_Constume_designer) {
		super(theather_name, theather_location, show_name, no_of_seats);
		// TODO Auto-generated constructor stub
		this.No_of_Theater_stages=no_of_Theater_stages;
		this.No_of_Makeup_Artist=no_of_Makeup_Artist;
		this.No_of_Constume_designer=no_of_Constume_designer;
	}
	public int getNo_of_Theater_stages() {
		return No_of_Theater_stages;
	}
	public void setNo_of_Theater_stages(int no_of_Theater_stages) {
		No_of_Theater_stages = no_of_Theater_stages;
	}
	public int getNo_of_Makeup_Artist() {
		return No_of_Makeup_Artist;
	}
	public void setNo_of_Makeup_Artist(int no_of_Makeup_Artist) {
		No_of_Makeup_Artist = no_of_Makeup_Artist;
	}
	public int getNo_of_Constume_designer() {
		return No_of_Constume_designer;
	}
	public void setNo_of_Constume_designer(int no_of_Constume_designer) {
		No_of_Constume_designer = no_of_Constume_designer;
	}
	void display() {
		super.display();
		System.out.println("Total no of stages are: "+No_of_Theater_stages);
		System.out.println("total no of costume designer are: "+No_of_Constume_designer);
		System.out.println("Total no of makeup artist are: "+No_of_Makeup_Artist);
	}
}

public class TheaterInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drama_Theater dt1 = new Drama_Theater("kala acadamy","mumbai","alexdender",70,2,5,3);
		dt1.display();
		Movie_Theater mt1 = new Movie_Theater("Inox","margao","pariksha",200,2,2);
		mt1.display();
	}

}
