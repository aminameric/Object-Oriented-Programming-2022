package week6;
import java.util.ArrayList;
import java.util.Locale;
public class Library {
    public ArrayList<Book> books = new ArrayList<>();

    public Library() {
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void printBooks(){
        System.out.println(this.books);
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for(int i = 0; i < books.size(); i++){
            Book newBook = books.get(i);
            if(newBook.title.toUpperCase().contains(title.toUpperCase().trim())){
                found.add(newBook);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for(int i = 0; i < books.size(); i++){
            Book newBook = books.get(i);
            if(newBook.publisher.toUpperCase().contains(publisher.toUpperCase().trim())){
                found.add(newBook);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for(int i = 0; i < books.size(); i++){
            Book newBook = books.get(i);
            if(newBook.year == year){
                found.add(newBook);
            }
        }
        return found;
    }
}
