package processPackage1_25;


import java.util.Random;

public class Character {
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int speed;
    private int defense;

    // コンストラクタ
    public Character(String name) {
        this.name = name;
        generateStats();
    }

    // ステータスのランダム生成
    private void generateStats() {
        Random rand = new Random();
        this.hp = rand.nextInt(1000) + 1;
        this.mp = rand.nextInt(1000) + 1;
        this.attack = rand.nextInt(500) + 1;
        this.speed = rand.nextInt(1000) + 1;
        this.defense = rand.nextInt(100) + 1;
    }

    // getter
    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getMp() { return mp; }
    public int getAttack() { return attack; }
    public int getSpeed() { return speed; }
    public int getDefense() { return defense; }
}