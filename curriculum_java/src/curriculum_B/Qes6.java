package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {

		// コンソールで入力できるメソッド	
		Scanner sc = new Scanner(System.in);

		// ランダムな数字を生成（0～11）
		Random ran = new Random();

		// 商品を入力
		String str = "";

		str = sc.nextLine();

		String[] names = str.split("、");

		sc.close();

		// テレビの個数のランダム
		int tvStock = ran.nextInt(11);

		for (String name : names) {
			// ランダム個数(テレビディスプレイ以外）
			int remainingStock = ran.nextInt(11);

			switch (name) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + remainingStock + "です");
				break;

			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + remainingStock + "です");
				break;

			case "扇風機":
				System.out.println("扇風機の残り台数は" + remainingStock + "です");
				break;

			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + remainingStock + "です");
				break;

			case "加湿器":
				System.out.println("加湿器の残り台数は" + remainingStock + "です");
				break;

			case "テレビ":
				System.out.println("テレビの残り台数は" + (tvStock) + "です");
				break;

			case "ディスプレイ":
				System.out.println("ディスプレイの残り台数は" + (11 - tvStock) + "です");
				break;

			default:
				System.out.println("「" + name + "」は指定の商品ではありません");
				break;

			}

		}
	}

}