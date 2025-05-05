package package1_30;



//Personクラスの定義
class Person {
 // インスタンスフィールド
 String name;
 int age;
 double height;
 double weight;

 // クラス変数（人数をカウント）
 private static int count = 0;

 // コンストラクタ
 public Person(String name, int age, double height, double weight) {
     this.name = name;
     this.age = age;
     this.height = height;
     this.weight = weight;
     count++; // インスタンス生成ごとにカウントアップ
 }

 // BMIを計算するメソッド
 public double bmi() {
     return weight / (height * height);
 }

 // 四捨五入したBMIを返すメソッド
 public double roundedBmi() {
     return Math.round(this.bmi() * 10) / 10.0;
 }

 // 自己紹介を出力するメソッド
 public void print() {
     System.out.println("名前は " + this.name + " です");
     System.out.println("年は " + this.age + " 歳です");
     System.out.println("BMIは " + this.roundedBmi() + " です");
 }

 // 人数を返す静的メソッド
 public static int getCount() {
     return count;
 }
}
