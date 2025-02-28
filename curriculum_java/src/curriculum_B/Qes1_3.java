package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// ログイン時の入力チェックシステムを下記条件で作成してください
		/**
		 * 【チェック項目】
		 * ・1. ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		 * ・2. ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		 * ・3. ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		 */

		// ・コンソールにユーザー名を入力できるようにしてください

		/**
		 * ==============
		 * 名前登録機能 |
		 * ==============
		 */

		// コンソールで入力できるメソッド
		Scanner sc = new Scanner(System.in);

		// 名前チェック用（半角英数字）
		String nameCheck = "^[A-Za-z0-9]+$";
		// 入力した名前を初期化
		String name = "";

		while (true) {
			// 名前入力
			name = sc.nextLine();
			// ユーザー名が10文字以上の場合エラー処理
			if (name.length() >= 10) {
				System.out.println("名前を10文字以内にしてください");

			// 0文字以下もしくはnullの場合エラー処理
			} else if (name.isEmpty() || Objects.isNull(name)) {
				System.out.println("名前を入力してください");

			// 半角英数字以外のエラー処理
			} else if (!name.trim().matches(nameCheck)) {
				System.out.println("半角英数字で入力してください");

			} else {
			// 正常処理
				System.out.println(name.trim() + "が登録されました");
				break;

			}

		}
		System.out.println("ユーザー名" + name.trim() + "を登録しました");

		/**
		 * ================
		 * じゃんけん処理 |
		 * ================
		 */

		/**
		 * ・0.グー 1.チョキ 2.パー（配列）
		 * ・じゃんけんの負け、勝ち処理
		 * ・じゃんけんの回数処理
		 */
		// じゃんけんの手を準備
		//                    0       1       2
		String[] hands = { "グー", "チョキ", "パー" };

		// ランダムメソッドをインスタンス化
		Random ran = new Random();

		// ランダムな数字を生成（0, 1, 2）
		int enemyHand = ran.nextInt(3);

		// じゃんけんの回数をカウントする変数
		int count = 0;
		
		while (true) {

			count++;

			int myHand = sc.nextInt();
			System.out.println(name + "の手は「" + hands[myHand] + "」");
			System.out.println("相手の手は「" + hands[enemyHand] + "」");

			// あいこの場合
			if (enemyHand == myHand) {
				System.out.println("DRAW あいこ もう一回しましょう！");

				// 自分の負け（グー）の場合
			} else if (enemyHand == 2 && myHand == 0) {
				System.out.println("負けは次につながるチャンスです！ネバーギブアップ！");

				// 自分の負け（チョキ）の場合
			} else if (enemyHand == 0 && myHand == 1) {
				System.out.println("たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ");

				// 自分の負け（パー）の場合
			} else if (enemyHand == 1 && myHand == 2) {
				System.out.println("なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです");

				// 自分が勝った場合
			} else {

				System.out.println("俺の勝ち！");

				break;
			}

		}
		System.out.println("勝つまでにかかった回数は" + count + "回です");
	}

}
