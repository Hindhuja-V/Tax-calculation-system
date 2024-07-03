
public class Fixed_Property {
    
    protected String location;
    protected boolean inCity;
    protected double estimated_value;

    public Fixed_Property(String location, boolean inCity, double estimated_value) {
        this.location = location;
        this.inCity = inCity;
        this.estimated_value = estimated_value;
    }

    public String getLocation() {
        return location;
    }
    
}
