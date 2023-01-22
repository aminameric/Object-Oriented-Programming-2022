package week7;

public class Excercise2 {
    public static void main(String[] args) {
    PromissoryNote mattisNote = new PromissoryNote();
          
    mattisNote.setLoan("Arto", 51.5);
    mattisNote.setLoan("Mikale", 30.0);
      
    System.out.println(mattisNote.howMuchIsDept("Arto"));
    System.out.println(mattisNote.howMuchIsDept("Joel"));
    }
}
