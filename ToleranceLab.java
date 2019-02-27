import java.util.Random;

public class ToleranceLab {

	static Tolerance[] tolArray = {
		new Tolerance("Brown", 1),
		new Tolerance("Red", 2),
		new Tolerance("Green", 0.5),
		new Tolerance("Blue", 0.25),
		new Tolerance("Purple", 0.10),
		new Tolerance("Grey", 0.05),
		new Tolerance("Gold", 5),
		new Tolerance("Silver", 10)
	};

	public static Tolerance getRandomTolerance() {
		Random rand = new Random();
		return tolArray[rand.nextInt(tolArray.length)];
	}
}
