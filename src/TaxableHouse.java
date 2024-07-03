
public class TaxableHouse extends House implements Taxable{

    public TaxableHouse(double area, String location, boolean inCity, double estimated_value) {
        super(area, location, inCity, estimated_value);
    }
   
    

    @Override
    public double taxvalue() {
        double tvalue=0;
        
        if(super.inCity){
        tvalue= ((super.estimated_value/1000)*5)+0.5*super.area;
        }
        else{
        tvalue= ((super.estimated_value/1000)*3);
        }
        
        return tvalue;
  
    }
    
}
