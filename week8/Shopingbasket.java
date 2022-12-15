package week8;
import java.util.ArrayList;

public class Shopingbasket {
    private ArrayList<Purchase> basket;

    public Shopingbasket() {
    this.basket = new ArrayList<Purchase>();
        }

    public void add(String product, int price, int amount) {
    Purchase purchase = new Purchase(product, amount, price);
    basket.add(purchase);
        }

    public void price() {
    int total = 0;

    for(int i = 0; i < basket.size(); i++) {
      total += ((basket.get(i)).price());
        }
    
    System.out.println(total);
        }

    public void print() {
    for(int i = 0; i < basket.size(); i++) {
      System.out.println((basket.get(i)));
        }
    }
}
