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



