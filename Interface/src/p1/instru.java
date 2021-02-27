package p1;
interface Instrument {
	
	void play();
}

class Piano implements Instrument{

	String music;
	
	public Piano(String m) {
		this.music=m;
	}
	
	public void play() {
		
		System.out.println("Piano playing:"+music);
	}
	
}

class Flute implements Instrument{

	String music;
	public Flute(String m)
	{
		this.music=m;
	}
	public void play() {
	
		System.out.println("Flute playing:"+music);
	}
	
}

class Guitar implements Instrument
{
	String music;
	
	public Guitar(String music)
	{
		this.music=music;
	}
	public void play()
	{
		System.out.println("Guitar playing:" +music);
	}
}
public class instru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Instrument[] ins;
			ins=new Instrument[10];
			ins[0]=new Piano("tan tan tan");
			ins[1]=new Piano("tan tan tan");
			ins[2]=new Piano("tan tan tan");
			ins[3]=new Flute("toot toot toot");
			ins[4]=new Flute("toot toot toot");
			ins[5]=new Flute("toot toot toot");
			ins[6]=new Guitar("tin tin tin");
			ins[7]=new Guitar("tin tin tin");
			ins[8]=new Guitar("tin tin tin");
			ins[9]=new Guitar("tin tin tin");
			
			for(int i=0;i<ins.length;i++)
			{
				if(ins[i] instanceof Piano)
				{
			 		ins[i].play();
				}
				
				if(ins[i] instanceof Flute)
				{
					ins[i].play();
				}
				
				if(ins[i] instanceof Guitar)
				{
					ins[i].play();
				}
			}
	}
}
