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
  }
}

