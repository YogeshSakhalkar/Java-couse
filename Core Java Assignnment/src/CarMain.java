 class car{
	float speed;
	int noOfGears;

	 public car() {
		 this.speed=0;
		 this.noOfGears=0;
	 }
	public car(float speed, int noOfGears) {
		super();
		this.speed = speed;
		this.noOfGears = noOfGears;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public int getNoOfGears() {
		return noOfGears;
	}
	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}
	 void drive() {
		speed=100;
		noOfGears=8;
	}
	void display() {
		System.out.println("Top speed of car is: "+speed);
		System.out.println("No of gears are: "+noOfGears);
	}
}

 class SportsCar extends car{
	int AirBallonType;
	
	public SportsCar() {
		AirBallonType=0;
	}
	public SportsCar(float speed, int noOfGears, int air) {
		super(speed, noOfGears);
		// TODO Auto-generated constructor stub
		AirBallonType=air;
	}

	public int getAirBallonType() {
		return AirBallonType;
	}

	public void setAirBallonType(int airBallonType) {
		AirBallonType = airBallonType;
	}
	void display() {
		super.display();
		System.out.println("Air Ballon type are: "+AirBallonType);
	}
	
}
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1= new car();
		c1.drive();
		c1.display();
		SportsCar s1 = new SportsCar(325,6,4);
		s1.display();
		
	}

}

