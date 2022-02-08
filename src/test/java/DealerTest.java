import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;
    private Car car;
    private Engine engine;
    private Gearbox gearbox;

    @Before
    public void before(){
        dealer = new Dealer("Anrold Spark", 100000);
        car = new Car("Tesal", "S", "White", engine, gearbox, 50000);

    }

    @Test
    public void hasTill() {
        assertEquals(100000, dealer.getTill());
    }

    @Test
    public void hasName() {
        assertEquals("Anrold Spark", dealer.getName());
    }

    @Test
    public void canBuyCar() {
        dealer.buy(car);
        assertEquals(50000, dealer.getTill());
        assertEquals(1, dealer.getStockCount());
    }
}
