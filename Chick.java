class Chick implements Animal 
{     
	private String myType;
	private String myType2;
	private String mySound;

	public Chick(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}
	public Chick(String type, String type2, String sound)
	{
		myType = type;
		mySound = sound;
	}
	public Chick()
	{
		myType = "unknown";
		mySound = "unknown";
	}
	public String getSound() 
	{
		return mySound;
	}
	public String getType()
	{
		return myType;
	}
}
