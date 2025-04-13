package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaAnimal {

	public static void main(String[] args) {

		Dog D = new Dog();

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
	
		System.out.println(D.name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog D2 = new Dog(3);
		System.out.println(D2.number);

		
		// 変数に「犬」を代入するコンストラクタを作成
		
		Dog dog1 = new Dog();
	
		System.out.println("犬の名前: " + dog1.name);

		
		
		// 犬の数を指定したコンストラクタを使用
		Dog dog2 = new Dog(5);
		System.out.println("犬の数: " + dog2.number);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力する
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String formattedDateTime = now.format(formatter);
		System.out.println(formattedDateTime);

	}
}
