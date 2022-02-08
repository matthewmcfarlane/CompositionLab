import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    private ElectricCar electricCar;
    private Battery battery;

    @Before
    public void before(){
        battery = new Battery(1000);
        electricCar = new ElectricCar("Ford", "Focus", "White", battery, 20000);
    }

    @Test
    public void canGetMake() {
        assertEquals("Ford", electricCar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Focus", electricCar.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("White", electricCar.getColour());
    }

    @Test
    public void canGetPrice() {
        assertEquals(20000, electricCar.getPrice());
    }

    @Test
    public void hasBatteryCapacity() {
        assertEquals(1000, electricCar.getBatteryCapacity());



    }
}
