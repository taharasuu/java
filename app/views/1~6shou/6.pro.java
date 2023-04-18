//６−８　練習問題
//6-1 ３つのクラスに分ける
public class Main {
  public static void main (String[] args) throws Exception {
    doWarusa();
    doTogame();
    callDeae();
    showMondokoro();
  }
  
  public static void doWarusa() {
    System.out.println("きなこでござる。食えませんがの。");
  }
  
  public static void doTogame() {
    System.out.println("この老いぼれの目は誤魔化せませんぞ。");
  }
  
  public static void callDeae() {
    System.out.println("えぇい、こしゃくな。くせ者だ！出会えい！");
  }
  
  public static void showMondokoro() throws Exception {
    System.out.println("飛車さん、角さん。もういいでしょう。");
    System.out.println("この紋所が目にはいらぬか！");
    doTogame();
  }
}

//Main.java
import comment.Zenhan;

public class Main {
  public static void main (String[] args) throws Exception {
    comment.Zenhan.doWarusa();
    comment.Zenhan.doTogame();
    comment.Kouhan.callDeae();
    comment.Kouhan.showMondokoro();
  }
}
//Zenhan.java
package comment;

public class Zenhan {
  public static void doWarusa() {
    System.out.println("きなこでござる。食えませんがの。");
  }
  public static void doTogame() {
    System.out.println("この老いぼれの目は誤魔化せませんぞ。");
  }
}

//Kouhan.java
package comment;

public class Kouhan {
  public static void callDeae() {
    System.out.println("えぇい、こしゃくな。くせ者だ！出会えい！");
  }
  public static void showMondokoro() throws Exception {
    System.out.println("飛車さん、角さん。もういいでしょう。");
    System.out.println("この紋所が目にはいらぬか！");
    Zenhan.doTogame();
  }
}