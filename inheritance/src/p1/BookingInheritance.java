package p1;
class Booking{
	String name;
	int phone;
	String email;
	double amount;
	
	public Booking() {
		this.name="Not given";
		this.phone=0;
		this.email="Not given";
		this.amount=0;
	}
	public Booking(String name, int phone, String email, double amount) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	void display() {
		System.out.println("Name is: "+name);
		System.out.println("Phone no is: "+phone);
		System.out.println("Email id is: "+email);
		System.out.println("Amount is: "+amount);
	}
}//booking ends here

class Bus_booking extends Booking{
	int no_of_seats;
	String start_place;
	String dest;
	
	public Bus_booking() {
		super();
		// TODO Auto-generated constructor stub
		this.no_of_seats=0;
		this.start_place="Not given";
		this.dest="Not given";
	}
	
	public Bus_booking(String name, int phone, String email, double amount, int seats, String s_place, String d_place) {
		super(name, phone, email, amount);
		// TODO Auto-generated constructor stub
		this.no_of_seats=seats;
		this.start_place=s_place;
		this.dest=d_place;
	}
	
	public int getNo_of_seats() {
		return no_of_seats;
	}
	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
	public String getStart_place() {
		return start_place;
	}
	public void setStart_place(String start_place) {
		this.start_place = start_place;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	void display(){
		super.display();
		System.out.println("Total no of seats are: "+no_of_seats);
		System.out.println("Starting point is: "+start_place);
		System.out.println("Destination is: "+dest);
	}
}//bus Booking ends here

class Hotel_Booking extends Booking{
	String hotel_name;
	int no_of_rooms;
	int check_in;
	int check_out;
	
	public Hotel_Booking() {
		super();
		// TODO Auto-generated constructor stub
		this.hotel_name="not given";
		this.no_of_rooms=0;
		this.check_in=0;
		this.check_out=0;
	}
	public Hotel_Booking(String name, int phone, String email, double amount, String hotel_n, int rooms,int checkin, int checkout) {
		super(name, phone, email, amount);
		// TODO Auto-generated constructor stub
		this.hotel_name=hotel_n;
		this.no_of_rooms=rooms;
		this.check_in=checkin;
		this.check_out=checkout;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public int getNo_of_rooms() {
		return no_of_rooms;
	}
	public void setNo_of_rooms(int no_of_rooms) {
		this.no_of_rooms = no_of_rooms;
	}
	public int getCheck_in() {
		return check_in;
	}
	public void setCheck_in(int check_in) {
		this.check_in = check_in;
	}
	public int getCheck_out() {
		return check_out;
	}
	public void setCheck_out(int check_out) {
		this.check_out = check_out;
	}
	
	void display() {
		super.display();
		System.out.println("Hotel name is: "+hotel_name);
		System.out.println("No of rooms are: "+no_of_rooms);
		System.out.println("check in date are: "+check_in);
		System.out.println("check out date are:"+check_out);
	}
}


public class BookingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Hotel_Booking h1 = new Hotel_Booking("Anish",2791098,"anishtalgaokar98@gamil.com",20000,"taj vinvanta",2,19/1/20,5/1/20);
			h1.display();
			Bus_booking b1 = new Bus_booking("samin",819627,"saminsayed67@gmail.com",3022,1,"margao","thane");
			b1.display();
	}

}
