import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private Car car;
    private Engine engine;
    private Gearbox gearbox;

    @Before
    public void before(){
        customer = new Customer(30000);
        engine = new Engine("Petrol", 2000);
        gearbox = new Gearbox(6);
        car = new Car("Ford", "Fiesta", "Green", engine, gearbox, 200);
    }

    @Test
    public void customerStartsWithNoCars(){
        assertEquals(0, customer.getNumberOfCars());
    }

//    @Test
//    public void canBuyCar(){
//        assertEquals(0, customer.getNumberOfCars());
//        customer.buy(car);
//        assertEquals(1, customer.getNumberOfCars());
//    }

}
