import java.util.Scanner;

public class ResistorTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean correct;

		while (true) {
			correct = true;

			Resistor[] resistor = {
				ResistorLab.getRandomResistor(),
				ResistorLab.getRandomResistor(),
				ResistorLab.getRandomResistor(),
			};

			Tolerance tolerance = ToleranceLab.getRandomTolerance();

			System.out.printf("%s %s %s %s\n", resistor[0].getColor(), resistor[1].getColor(), resistor[2].getColor(), tolerance.getColor());

			System.out.print("Guess: ");
			
			String[] input = sc.nextLine().split(" ");
			
			for (int i = 0; i < 3; i++) {
				if (!(resistor[i].getValue() == Integer.parseInt(input[i]))) {
					correct = false;
					System.out.printf("The correct answer was %d %d %d %f%%\n\n", resistor[0].getValue(), resistor[1].getValue(), resistor[2].getValue(), tolerance.getValue());
				break;
				}
			}

			if ((tolerance.getValue() == Double.parseDouble(input[3])) && correct) 
				System.out.println("Correct!\n");
			else
				System.out.printf("The correct answer was %d %d %d %f%%\n\n", resistor[0].getValue(), resistor[1].getValue(), resistor[2].getValue(), tolerance.getValue());
		}
	}
}
