package week10.dairyFarms;

public class MilkingRobot {
    private BulkTank bt;

    public MilkingRobot() {}

    public BulkTank getBulkTank() {
        return this.bt;
    }

    public void setBulkTank(BulkTank bt) {
        this.bt = bt;
    }

    public void milk(Cows cows) {
        if(this.bt == null) {
        throw new IllegalStateException();
    } 
    else {
      this.bt.addToTank(cows.milk());
    }
  }
}
