//13 カプセル化
//13.2 メンバーに関するアクセス制限
public class Hero {
  private int hp;
  String name;
  Sword sword;
  
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠ってしまった！");
  }
}

//13-5.6　dieメソッドをprivateとして指定　attackメソッドはpublicとして指定
public class Hero {
  
  private void die() {
    System.out.println(this.name + "は死んでしまった！");
    System.out.println("GAME OVWEです")
  }
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠ってしまった！");
  }
  public void attack(Matango m) {
    
  }
}


//13-7.8.9.10 王様クラスで利用されるname
//ヒーロクラスでprivate設定

/*getterメソッド　フィールドちを取り出すだけのメソッド*/
/*setterメソッド　フィールド値に値を代入するだけのメソッド*/
public class Hero {
  private String name;
  
  public String getName() { /*ゲッターメソッド*/
    return this.name;
  }
  public void setName(String name) { /*セッターメソッド*/
    this.name = name;
  }
}
public class King {
  void talk(Hero h) {
    System.out.println("ようこそ若国へ、勇者" + h.getName + "よ。");
  }
}