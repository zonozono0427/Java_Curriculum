package curriculum_java.curriculum1_8;

public class Curriculum_A {
	public static void main(String[] args) {
		byte byteName;
		short shortName;
		int intName;
		long longName;
		float floatName;
		double doubleName;
		char charName;
		String stringName;
		boolean booleanName;

		
		// 初期値
		byteName = 0;
		shortName = 0;
		intName = 0;
		longName = 0L;
		floatName = 0.0f;
		doubleName = 0.0;
		charName = '\u0000';
		stringName = null;
		booleanName = false;

		//代入

		byteName = 10;
		shortName = 100;
		intName = 1000;
		longName = 10000L;
		floatName = 9.5f;
		doubleName = 10.5;
		charName = 'a';
		stringName = "ハロー";
		booleanName = true;

		System.out.println(byteName + shortName + intName + longName);

		System.out.println(floatName + doubleName);

		System.out.println(charName + stringName + booleanName);

		System.out.println(byteName + shortName + intName + longName + floatName + doubleName);

		System.out.println(byteName * shortName * intName * longName);

		System.out.println(doubleName / shortName);

		System.out.println(byteName - shortName);

		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));

		String fullname = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weigth = 62.2;
		String favorite = "寿司";

		System.out.println("初めまして" + fullname + "です");

		System.out.println("年齢は" + age + "歳です");

		System.out.println("身長は" + height + "cmです");

		System.out.println("体重は" + weigth + "㎏です");

		System.out.println("好きな食べ物は" + favorite + "です");
		double bmiHeight = height / 100;
		System.out.println("BMIは" + String.format("%.1f", (weigth / (bmiHeight * bmiHeight))) + "です");

		fullname = "鈴木一郎";
		age = 24;
		height = 168.5;
		weigth = 64.2;
		favorite = "オムライス";

		System.out.println("初めまして" + fullname + "です");

		System.out.println("年齢は" + age + "歳です");

		System.out.println("身長は" + height + "cmです");

		System.out.println("体重は" + weigth + "㎏です");

		System.out.println("好きな食べ物は" + favorite + "です");

		System.out.println("BMIは" + String.format("%.1f", (weigth / ((height / 100) * (height / 100)))) + "です");

		// 自己代入
		int age2 = age += age;
		double height2 = height += height;
		double weigth2 = weigth += weigth;

		System.out.println("初めまして" + fullname + "です");

		System.out.println("年齢は" + age2 + "歳です");

		System.out.println("身長は" + height2 + "cmです");

		System.out.println("体重は" + weigth2 + "㎏です");

		System.out.println("好きな食べ物は" + favorite + "です");

		System.out.println("BMIは" + String.format("%.2f", (weigth2 / ((height2 / 100) * (height2 / 100)))) + "です");

		// 問10
		age = 24;
		height = 168.5;
		weigth = 64.2;
		favorite = "オムライス";
		System.out.println(age >= 25);

		// 問11

		// 整数型を文字列型に変換処理
		String ageStr = Integer.toString(age);

		// 浮動小数点型を文字列型に変換処理
		String heightStr = Double.toString(height);

		// 浮動小数点型を文字列型に変換処理
		String weightStr = Double.toString(weigth);

		String result = "年齢: " + ageStr + " 歳, 身長: " + heightStr + " cm, 体重: " + weightStr + " kg";

		System.out.println(result);

		//問12

		int ageInt = Integer.parseInt(ageStr);
		int heightInt = (int) Double.parseDouble(heightStr); // 小数を切り捨てて整数に変換

		//問13
		// 条件式 ? trueの場合の戻り値 : falseの場合の戻り値
		// 12で変換した【年齢・身長】で【年齢が25もしくは
		// 身長が160以上】であればtrueを出力してください

		boolean b = (ageInt == 25 || heightInt >= 160) ? true : false;
		System.out.println(b);

	}

}
