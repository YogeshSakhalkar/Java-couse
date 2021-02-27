package DivisionException;

class Number {
	int first;
	int second;
	int res;
	
	
	public Number(int first, int second) {
		this.first = first;
		//setSecond(second);
		this.second=second;
	}

	public int getFirst() {
		return first;
	}


	public void setFirst(int first) {
		this.first = first;
	}


	public int getSecond() {
		return second;
	}
	
	public int add() 
	{
			res=first + second;
			return res;
	}
		
	public int sub() 
	{
			res=first - second;
			return res;
	}
	
	public int mul() {
			res=first * second;
			return res;
	}
		
	public void div(){
		
		if(second==0) 
		{	try 
			{
				throw new DivideByZeroException();
			}
			catch( DivideByZeroException e) 
			{
				System.out.println(e);
			}
		}
		else 
		{
				res = first / second;
				System.out.println("Division is:" +res);
		}
	}
}
