//DNAをランダムに表示する

public class Main {
  public static void main(String[] args) {
    int [] seq = new int[10];
    
    //塩基をランダムに生成
    for (int i = 0; i < seq.length; i++) {
      seq[i] = new java.util.Random().nextInt(4);
    }
    
    //生成した塩基配列の希望を表示
    for (int i = 0; i < seq.length; i++) {
      switch (seq[i]) {
        case 0:
          System.out.print("A");
          break;
        case 1:
          System.out.print("T");
          break;
        case 2:
          System.out.print("C");
          break;
        case 3:
          System.out.print("G");
          break;
      }
    }
  }
}

//別の書き方
public class Main {
  public static void main(String[] args) {
    int [] seq = new int[10];
    
    //塩基をランダムに生成
    for (int i = 0; i < seq.length; i++) {
      seq[i] = new java.util.Random().nextInt(4);
    }
    
    //生成した塩基配列の希望を表示
    for (int i = 0; i < seq.length; i++) {
    char [] base = {"A", "T", "C", "G"};
    System.out.print(base[seq[i]] + "");
  }
}