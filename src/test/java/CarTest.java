import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Engine engine;
    private Gearbox gearbox;
    private Car car;

    @Before
    public void before(){
        engine = new Engine("Diesel", 1800);
        gearbox = new Gearbox(6);
        car = new Car("Ford", "Fiesta", "Green", engine, gearbox, 200);
    }

    @Test
    public void hasNumOfGears(){
        assertEquals(6, car.getNumberOfGears());
    }

    @Test
    public void hasEngineSize(){
        assertEquals(1800, car.getEngineSize());
    }

    @Test
    public void hasEngineFuelType(){
        assertEquals("Diesel", car.getEngineFuelType());
    }


}
