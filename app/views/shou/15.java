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


//15-12 6つのint値とDate型の相互変換
import java.util.Calender;
import java.until.Date;

public class Main {
  public static boid main(String[] args) {
    Calendar c = Calender.getInstance();
    c.set(2019,8,22,1,23,45);
    c.set(Calendar.MONTH, 9); /*月は0=1月 10=11月 7=8月*/　
    Date d = c.getTime();
    System.out.println(d);
    Date now = new Date();
    c.setTime(now);
    int y = c.get(Calendar.YEAR);
    System.out.println("今年は" + y + "年です");
  }
}

//15-13 String型とDate型の相互変換
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  public static void main(String[] args) throws Exception {
    SimleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date d = f.parse("2020/09/22 01:23:45");
    System.out.println(d);
    Date now = new Date();
    String s = f.format(now);
    System.out.println("現在は" + s + "です");
  }
}

//15-14 InstantおよびZonedDateTimeの利用例
import java.taim.*;

public class Main {
  public static void main(String[] args) {
    //Instantの生成
    Instant i1 = Instant.now();
    //Instantとlong値との相互変換
    Instant i2 = Instant.ofEpochMilli(1600705425827L);
    long l = i2.toEpochMilli();
    
    //ZonedDateTimeの生成
    ZonedDateTime z1 = ZonedDateTime.now(); /*現在時刻を取得*/
    ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
    /*東京時間2020年1月2日3時4分5秒6ナノ秒を指している*/
    
    //InstantとZonedDateTimeの相互変換
    Instant i3 = z2.toInstant();
    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
    
    //ZonedDateTimeの利用方法
     System.out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
     System.out.println("ロンドン:" + z3.get.Year() + z3.getMonth() + z3.getDayOfMonth());
     if (z2.isEqual(z3)) {  /*同じ瞬間の判定にはequals()ではなくisEwual()を使う*/
       System.out.println("これらは同じ瞬間を指しています");
     }
  }
}

//15-15 LocalDateTImeの利用例
import java.time.*;

public class Main {
  public stativ void main(String[] args) {
    //LocalDateTimeの生成方法
    LocalDateTime l1 = LocalDateTime.now(); /*現在時刻を取得*/
    LocalDateTIme l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
    
    //LocalDateTimeのZonedDateTimeの相互変換
    ZonedDateTime z1 = l2.atZone("ZoneId.of(Europe/London"));
    LocalDateTime l3 = z1.toLocalDateTime();
  }
}

//15-16 各種日時クラスのメソッド利用例
import java.time.*;
import java.time.format.*;

public. class Main {
  public static void main(String[] args) {
    //文字列からLocalDateを生成
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate ldate = LocalDate.parse("2020/09/22", fmt);
    
    //1000日後を計算する
    LocalDate ldatep = ldate.plusDays(1000);
    String str = ldatep.format(fmt);
    System.out.println("1000日ごは" + str);
    
    //現在日付との比較
    LocalDate now = LocalDate.now();
    if (now.isAfter(ldatep)) {
      System.out.println("1000日後は過去日付です");
    }
  }
}

