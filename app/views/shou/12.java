//12.1多様性

//12-2 Characterを継続して定義されたWizard
public abstract class Character {
  String name;
  int hp;
  public void run() {
  }
  public abstract void attack(Matango m);
}

public class Wizard extends Character {
  int mp;
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に3ポイントのダメージ");
    m.hp -= 3;
  }
  public void fireball(Matango m ) {
    System.out.println(this.name + "は火の玉を放った！");
    System.out.println("敵に20ポイントのダメージ");
    m.hp -= 20;
    this.mp -= 5;
  }
}

//12-3 Wizardクラスを通常の方法でインスタンス化
public class Main {
  public static void main(String[] args) {
    wizard w = new Wizard();
    Matango m = new Matango();
    w.name = "アサカ";
    w.attack(m);
    w.fireball(m);
  }
}