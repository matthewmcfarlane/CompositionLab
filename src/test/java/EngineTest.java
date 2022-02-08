import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Before
    public void before(){
        engine = new Engine("Diesel", 1800);
    }

    @Test
    public void engineHasFuelType(){
        assertEquals("Diesel", engine.getFuelType());
    }

    @Test
    public void engineHasSize(){
        assertEquals(1800, engine.getSize());
    }
}
