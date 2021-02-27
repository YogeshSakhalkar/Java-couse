package hibernateExample;

public class Student {

	int Studid;
	String StudName;
	public Student(int studid, String studName) {
		super();
		Studid = studid;
		StudName = studName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudid() {
		return Studid;
	}
	public void setStudid(int studid) {
		Studid = studid;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	
	
}
