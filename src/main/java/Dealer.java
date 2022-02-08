import java.util.ArrayList;

public class Dealer implements IBuy{

    private String name;
    private int till;
    private ArrayList<Vehicle> vehicles;



    public Dealer(String name, int till) {
        this.name = name;
        this.till = till;
        vehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int cash) {
        this.till = cash;
    }

    public void buy(Vehicle vehicle) {
        if (vehicle instanceof Car){
            Car car = (Car) vehicle;
            if(car.getPrice() <= getTill()){
                vehicles.add(vehicle);
                setTill((getTill() - car.getPrice()));
            }
        }else if(vehicle instanceof ElectricCar){
            ElectricCar electricCar = (ElectricCar) vehicle;
            if(electricCar.getPrice() <= getTill()){
                vehicles.add(vehicle);
                setTill((getTill() - electricCar.getPrice()));
            }

        }


    }

    public int getStockCount() {
        return this.vehicles.size();
    }


    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

}
