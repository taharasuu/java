//15-1 文字列調査メソッドを利用した例
public class Main {
  public static void mian(String[] args) {
    String s1 = "すっきりJava";
    String s2 = "Java";
    String s3 = "java";
    if (s2.equals(s3)) {
      System.out.println("s2とs3は等しい");
    }
    if (s2.equalsIgnoreCase(s3)) {
      System.out.println("s2とs3はケースを区別しなければならない");
    }
    System.out.println("s1の長さは" + s1.length() + "です");
    if (s1.isEmpty()) {
      System.out.println("s1は空文字です");
    }
  }
}

//15-2
public class Main {
  public static void mian(String[] args) {
    String s1 = "Java and JavaScript";
    if (s1.contains("Java")) {
      System.out.println("文字列s1は、javaを含んでいます");
    }
    if (s1.endsWith("Java")) {
      System.out.println("文字列s1は、javaが末尾にあります");
    }
    System.out.println("文字列s1で最初はjavaが登場する位置は" + 
      s1.index0f("Java"));
    System.out.println("文字列s1で最後にjavaが登場する位置は" + s1.lastIndex0f("Java"));
    
  }
}

//15-3 文字列切り出しメソッドを利用した例
public class Main {
  public static void main(String[] args) {
    String s1 = "Java programming";
    System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
    System.out.println("文字列s1の4~8文字目は" + s1.substring(3, 8));
  }
}

//15-4 stringbuiderを利用して文字列を１万回連結する
public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10000; i++) {
      sb.append("Java");
    }
    String s = sb.toString();
  }
}

//15-5 正当なプレイヤー名であるかを判定するメソッド
public boolean isValidPlayerName(String name) {
  if (name.length() != 8) {
    return fales;
  }
  char first = name.charAt(0);
  if (!(first >= "A" && first <= "Z")) {
    return false;
  }
  for (int i = 1; i < 8; i++) {
    char c = name.charAt(i);
    if (!((c >= "A" && c <= "Z") || (c >= "0" && c <= "9"))) {
      return false;
    }
  }
  return true;
}


//15-6 文字列パターンを用意たプレイヤー名のチェック
public boolean isValidPlayerName(String name) {
  return name.matdches("[A-Z][A-ZO-9]{7}");
}

//15-7 spiltメソッドを使った文字列の分割
public class Main {
  public static void main(String[] args) {
    String s = "abc,def:ghi";
    String[] words = s.split("[,:]");
    for (String w : words) {
      System.out.println(w + "->");
    }
  }
}

//15-8 replaceAllメソッドを使った文字列の置換
public class Main {
  public static void main(String[] args) {
    String s = "abc,def:ghi";
    String w = s.replaceAll("[beh]","X");
    System.out.pritnln(w);
  }
}

//15-9 桁を揃えてキャラクターを表示する
final String FORMAT = "%-9s %-13s 所持金%,6d";
String s = STring.format (FOEMAT,hero.getName(),hero.getJob(),hero.getGold());
System.out.println(s);

//15.6 日付と日時
//15-10処理時間を計測する
public class main {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    //ここで何らかの時間がかかる処理
    long end = System.currentTimeMillis();
    System.out.println("処理にかかった時間は・・・" + (end -start) + "ミリ秒でした");
  }
}

//15-11 現在日時を表示する
public java.util.Date;

public class Main {
  public class Main {
    Date now = new Date(); /*現在の日時を取得*/
    System.out.println(now);
    System.out.println(now.getTime());
    Date past = new Date(1600705425827L); /*2020/9/22 1:23:24のlong値*/
    System.out.println(past);
  }
}