package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 20; j++) {

				String formatI = String.format("%03d", i);
				String formatJ = String.format("%03d", j);

				System.out.print(formatJ + " * " + formatI + " = " + (String.format("%03d", i * j) + "\t||\t"));
			}

			System.out.println();
		}

	}

}
