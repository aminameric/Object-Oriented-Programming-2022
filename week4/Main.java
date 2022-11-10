package week4;

public class Main {
    public static void main (String [] args){
    Excercise3 pekka = new Excercise3(20.0);
    Excercise3 brian = new Excercise3(30.0);

    pekka.payGourmet();
    brian.payEconomical();

    System.out.println("Pekka: " + pekka.toString());
    System.out.println("Brian: " + brian.toString());

    pekka.loadMoney(20.0);
    brian.payGourmet();

    System.out.println("Pekka: " + pekka.toString());
    System.out.println("Brian: " + brian.toString());

    pekka.payEconomical();
    pekka.payEconomical();
    brian.loadMoney(50.0);

    System.out.println("Pekka: " + pekka.toString());
    System.out.println("Brian: " + brian.toString());
    }
    
}
