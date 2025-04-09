package exampl_1_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JapaneseFood {

	// フィールド変数
	private String country;
	private String description;
	private String category;
	private String currentDateTime;

	// コンストラクタ
	public JapaneseFood() {
		this.country = "ここは日本です！";
		this.description = "この寿司はうまい";
		this.category = "寿司は和食です";

		// 現在日時を取得してフォーマット
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		this.currentDateTime = now.format(formatter);
	}

	// 情報をコンソールに出力するメソッド
	public void displayDetails() {
		System.out.println("こんにちは！" + this.country);
		System.out.println(this.description);
		System.out.println(this.category);
		System.out.println("今の現在日時は" + this.currentDateTime + "です");
	}

}
