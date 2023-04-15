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

public class Main {
  public static void main(String[] args) {
    int[] scores = {20, 30, 40, 50, 80};
    for (int value : scores) {
      System.out.println(value);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    int[] arrayA = {1, 2, 3};
    int[] arrayB;
    arrayB = arrayA;
    arrayB[0] = 100;
    System.out.println(arrayA[0]);
  }
}

public class Main {
  public static void main(String[] args) {
    boolean judge = true;
    if (judge == ture) {
      int[] array = {1, 2, 3};
    }
  }
}

public class Main {
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    array = null;
    array[0] = 10;
  }
}

public class Main {
  public static void main(String[] args) {
    int[] [] scores = new int[2] [3];
    scores[0] [0] = 40;
    scores[0] [1] = 50;
    scores[0] [2] = 60;
    scores[1] [0] = 80;
    scores[1] [1] = 60;
    scores[1] [2] = 70;
    System.out.println(scores[1] [1]);
  }
}

public class Main {
  public static void main(String[] args) {
    int[] [] scores = { {40, 50, 60}, {80, 60, 70}};
    System.out.println(scores.length);
    System.out.println(scores[0].length);
  }
}
