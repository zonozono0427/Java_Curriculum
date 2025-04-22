package mainPackage1_25;
/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/

import java.util.Scanner;

import processPackage1_25.Character;

public class MainGame extends Character {

    public MainGame(String name) {
        super(name);
    }

    public void showStatus() {
        System.out.println("こんにちは 「" + getName() + "」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + getHp());
        System.out.println("MP：" + getMp());
        System.out.println("攻撃力：" + getAttack());
        System.out.println("素早さ：" + getSpeed());
        System.out.println("防御力：" + getDefense());
        System.out.println("\nさあ冒険に出かけよう！");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("冒険者の名前を入力してください: ");
        String name = scanner.nextLine();

        MainGame adventurer = new MainGame(name);
        adventurer.showStatus();
    }
}