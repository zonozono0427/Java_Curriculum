package package1_30;


public class Main {
    public static void main(String[] args) {
        // Personインスタンスを作成
        Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);

        // フィールドを直接出力（必要に応じて）
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.height);

        // printメソッドで自己紹介を出力
        person1.print();

        // 合計人数を出力
        System.out.println("合計 " + Person.getCount() + " 人です");
    }
}