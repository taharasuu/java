public class Main {
  public static void main(String[] args) {
    System.out.println("メソッドを呼び出しています");
    hello("湊");
    hello("朝香");
    hello("菅原");
    System.out.println("メソッドの呼び出しが終わりました");
  }
  public static void main(String name) {
    System.out.println(name + "さん、こんにちは")
  }
}

public class Main {
  public static void main(String[] args) {
    add(100, 20);
    add(200, 50);
  }
  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
}


public class Main {
  public static void add(int x, int y) {
    int ans = x + y;
    return ans;
  }
  public static void main(String[] args) {
    int ans = add(100, 10);
    System.out.println("100 + 10 =" + ans);
  }
}


public class Main {
  public static int add(int x, int y) {
    int ans = x + y;
    return ans;
  }
  public static void main(String[] args) {
    System.out.println(add(add(10, 20), add(30, 40)));
  }
}


public class Main {
  public static int add(int x, int y) {
    return x + y;
  }
  public static double add(double x, double y) {
    return x + y;
  }
  public static String add(String x, String y) {
    return x + y;
  }
  public static void main(String[] args) {
    System.out.println(add(10, 20));
    System.out.println(add(3.5, 2.7));
    System.out.println(add("Hello", "World"));
  }
}


public class Main {
  public static int add(int x, int y) {
    return x + y;
  }
  public static int add(int x, int y, int z) {
    return x + y;
  }
  public static void main(String[] args) {
    System.out.println("10+20=" + add(10, 20));
    System.out.println("10+20+30=" + add(10, 20, 30));
  }
}

public class Main {
  public static void printArray(int[] array) {
    for (int element : array){
      System.out.println(element);
    }
  }
  public static void main(String[] args) {
    int [] array = {1, 2, 3};
    printArray(array);
  }
}

public class Main {
  public static void inctArray(int[] array) {
    for (int i = 0; i < array.length; i++ ) {
      array[i]++;
    }
  }
  public static void main(String[] args) {
    int [] array = {1, 2, 3};
    for (int i : array) {
      System.out.println(i);
    }
  }
}

public class Main {
  public static int[] makeArray(int size) {
    int [] newArray = new int[size];
    for (int i = 0; i < newArray.length; i++) {
        newArray[i] = i;
    }
    return newArray;
  }
  public static void main(String[] args) {
    int [] array = makeArray(3);
    for (int i : array) {
      System.out.println(i);
    }
  }
}