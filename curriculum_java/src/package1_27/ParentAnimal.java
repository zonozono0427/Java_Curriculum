package package1_27;

// 動物クラス
class Animal {
	private String name;
	private String length;
	private String speed;
	private String scientificName;

	public Animal(String name, String length, String speed, String scientificName) {
		this.name = name;
		this.length = length;
		this.speed = speed;
		this.scientificName = scientificName;
	}

	// 情報を表示するメソッド
	public void displayInfo() {
		System.out.println("動物名：" + name);
		System.out.println("体長：" + length + "m");
		System.out.println("速度：" + speed + "km/h");
		System.out.println("学名：" + scientificName);
	}
}