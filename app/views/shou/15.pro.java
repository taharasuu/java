//15-1
public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <100; i++) {
      sb.append(i+1).append(",");
    }
    String s = sb.toString();
    String[] a = s.split(",");
  }
}

//15-2
public String concatPath(String folder,String file) {
  if (!folder.endsWith("¥¥")) {
    folder += "¥¥";
  }
  return folder + file;
}

//15-3
1) 全ての文字列
.*
2)最初の１文字はA,２文字目は数字、３文字目は数うじかなし
A¥d{1,2}
3)最初の１文字目はU、２〜４文字目は英大文字
U[A-Z]{3}

//15-4
import java.text.SimpleDateFormat;
import java util.Calendar;
import java util.Date;

public class Main {
  public static void main(String[] args) {
    
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    
    c.setTime(now);
    
    int day = c.get(Calendar.DAY_OF_MONTH);
    
    day += 100;
    c.set(Calendar.DAY_OF_MONTH, day);
    
    Date future = c.getTime();
    
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(f.format(future));
  }
}

