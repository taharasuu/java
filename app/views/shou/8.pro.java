//8-1.4
//Clerc.java
public class Clerc {
  String name;
  int hp = 50;
  final int max_hp = 50;
  int mp = 10;
  final int mamp =10;
  
  public void selfAid() {
    System.out.println(this.name + "は、セレフエイドを唱えた")
    this.mp -=5;
    this.hp = this.max_hp;
    System.out.println("HPが最大まで回復した")
  }
  public void pray( int sec) {
    System.out.println(this.name + "は" + "秒間天に祈った");
    int recover = new Random().nextInt(3) + sec;
    
  }
}