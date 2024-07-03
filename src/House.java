
public class House extends Fixed_Property{
    
    public double area;

    public House(double area, String location, boolean inCity, double estimated_value) {
        super(location, inCity, estimated_value);
        this.area = area;
    }

    public double getArea() {
        return area;
    }
    
}
