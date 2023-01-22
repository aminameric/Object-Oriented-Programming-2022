package week10;

public class person {
    private String address;
    private String name;
    private String image;

public void Person (String address, String name, String image){
    this.address=address;
    this.name=name;
    this.image=image;
}
public person (String name, String address){
    this.name=name;
    this.address=address;
}
public String toString() {
    return this.name + " " + this.address;
  }
}


