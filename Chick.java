class Chick implements Animal 
{     
	private String myType;
	private String mySound;
	private String mySound2;

	public Chick(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}
	public Chick(String type, String sound2, String sound)
	{
		myType = type;
		mySound = sound;
		mySound2 = sound2; 
	}
	public Chick()
	{
		myType = "unknown";
		mySound = "unknown";
	}
	public String getSound() 
	{
		if(Math.random()*2 < 1)
		{
			return mySound;
		}
		else
		{
			return mySound2;
		}
	}
	public String getType()
	{
		return myType;
	}
}
