//11.2　高度な継続に関する２つの不都合
//11-1
public class Character {
  String name;
  int hp;
  //逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }
  //闘う
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！")；
    m.hp -= ??;　　　//ここの書き方
    System.out.println("敵に？？ポイントのダメージを与えた")
  }
}

//11-2 