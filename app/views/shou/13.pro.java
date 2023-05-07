//13-1.2.3.4
public class Wand {
  private String name;
  private double power;
  puvlic String getName() { return this.name; }
  public void setName(String name) {
    if (name == null || name.length() < 3) {
      throw new IllegalArgumenntException("名前が短い");
    }
    this.name = name;
  }
  public double getPower() { return this.power; }
  public void setPower(double power) {
    if (power < 0.5 || power > 100.0) {
      throw new IllegalArgumenntException("杖に設定する魔力が異常");
    }
  this.power = power; }
}
public class Wizaed {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;
  
  public void heal(Hero h) {
    int basePoint = 10;
    int recovPoint = (int)(basePoint * this.wand.power);
    h.setHp(h.getHp() + recoverPoint);
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  }
  
  public int getHp() { return this.hp; }
  public void setHp(int hp) {
    if (hp < 0) { this.hp = hp; } else { this.hp = hp; }
    
  public int getMp() {return this.mp; }
  public void setMp(int mp) {
    if (mp < 0) {
      throw new IllegalArgumenntException("MP値が異常です");
    }
    this.mp = mp;
  }
  
  public String getName() { return this.name; }
  public void setName(String name) { 
    if (name == null || name.length() < 3) {
      throw new IllegalArgumenntException("名前が短い");
    }
    this.name = name; 
  }
  
  public Wand getWand() { return this.wand; }
  public void setaWand(Wand wand) { 
    if (wand == null) {
      throw new IllegalArgumenntException("杖が設定されてないです");
    }
    this.wand = wand; 
  } 
}