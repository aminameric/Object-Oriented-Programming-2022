package week10;

public class student extends person{
    private int credits;
    public student(String name, String address, int credits){
        super(name, address);
        this.credits=0;
    }
    public void study(){
        this.credits++;
    }
    public int getCredits() {
        return this.credits;
      }
    @Override
    public String toString(){
        return super.toString() + "\n\t" + this.credits;
    }
    
}
