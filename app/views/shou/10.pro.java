//10-3 
public class Matango {
  int hp = 50;
  char suffix;
  
  public Matango(char suffix) {
    this.suffix = suffix;
  }
  public void attack(Hero h) {
    System.out.println("きのこ" + this.suffix "の攻撃");
    System.out.println("10のダメージ");
    h.hp -= 10;
  }
}

public class PoisonMatango extends Matango {
  int poisonCount = 5;
  public PoisonMatango(char suffix) {
    super(suffix);
  }
  public void attack(Hero h) {
    if (this.poisonCount > 0) {
      System.out.println("さらに毒の胞子をばら撒いた！");
      int dmg = h.hp / 5
      h.hp -= dmg;
      System.out.pritnln(dmg + "ポイントのダメージ！");
      this.poisonCount--;
  }
}