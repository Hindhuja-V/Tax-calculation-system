
public class Vehicles {
    
    protected int Reg_num;
    protected double value;
    protected double maxVelocity;

    public Vehicles(int Reg_num, double value, double maxVelocity) {
        this.Reg_num = Reg_num;
        this.value = value;
        this.maxVelocity = maxVelocity;
    }

    public int getReg_num() {
        return Reg_num;
    }
     
}
