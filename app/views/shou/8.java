//インスタンスとクラス

//8-1
public class Main {
  public static void main(String[] args) {
    System.out.println("勇者よ、この仮想世界に生まれよ");
    System.out.println("おばけキノコよ、この仮想世界に生まれよ");
    System.out.println("勇者よ、戦え");
    System.out.println("お化けキノコよ、逃げろ！");
  }
}

//main.java
import comment.Hero
public class Main {
  public static void main(String[] args) {
    comment.Hero.hi();
    comment.Matang.hi();
    comment.Hero.figth();
　　comment.Matang.run();
  }
}

//Hero.java
package comment;
public class Hero {
  public static void hi() {
    System.out.println("勇者よ、この仮想世界に生まれよ");
  }
  public static void figth() {
    System.out.println("勇者よ、戦え");
  }
}

//Matang.java
package comment;
public class Matang {
  public static void hi() {
    System.out.println("おばけキノコよ、この仮想世界に生まれよ");
  }
  public static void run() {
    System.out.println("お化けキノコよ、逃げろ！");
  }
}



//８−2.3.4 クラスの定義
/*ヒーロークラスをjavaのコードで表したもの*/

//Hero.java
public class Hero {
    /*属性の定義*/
  String name; 　　　　　　　　　//名前の宣言
  int hp;　　　　　　　　　　　　//HPの宣言
    /*操作の定義*/　
  public void attack() { ~ } 
  public void sleep() { ~ }
  public void sit(int sec) { ~ }
  public void slip() { ~ }
  public void run() { ~ }
}



//8-5フィールドの宣言　
/*属性を宣言するにはクラスブロックの中に変数宣言をする同時に初期値の設定をする*/
  
//Matang.java
public class Matang {
  int hp;
  int level = 10;  /*初期値10を設定したもの*/
}



//8-6 フィールドを定数でとして宣言
//Matang.java
public class Matang {
  int hp;
  final int level = 10;  /*フィールド levelは10で固定*/
}



//8-7　操作の宣言方法
/*眠る操作に含まれる要素を記述*/
public class Hero {
  String name;
  int hp;
  
  public void sleep() {  /*オブジェクト指数に基づいたメソッドにはstticをつけない*/
    this.hp = 100;　　　/*自身のインスタンスのhpフィールドに100を代入*/
    System.out.println(this.name + "は、眠って回復した");
  }
}



//8-8　メソッドを追加
public class Hero {
  String name;
  int hp;
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した");
  }
  public void sit(int sec) {
    this.hp += sec;　/*何秒座るか引数で受け取る*/
    System.out.println
      (this.name + "は、" + sec + "秒座った！" );
    System.out.println("HPが" + sec + "ポイント回復した");
  }
  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ");
    System.out.println("5のダメージ");
  }
  public void run() {
    System.out.println(this.name + "は、逃げ出した");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
}