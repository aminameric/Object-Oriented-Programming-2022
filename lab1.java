import java.util.Scanner;
public class lab1 {
    public static void main (String [] args)
{
    System.out.println ("Hello world");
    System.out.println ("Amina Meric");
    int numberOfSeconds=60*60*24*365;
    System.out.println ("There are" +numberOfSeconds+ "seconds in a year");


    Scanner reader= new Scanner (System.in);
        System.out.println ("Type a number");
        int numberOne=Integer.parseInt (reader.nextLine ());

        System.out.println ("Type a number");
        int numberTwo=Integer.parseInt (reader.nextLine ());

        System.err.println ("Sum of the number is:"+ (numberOne+numberTwo));

   
        System.out.println ("Type a number");
        int numberThree=Integer.parseInt (reader.nextLine ());

        if (numberThree>0){
            System.out.println ("The number is positive");}
            else{
                System.out.println ("The number is negative");}

                System.out.println ("Type a number");
                int numberFour=Integer.parseInt (reader.nextLine ());
        
                System.out.println ("Type a number");
                int numberFive=Integer.parseInt (reader.nextLine ());
        
                if (numberFour==numberFive){
                    System.out.println ("Numbers are equal");}
                    else if (numberFour>numberFive){
                        System.out.println ("Greatrer number is"+numberFour);}
                        else {
                            System.out.println ("Greater number is"+ numberFive);
                        }

}    
}



