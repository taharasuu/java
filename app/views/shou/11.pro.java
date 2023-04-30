//11-1
public abstract class TangibleAsset {
  String name;
  int price;
  String color;

  public TangibleAsset(String name, int price, String color) {
    this.name = name;
    this.price = price;
    this.color = color;
  }
  ublic String getName() {return this.name; }
  public int getPricd() {return this.price; }
  public String getColor() {return this.Color; }
}

public class Book extends TangibleAsset {
  String isbn;

  public Book(String name, int price, String color, String isbn) {
    super(name, price, color);
    this.isbn = isbn;
  }
  public String getIsbn() {return this.isbn; }
 }

 public class Computer extends TangibleAsset {
  String makeName;

  public Computer(String name, int price, String color, String makeName) {
    super(name, price, color);
    this.makeName = makeName;
  }
  public String getMakeName() {return this.makeName; }
}

//11-2
public interface Thing {
  double getWeight();
  void setWeight(double weight);
}

//11-3
public abstract class TangibleAseet extends Asset implements Thing {
  String color;
  double weight;
  public TangibleAseet(String name, int price, String color) {
    super(name, price);
    this.color = color;
  }
  public String getColor() { return this.color; }
  public double getWeight() {return this.weight; }
  public void setWeight(double weight) {this.weight = weight; }
}