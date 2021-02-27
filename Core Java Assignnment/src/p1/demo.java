package p1;
abstract class Instrument {
	
	String music;
	
	public Instrument(String m) {
		
		this.music=m;
	}
	
	public String getTune() {
		return music;
	}

	public void setTune(String music) {
		this.music = music;
	}

	public abstract void play();

}

class Piano extends Instrument{
	
	
	Piano(String music)
	{
		super(music);
	}
	
	public void play()
	{
		System.out.println("Piano playing" +music);
	}
}

class Flute extends Instrument{
	
	
	
	public Flute(String music)
	{
		super(music);
	}
	
	public void play()
	{
		System.out.println("Flute playing" +music);
	}
}

class Guitar extends Instrument
{
	
	
	public Guitar(String music)
	{
		super(music);
	}
	public void play()
	{
		System.out.println("Guitar playing" +music);
	}
}
public class demo {

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
