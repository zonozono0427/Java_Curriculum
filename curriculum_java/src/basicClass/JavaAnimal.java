package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaAnimal {

	public static void main(String[] args) {

		Dog D = new Dog();

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		D.name = "ポチ";
		System.out.println(D.name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		D.number = 1;
		System.out.println(D.number);

		// 犬の数を指定したコンストラクタを使用
		Dog dog = new Dog(5);
		System.out.println("引数付きコンストラクタからの犬の数: " + dog.number);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力する
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String formattedDateTime = now.format(formatter);
		System.out.println(formattedDateTime);

	}
}
