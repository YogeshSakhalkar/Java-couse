package p1;
class picture{
	String name;
	float price;
	public picture() {
		this.name="Not given";
		this.price=0;
	}
	public picture(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	void display() {
		System.out.println("Picture name is: "+name);
		System.out.println("Picture cost is: "+price);
	}
}//picture ends here
class Photograph extends picture{
	String photographer;
	String camera;
	
	public Photograph() {
		super();
		// TODO Auto-generated constructor stub
		this.photographer="Not given";
		this.camera="Not given";
	}
	public Photograph(String name, float price, String photographer, String camera) {
		super(name, price);
		// TODO Auto-generated constructor stub
		this.photographer=photographer;
		this.camera=camera;
	}
	public String getPhotographer() {
		return photographer;
	}
	public void setPhotographer(String photographer) {
		this.photographer = photographer;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	void display() {
		super.display();
		System.out.println("Photographer name is: "+photographer);
		System.out.println("Camera name is: "+camera);
	}
}//photographer ends here

class Painting extends picture{
	String Artist_name;
	String Owner_name;
	
	public Painting() {
		super();
		// TODO Auto-generated constructor stub
		this.Artist_name="Not given";
		this.Owner_name="Not given";
	}
	public Painting(String name, float price, String A_name, String O_name) {
		super(name, price);
		// TODO Auto-generated constructor stub
		this.Artist_name=A_name;
		this.Owner_name=O_name;
	}
	public String getArtist_name() {
		return Artist_name;
	}
	public void setArtist_name(String artist_name) {
		Artist_name = artist_name;
	}
	public String getOwner_name() {
		return Owner_name;
	}
	public void setOwner_name(String owner_name) {
		Owner_name = owner_name;
	}
	void display() {
		super.display();
		System.out.println("Artist name are: "+Artist_name);
		System.out.println("Owner name is :"+Owner_name);
	}
}//painting ends here
public class PictureInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painting p1 = new Painting("Morden Art",67000,"pic","yogesh");
		p1.display();
		Photograph photo1 = new Photograph("Modelling",3200,"samin","Sony Alpha 600D");
		photo1.display();
	}

}
