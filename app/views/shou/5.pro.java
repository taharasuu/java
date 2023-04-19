//5.8 5-1　引数・戻り値なし
public class Main {
  public static void main(String[] ages) {
    introduceOneself();
  }
  public static void introduceOneself() {
    String name = "suu";
    int age = 22;
    double height = 163.5;
    String et = "トラ";
    System.out.println(name + "さん");
    System.out.println(age + "才");
    System.out.println(height + "cm");
    System.out.println(et + "年");
  }
}

//5-2　引数あり・戻り値なし
public class Main {
  public static void main(String[] ages) {
    String title = "おはよう";
    String address = "xx@gmail.com";
    String text = "今日は天気がいいですね";
    email(title, address, text);
  }
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}

//5-3 オーバーロード・引数あり・戻り値なし
public class Main {
  public static void main(String[] ages) {
    String address = "xx@gmail.com";
    String text = "今日は天気がいいですね";
    email(address, text);
  }
  public static void email(String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }
  public static void email(String address, String title, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }
}

//5-4 戻り値・引数あり
public class Main {
  public static void main(String[] ages) {
    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の面積:" + triangleArea + "㎠")
    
    double triangleArea = calcCircleArea(5.0);
    System.out.println("円の面積:" + circleArea + "㎠")
  }
  public static void calcTriangleArea(double bottom, double height) {
    double area = (bottom * height) / 2;
    return area;
  }
  public static void calcCircleArea(double radius) {
    double area = readius * readius * 3.14;
    return area;
  }
}