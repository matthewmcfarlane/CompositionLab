import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Vehicle> vehicles;

    public Customer(int money) {
        this.money = money;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public int getNumberOfCars() {
        return this.vehicles.size();
    }

//    public void buy(Vehicle vehicle) {
//        vehicles.add(vehicle);
//        if (vehicle instanceof Car){
//            Car car = (Car) vehicle;
//            if(car.getPrice() <= )
//
//        }else if(vehicle instanceof ElectricCar){
//            ElectricCar electricCar = (ElectricCar) vehicle;
//
//        }
//
//
//    }
}
