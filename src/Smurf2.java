
public class Smurf2 
{
	
	public static void main(String[] args)
	{
		
		Smurf handy = new Smurf("Handy Smurf");
		System.out.println(handy.getName());
		handy.eat();
		
		Smurf papa = new Smurf("Papa Smurf");
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor("red"));
		System.out.println(papa.isGirlOrBoy("boy"));
		
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName());
		System.out.println(smurfette.getHatColor("white"));
		System.out.println(smurfette.isGirlOrBoy("girl"));
		
	}

}
