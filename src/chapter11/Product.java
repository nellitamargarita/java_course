package chapter11;

public interface Product {
    int size= 0;

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);
}
