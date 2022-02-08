import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatteryTest {

    private Battery battery;

    @Before
    public void before(){
        battery = new Battery(1000);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(1000, battery.getCapacity());
    }

    @Test
    public void canSetCapacity() {
        battery.setCapacity(500);
        assertEquals(500, battery.getCapacity());
    }


}
