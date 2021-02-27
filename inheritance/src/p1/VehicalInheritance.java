package p1;

class vehical{
	String vehical_name;
	int wheels_size;
	String color;
	String fuel_Type;
	int seats;
	
	public vehical()
	{
		this.vehical_name="Not given";
		this.wheels_size=0;
		this.color="Not given";
		this.fuel_Type="Not given";
		this.seats=0;
	}
	
	public vehical(String vehical_name, int wheels_size, String color, String fuel_Type, int seats) {
		super();
		this.vehical_name = vehical_name;
		this.wheels_size = wheels_size;
		this.color = color;
		this.fuel_Type = fuel_Type;
		this.seats = seats;
	}
	
	public String getVehical_name() {
		return vehical_name;
	}
	public void setVehical_name(String vehical_name) {
		this.vehical_name = vehical_name;
	}
	public int getWheels_size() {
		return wheels_size;
	}
	public void setWheels_size(int wheels_size) {
		this.wheels_size = wheels_size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuel_Type() {
		return fuel_Type;
	}
	public void setFuel_Type(String fuel_Type) {
		this.fuel_Type = fuel_Type;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	void display() {
		System.out.println("Vehical name is: "+vehical_name);
		System.out.println("Wheel size in inches: "+wheels_size);
		System.out.println("color is: "+color);
		System.out.println("Fuel type is: "+fuel_Type);
		System.out.println("Total no of seats are:"+seats);
	}
}//vehical ends here

class car extends vehical{
	int no_of_doors;
	
	public car() {
		super();
		// TODO Auto-generated constructor stub
		this.no_of_doors=0;
	}

	public car(String vehical_name, int wheels_size, String color, String fuel_Type, int seats, int door) {
		super(vehical_name, wheels_size, color, fuel_Type, seats);
		// TODO Auto-generated constructor stub
		this.no_of_doors=door;
	}

	public int getNo_of_doors() {
		return no_of_doors;
	}

	public void setNo_of_doors(int no_of_doors) {
		this.no_of_doors = no_of_doors;
	}
	
	void display()
	{
		super.display();
		System.out.println("Total no of doors are: "+no_of_doors);
	}
}//car ends here

class Bike extends vehical{
	String type;
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
		this.type="Not given";
	}

	public Bike(String vehical_name, int wheels_size, String color, String fuel_Type, int seats, String t) {
		super(vehical_name, wheels_size, color, fuel_Type, seats);
		// TODO Auto-generated constructor stub
		this.type=t;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	void display()
	{
		super.display();
		System.out.println("bike type is :"+type);
	}
}
public class VehicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1 = new car("FORD Mustang",18,"White","Petrol",4,2);
		c1.display();
		Bike b1 = new Bike("Triumph Tiger XCX",17,"Green","petrol",2,"Touring Offroading");
		b1.display();
	}
	
}
