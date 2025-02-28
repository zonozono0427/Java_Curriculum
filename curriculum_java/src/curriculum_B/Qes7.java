package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		System.out.print("生徒の人数を入力して下さい。(2以上) : ");

		// コンソールで入力できるメソッド	
		Scanner sc1 = new Scanner(System.in);

		int numberStudents = sc1.nextInt();

		String[] subjects = { "英語", "数学", "理科", "社会" };

		int[][] scores = new int[numberStudents][subjects.length];

		for (int i = 0; i < numberStudents; i++) {
			for (int j = 0; j < subjects.length; j++) {

				System.out.print((i + 1) + "人目の『 " + subjects[j] + "』の点数を入力してください :");
				int score = sc1.nextInt();

				scores[i][j] = score;

			}
			System.out.println();

		}
		//一人の平均点
		for (int i = 0; i < numberStudents; i++) {
			double sum = 0d;

			for (int j = 0; j < subjects.length; j++) {

				sum += scores[i][j];

			}

			System.out.println((i + 1) + "人目のの平均点は" + String.format("%.2f", (sum / subjects.length)) + "点です。");

		}
		
		System.out.println();

		//教科平均値

		double total = 0d;
		for (int j = 0; j < subjects.length; j++) {
			double sum = 0d;

			for (int i = 0; i < numberStudents; i++) {

				sum += scores[i][j];
				total += scores[i][j];
			}

			System.out.println(subjects[j] + "の平均点は" + String.format("%.2f", (sum / numberStudents)) + "点です。");

		}

		//全体の平均点
		System.out.println("全体の平均点は" + String.format("%.2f", (total / (subjects.length * numberStudents))) + "点です。");

	}
}
