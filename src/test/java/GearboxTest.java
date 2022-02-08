import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearboxTest {

    private Gearbox gearbox;

    @Before
    public void before(){
        gearbox = new Gearbox(6);
    }

    @Test
    public void hasNumOfGears(){
        assertEquals(6, gearbox.getNoOfGears());
    }


}

