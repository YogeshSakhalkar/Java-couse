package user;

public class check {
	int var1,var2;

	public check(int i, int j){
		// TODO Auto-generated constructor stub
		this.var1=i;
		
			try {
				if(this.var1<0) {
				throw new IIlegalValueEception();
				}
			} catch (IIlegalValueEception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
		this.var2=j;
		
			try {
				if(this.var2<0) {
				throw new IIlegalValueEception();
			}} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}
	
	boolean show() {

		if(var1<0) {
			System.out.println("var 1 is less than 0");
			return  false;
		}
		if(var2<0) {
			System.out.println("var 2 is less than 0");
			return false; 
		}
		return true;
	}
}
