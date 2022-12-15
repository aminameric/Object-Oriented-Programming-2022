package week8;

public class Main {
    public static void main (String[]args){
        Book book1= new Book ("writer 1", "Name 1", 1);
        Book book2= new Book ("writer 2", "Name 2", 2);
        Book book3= new Book ("writer 3", "Name 3", 3);

        CD cd1= new CD ("Artisti 1", "Title 1", 2000);
        CD cd2= new CD ("Artisti 2", "Title 2", 2000);
        CD cd3= new CD ("Artisti 3", "Title 3", 2000);

        System.out.println (book1);
        System.out.println (book2);
        System.out.println (book3);

        System.out.println (cd1);
        System.out.println (cd2);
        System.out.println (cd3);

        Box box= new Box (10);
        box.add(cd1);
        box.add(cd2);
        box.add(cd3);

    }
}
