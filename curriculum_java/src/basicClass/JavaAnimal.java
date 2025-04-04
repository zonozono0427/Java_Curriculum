package basicClass;

public class JavaAnimal {

	public static void main(String[] args) {
Dog dog1 = new Dog();
		dog1.displayInfo();

		Dog D = new Dog();

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		D.name = "ポチ";
		System.out.println(D.name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		D.number = 1;
		System.out.println(D.number);

		//
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

	}
}
