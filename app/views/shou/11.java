//11.2　attackメソッドはからにしてく
//11-1.2
public class Character {
  String name;
  int hp;
  //逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }
  //闘う
  public void attack(Matango m) {
  //attackメソッドは継続後のにそれぞれの職種から適当なものをオーバーライドする  
  }  
}

//11-3 未来の開発者が作成するHeroクラス
public class Hero extends Charactor {
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("敵に１０ポイントのダメージを与えた");
    m.hp -= 10;
  }
}

//11-4.5.6 オーバーライドを忘れたHeroクラス
  //attackメソッドはからにしているとコメントアウトで伝える
  //メソッドはオーバーライドして使うように宣告する
public class Hero extends Character {
  public void attack(Matango) {
    
  }
}


//11-7 attack() を抽象メソッドとして宣言する
public class Character {
  public abstract void attack(Matango m);
}
/*これではダメ*/

//11-8 Characterを抽象クラスして宣言する
  /*抽象メソッドを一つでも含むクラウスは下記のように宣言する*/
  /*抽象クラスはnewによるインスタンス化が禁止される*/
public abstract class Character {
  String name;
  int hp;
  public void run() {
    
  }
  public abstract void attack(Matango m);
}

//11-10 抽象メソッドを正しくオーバーライド
public class Dancer extends Character {
  public void dance() {
    System.out.println("");
  }
  public void attack(Matango m) {
    System.out.println();
    m.hp -= 3;
  }
}

//11.4 インタフェース
//11-11.12 抽象度の大会Creatureクラス
public abstract class Creture {
  public abstract void run();
}

//上記と同様の意味　
//[interface] を使うと自動的にpublic abstraactにあるため省略できる
public interface Creture {
   void run();
}

//11-15 インタフェースを継続したクラスの定義
public class KyotoCleaningShop implements {
  CjeaningService {
    String ownerName;
    String address;
    Storing phone;
    /*シャツを洗う*/
    public Shirt washShirt(Shirt s) {
      //大型洗濯機１５分
      return s;
    }
    /*タオルを洗う*/
    public Towl washTowl(Towl t) {
      //大型洗濯機１０分
      return t;
    }
    /*コートを洗う*/
    public Coar washCoat (Coat c) {
      //ドライ２０分
      return c;
    }
  }
}

//11-16 インタフェースを継続する
public interface Human extends Creature {
  void talk();
  void watch();
  void hear();
  
}