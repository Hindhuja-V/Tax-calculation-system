
public class TaxableBus extends Bus implements Taxable{

    public TaxableBus(int no_of_seat, int Reg_num, double value, double maxVelocity) {
        super(no_of_seat, Reg_num, value, maxVelocity);
    }

    @Override
    public double taxvalue() {
        double t_value= (super.value/10)+105*super.no_of_seat;
    
    return t_value;
    }
    
}
