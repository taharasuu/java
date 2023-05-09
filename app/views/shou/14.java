//14 クラスについて
//14-2 Object型にさまざまなインスタンスを代入
//14-3 どんなインスタンスでも受け取れるメソッド
public class Main {
  public static void main(String[] args) {
    Object o1 = new Empty();
    Object o2 = new Hero();
    Object o3 = new "こんにちは";
  }
}

public class Printer {
  public void printAnythiing(Object o) {
    //何型でもいいから、引数を1つ受け取り画面に表示
    System.out.println(o.toString());
  }
}

//14-4 Heroクラスの文字情報を表示
//14-5 意図する文字列表現を返すtoString ()を定義
public class Hero {
  String name;
  int hp;
  public String toString() {　/*オーバーライドする*/
    return "名前:" + this.name + "/HP:" + this.hp;
  }
}
public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.name = "ミナミ";
    h.hp = 100;
    System.out.println(h.toString());
  }
}

//14-6 ２人の勇者を比較する
public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp. = 100;
    Hero h2 = new Hero();
    h2.name = "ミナト";
    h2.hp = 100;
    if (h1.equals(h2) == true) {
      System.out.println("同じ内容です");
    } else {
      System.out.println("違う内容です");
    }
  }
}

//14-7 名前が同じなら同じ勇者とするequalsを定義
public class Hero {
  String name;
  int hp;
  
  public boolean equals(Object o) {
    if (this == o) {  /*等値なら間違いなく等価*/
      return true; }
    if (o instanceof Hero) {
      Hero h = (Hero)o;
      if (this.name.equals(h.name)) { /*名前が等しければ等価*/
        return true;
      }
    }
    return false;
  }
}

//14.3 静的メンバ
//静的メンバ＝staticキーワードが付けられたフィールドやメソッドのこと
//java APIで提供されるクラスでも広く活用される
//class変数とも言われる

//14-9 staticによるフィールドの共有
//14-10 静的フィールドmoneyへのアクセス
public class Hero {
  String name;
  int hp;
  static int money;
}
public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    Hero h2 = new Hero();
    System.out.println(h1.hp);  /*インスタンスh1の箱hpを表示*/
    System.out.println(Hero.money); /*クラスHeroの箱moneyを表示*/
  }
}

//14-11 かくインスタンスから静的フィールドを利用可能
//h1.moneyとh2.moneyとHero.moneyは連携しているイメージ
public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    Hero h2 = new Hero();
    Hero.money = 100;
    System.out.println(Hero.money); /*100と表示*/
    System.out.println(h1.money);  /*100と表示*/
    h1.money = 300;  /*h1.moneyに300を代入*/
    System.out.println(h2.money);  /*h2.moneyでも300と表示される*/
  }
}

//14-12 newせずとも静的フィールドは利用可能
//インスタンスを1つも生み出さなくても共有の箱が利用可能になる
//クラス変数
//public static final コンビネーション
  /*多くの場合staticはfinalやpublicと一緒に指定され、
  「変化しない定数を各インスタンスで教習するため」に利用される*/
public class Main {
  public static void main(String[] args) {
    //1人も勇者を生み出していない状況で・・・
    Hero.money = 100;
    System.out.println(Hero.money);
  }
}


//静的メソッド
//14-13 所持金をランダムに設定する
//クラスメソッドとも呼ばれる
public class Hero {
  String name;
  int hp;
  static int money;
  
  public static void setRandomMoney() { /*staticを付けたメソッド*/
    Hero.money = (int) (Math.rendom() * 1000);
  }
}

//14-14 newせずとも静的メソッドは呼び出し可能
public calss Main {
  public static void main(String[] args) {
    Hero.setRandmMoney();
    System.out.println(Hero.money);
    hero h1 = new Hero();
    System.out.println(h1.money);
  }
}