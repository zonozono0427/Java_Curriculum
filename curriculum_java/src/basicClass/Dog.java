package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String name;

	// Q2：フィールドに動物の数の変数を定義してください。
	int number;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。

	 public Dog() {
	        name = "犬"; // フィールドに直接代入
	        number = 0;  // デフォルト値
	    }

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int number) {
		name = "犬"; // フィールドに直接代入
		this.number = number; // フィールドに引数を代入

	}

}
