package week4;

public class Program {

    public static void main(String[] args) {
        Excercise2 dice = new Excercise2(6);
    
        int i = 0;
        while ( i < 10 ) {
            System.out.println( dice.roll() );
            i++;
            }
        }
    }

