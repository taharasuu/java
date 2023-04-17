//６章ソースファイルの分裂
//6-1
public class Main {
  public static void main(String[] ages) {
    int a = 10; int b = 2;
    int total = tasu(a, b);
    int delta = hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
  public static int tasu(int a, int b) {
    return (a + b);
  }
  public static int hiku(int a, int b) {
    return (a - b);
  }
}

//6-2・３　６−１からtasu/hikuを移動(別のファイルに記載する？)
public class Calc {
  public static void main(String[] ages) {
    int a = 10; int b = 2;
    int total = CalcLogic.tasu(a, b);
    int delta = CalcLogic.hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}

public class CalcLogic {
  public static int tasu(int a, int b) {
    return (a + b);
  }
  public static int hiku(int a, int b) {
    return (a - b);
  }
}
