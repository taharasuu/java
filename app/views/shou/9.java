//9-1 仮想世界の真の姿
//    Heroクラスをインスタンス化し利用する

//Main.java
public class Main {
  public static void main(String[] args) {
    //Hero型の変数hをメモリー内に準備（Hero型変数の確保）
    Hero h;
    //代入文（Heroインスタンスの生成）
    h = new Hero();
    //フィールドへの値の代入（参照の解決・アドレス解決
    h.hp = 100;
    Hero h2;
    h2 = h1;
    h2.hp = 200;
    System.out.println(h1.hp);
  }
}

//9-3 sword型フィールドをもつHeroクラス
//ますswordクラスを定義する
//Sword.java
public class Sword {
  String name;
  int damage;
}

//次にHeroクラスを定義
public class Hero {
  String name;
  int hp;
  Sword sword;
  public void attack() {
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に５ポイントのダメージを与えた！");
  }
 }
 
 
 //9-4 剣を装備した勇者を生み出す
 public class Main {
  public static void main(String[] args) {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    h.sword = s;
    System.out.println("現在の武器は" + h.sword.name);
  }
}