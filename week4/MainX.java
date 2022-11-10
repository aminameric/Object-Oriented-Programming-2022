package week4;

public class MainX {
    public static void main(String[] args) {
        Excercise3 card = new Excercise3(25.0);
    
        System.out.println(card.toString()); 
    
        card.payEconomical();
        System.out.println(card.toString()); 
    
        card.payGourmet();
        System.out.println(card.toString()); 
    
        card.loadMoney(-10);
        System.out.println(card.toString());
      }
    
}
