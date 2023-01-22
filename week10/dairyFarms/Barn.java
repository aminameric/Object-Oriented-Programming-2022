package week10.dairyFarms;

public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot robot) {
        this.robot = new MilkingRobot();
    }

    public void takeCareOf(Cows cows) {
        if(robot == null) {
        throw new IllegalStateException();
    } 
    else {
      this.robot.milk(cows);
    }
}

    public String toString() {
        return tank.toString();
    }
}
