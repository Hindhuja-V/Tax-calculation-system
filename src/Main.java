
public class Main {
    
    public static void main(String arg[]){
        
         TaxableHouse T_house1 = new TaxableHouse(100,"Karachi",true,86000);
         TaxableBus T_bus1 =new TaxableBus(10,3000,68000,8); 
         TaxableHouse T_house2 = new TaxableHouse(200,"Hyderabad",true,29000);
         TaxableBus T_bus2 =new TaxableBus(20,4595,8000,8);  
         TaxableHouse T_house3 = new TaxableHouse(400,"Lahore",false,57000);
         TaxableBus T_bus3 =new TaxableBus(40,2155,5000,12);  
         TaxableHouse T_house4 = new TaxableHouse(600,"Islamabad",false,71000);
         TaxableBus T_bus4 =new TaxableBus(40,7599,18000,26);
         TaxableHouse T_house5 = new TaxableHouse(800,"Faisalabad",true,58000);
         TaxableBus T_bus5 =new TaxableBus(30,5478,10000,18);
         
         System.out.println("Tax_Value for HouseNumber 1  :" + T_house1.taxvalue()+(" ---location: ")+T_house1.getLocation()+(" ----area: ")+T_house1.getArea()+(" ----In City: ")+T_house1.inCity+(" ----Estim.Value: ")+T_house1.estimated_value);
         System.out.println("Tax_Value for HouseNumber 2  :" + T_house2.taxvalue()+(" ---location: ")+T_house2.getLocation()+(" ----area: ")+T_house2.getArea()+(" ----In City: ")+T_house2.inCity+(" ----Estim.Value: ")+T_house2.estimated_value);
         System.out.println("Tax_Value for HouseNumber 3  :" + T_house3.taxvalue()+(" ---location: ")+T_house3.getLocation()+(" ----area: ")+T_house3.getArea()+(" ----In City: ")+T_house3.inCity+(" ----Estim.Value: ")+T_house3.estimated_value);
         System.out.println("Tax_Value for HouseNumber 4  :" + T_house4.taxvalue()+(" ---location: ")+T_house4.getLocation()+(" ----area: ")+T_house4.getArea()+(" ----In City: ")+T_house4.inCity+(" ----Estim.Value: ")+T_house4.estimated_value);
         System.out.println("Tax_Value for HouseNumber 5  :" + T_house5.taxvalue()+(" ---location: ")+T_house5.getLocation()+(" ----area: ")+T_house5.getArea()+(" ----In City: ")+T_house5.inCity+(" ----Estim.Value: ")+T_house5.estimated_value);
         
         System.out.println("\n" );
         
         System.out.println("Tax_Value for BusNumber 1  :" + T_bus1.taxvalue()+(" ---no.of seats: ")+T_bus1.getNo_of_seat()+(" ---reg.number: ")+T_bus1.getReg_num()+(" ---Value: ")+T_bus1.value+(" ----velocity: ")+T_bus1.maxVelocity);
         System.out.println("Tax_Value for BusNumber 2  :" + T_bus2.taxvalue()+(" ---no.of seats: ")+T_bus2.getNo_of_seat()+(" ---reg.number: ")+T_bus2.getReg_num()+(" ---Value: ")+T_bus2.value+(" ----velocity: ")+T_bus2.maxVelocity);
         System.out.println("Tax_Value for BusNumber 3  :" + T_bus3.taxvalue()+(" ---no.of seats: ")+T_bus3.getNo_of_seat()+(" ---reg.number: ")+T_bus3.getReg_num()+(" ---Value: ")+T_bus3.value+(" ----velocity: ")+T_bus3.maxVelocity);
         System.out.println("Tax_Value for BusNumber 4  :" + T_bus4.taxvalue()+(" ---no.of seats: ")+T_bus4.getNo_of_seat()+(" ---reg.number: ")+T_bus4.getReg_num()+(" ---Value: ")+T_bus4.value+(" ----velocity: ")+T_bus4.maxVelocity);
         System.out.println("Tax_Value for BusNumber 5  :" + T_bus5.taxvalue()+(" ---no.of seats: ")+T_bus5.getNo_of_seat()+(" ---reg.number: ")+T_bus5.getReg_num()+(" ---Value: ")+T_bus5.value+(" ----velocity: ")+T_bus5.maxVelocity);
         
         System.out.println("\n" );
         
    }
}
