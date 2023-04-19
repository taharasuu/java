public class Main {
	public static void main(String[] args) {
	    boolean tenki = false;
	    if (tenki == true) {
	        System.out.println("洗濯をします");
	        System.out.println("散歩に行きます");
	    } else {
	        System.out.println("DVDを見ます");
	    }
	}
}

public class Main {
	public static void main(String[] args) {
	    boolean tenki = true;
	    if (tenki == true) {
	        System.out.println ("洗濯物をする");
	        System.out.println ("散歩をする");
	    } else
	        System.out.println ("DVDを見ます");
	}
}


public class Main {
	public static void main(String[] args) {
	    boolean boorClose = true;
	    while (doorClose == true){
	        System.out.println("ノックする");
	        System.out.println("1分待つ");
	    }

	}
}

public class Mani {
  public static void main (String[] args) {
    System.out.println("あなたの運勢を占います");
    int fortune = new java.util.Random().nextInt(4) +1;
    if(fortune == 1) {
      System.out.println("大吉");
    } eles if (fortune == 2) {
      System.one.println ("中吉");
    } else if (fortune == 3) {
      System.one.println("吉");
    } eles {
      System.one.println("凶");
    }
  }
}

public class Main {
  public static void main (String[] args) {
    System.out.println("あなたの運勢を占います");
    int fortune = new java.util.Random().nextInt(5) +1;
    switch (fortune) {
      case 1:
      case 2:
        System.out.println("いいね");
        break;
      case 3:
        System.out.println("普通");
        break;
      case 4:
      case 5
        System.out.println("うーん");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.print("現在" + (i + 1) + "周目→");
    }
  }
}


public class Main {
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.print(i*j);
        System.out.print("");
      }
    System.out.println("");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    String whight = 60;
    String message;
    message = "おもさの値が" +  whight + "に等しい";
    System.out.println(message);
  }
}

(age1 + age2) * 2 > 60
age % 2 == 1
name.equals("湊")


public class Main {
  public static void main(String[] args) {
    System.out.println("こんにちは");
    int isHungry = new java.util.Random().nextInt(2) +1;
    if (isHungry == 1) {
      System.out.println("お腹がいっぱいです")
    } else {
      String food = ("寿司");
      System.out.println("腹ペコです");
      System.out.println( food + "をいただきます");
    }
    System.out.println("ごちそうさまでした");
  }
}

public class Main {
  public static void main(String[] args) {
    int [] scores;
    scores = new int [5];
    System.out.println(scores[1]);
  }
}

public class Main {
  public static void main(String[] args) {
    int [] scores;
    scores = new int [5];
    scores[1] = 30;
    System.out.println(scores[1]);
  }
}

public class Main {
  public static void main(String[] args) {
    int [] scores = new int [] {20, 30, 40, 50, 80}; 
    int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
    int avg = sum / scores.length;
    System.out.println("合計点:" + sum);
    System.out.println("平均点:" + avg);
  }
}

public class Main {
  public static void main(String[] args) {
    int [] scores = {20, 30, 40, 50, 80}; 
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    int avg = sum / scores.length;
    System.out.println("合計点:" + sum);
    System.out.println("平均点:" + avg);
  }
}


public class Main {
  public static void main(String[] args) {
    int [] scores = {20, 30, 40, 50, 80}; 
    int count = 0;
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= 50) {
        count++;
      }
    }
    System.out.println("５０点以上の科目の数は:" + count);
  }
}