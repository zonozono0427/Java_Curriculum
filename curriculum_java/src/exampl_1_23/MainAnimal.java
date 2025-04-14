package exampl_1_23;

/*
	
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
    体長：2.1m
    速度：80km/h
	
*/

public class MainAnimal {
    public static void main(String[] args) {
        // Lionクラスのインスタンスを作成
        Lion lion = new Lion();

        // setterを使ってフィールドを設定
        lion.setName("ライオン");
        lion.setBodyLength(2.1); // 体長（単位：m）
        lion.setSpeed(80.0); // 速度（単位：km/h）

        // getterを使って値を取得し、コンソールに出力
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getBodyLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }

}