import java.util.Random;

public class ResistorLab {

	static Resistor[] resArray = {
		new Resistor("Black", 0),
		new Resistor("Brown", 1),
		new Resistor("Red", 2),
		new Resistor("Orange", 3),
		new Resistor("Yellow", 4),
		new Resistor("Green", 5),
		new Resistor("Blue", 6),
		new Resistor("Purple", 7),
		new Resistor("Gray", 8),
		new Resistor("White", 9)
	};

	public static Resistor getRandomResistor() {
		Random rand = new Random();
		return resArray[rand.nextInt(10)];
	}
}
