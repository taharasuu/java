//10.1 継続
//10-1 闘うと逃げるだけのヒーロー
public class Hero {
  String name ="ミナト";
  int hp = 100;
  //闘う
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃!");
    m.hp -= 5;
    System.out.println("５ポイントのダメージを与えた！");
  }
  //逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }
}

//10−３Heroクラスを継続しSuperHeroを作る
public class SuperHero extends Hero { 　//[extends]は基本的にはHeroと同じと宣言
  boolean flying;
  public void flying() {
    this.flying = ture;
    System.out.println("飛び上がった！");
  }
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }
}

//10-4 SuperHeroを生み出してrun()を呼び出す
public class Main {
  public static main(String[] args) {
    SuperHero sh = new SuperHero();
    sh.run();
  }
}

//10-5 SuperHeroクラスにrun()を再度定義（上書きする）
public class SuperHero extends Hero { 
  boolean flying;
  public void flying() {
    this.flying = ture;
    System.out.println("飛び上がった！");
  }
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }
  //Heroクラスで定義したrunも再度定義できる
  public void run() {
    System.out.println(this.name + "は撤退した");
  }
}

//10-6 HeroとSuperHeroのrun()を呼び出す
public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.run();
    SuperHero sh = new SuperHero();
    sh.run();
  }
}

//10-7 slip()はオーバーライドできないHeroクラス
public class Hero {
  
  public final void slip() {    //finalがついているslipはオーバーライドできない
    this.hp -= 5;
    System.out.println(this.name + "は転んだ！");
    System.out.purintle("5のダメージ");
  }
  public void run() {　　　　　//runはオーバーライドできる
    System.out.println(this.name + "は逃げ出した！");
  }
}


//10.2　インスタンスの多重構造
//10-9 親クラスのattack()を呼び出す
public calss SuperHero extends Hero {
  public void attack(Matango m) {
    super.attack(m);
    if (this.flying) {
      super.attack(m);
    }
  }
}