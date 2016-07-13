
abstract class Instrument
{
	String name;
	abstract void play();
}

abstract class StringedInstrument extends Instrument
{
	int numberOfStrings;
	
}

class ElectricGuitar extends StringedInstrument
{
	void play()
	{
		name = "ElectricGuitar";
		numberOfStrings = 5;
		System.out.println("Playing with "+name + "with "+numberOfStrings+" strings");
		
	}
}

class ElectricBassGuitar extends StringedInstrument
{
	void play()
	{
		name = "ElectricBassGuitar";
		numberOfStrings = 10;
		System.out.println("Playing with "+name + "with "+numberOfStrings+" strings");
		
	}
}

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricGuitar eg = new ElectricGuitar();
		eg.play();
		
		ElectricBassGuitar ebg = new ElectricBassGuitar();
		ebg.play();

	}

}
