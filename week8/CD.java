package week8;

public class CD implements ToBeStored{
    private String artist;
    private String publisher;
    private int publishingYear;

    public CD(String artist, String publisher, int publishingYear){
        this.artist=artist;
        this.publisher=publisher;
        this.publishingYear=publishingYear;
    }


    @Override
    public double weight() {
        // TODO Auto-generated method stub
        return 0.1;
    } 
    public String toString(){
        return this.artist + " " + this.publisher+ " "+ this.publishingYear;
    }
}
