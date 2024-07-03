
public class Bus extends Vehicles{
    
    
    protected int no_of_seat;
    //int value;

    public Bus(int no_of_seat, int Reg_num, double value, double maxVelocity) {
        super(Reg_num, value, maxVelocity);
        this.no_of_seat = no_of_seat;
    }

    public int getNo_of_seat() {
        return no_of_seat;
    }
    
}
