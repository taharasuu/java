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

//12-6 パーティが夙夜に泊まってHPを回復する
public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    Hero h2 = new Hero();
    Thief t1 = new Thief();
    Wizare w1 = new Wizard();
    Wizare w2 = new Wizard();

    h1.hp += 50;
    h2.hp += 50;
    t1.hp += 50;
    w1.hp += 50;
    w2.hp += 50;
  }
}

//12-7多態性と配列を君あわせて宿屋に泊まる
public class Main {
  public static void main(String[] args) {
    Character[] c = new Character[5];
    c[0] = new Hero();
    c[1] = new Hero();
    c[2] = new Thief();
    c[3] = new Wizard();
    c[4] = new Wizard();
    
    for (Character ch : c) {
      ch.hp += 50;
    }
  }
}

//12-8 攻撃する相手ごとにattack()を作成
public class Hero extends Character { //お化けきのこの攻撃用
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("的に10ポイントのダメージを与えた!");
    m.hp -= 10;
  }
  public void attack(Goblin g) {  //ゴブリンの攻撃用
    System.out.println(this.name + "の攻撃！");
    System.out.println("的に10ポイントのダメージを与えた！");
    g.hp -= 10;
  }
}

//12-9 Monsterならなんでも攻撃できるattackメソッド
public class Hero extends Character {
  public void attack(Monster m) {  //モンスター攻撃用
    System.out.println(this.name + "の攻撃！");
    System.out.println("的に10ポイントのダメージを与えた!");
    m.hp -= 10;
  }
}

//12-10 同じ指示で異なる動作をさせることができる
public class Main {
  public static void main(String[] args) {
    Monster[] monsters = new Monster[3];
    monster[0] = new Slime();
    monster[1] = new Goblin();
    monster[2] = new DeathBat();
    
    for (Monster m : monsters) {
      m.run();
    }
  }
}
