package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {

				String formatI = String.format("%02d", i);
				String formatJ = String.format("%02d", j);
				System.out.print(formatI + " * " + formatJ + " = " + (String.format("%02d", i * j) + "\t||\t"));
			}
			System.out.println();
		}

	}

}
