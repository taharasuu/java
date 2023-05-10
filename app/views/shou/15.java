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