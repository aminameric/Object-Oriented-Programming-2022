package week10;

public class Teacher extends person {
    private double salary;
    public Teacher (String name, String address, double salary){
        super(name,address);
    }
    @Override
    public String toString(){
        return super.toString()+ "\n\t" + this.salary;
    }
}
