package exercises.technology.test;

import exercises.technology.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComputerTest {
    Computer comp;

    @Before
    public void createComputerObject() {
        comp = new Computer(10000, "Gateway", "Desktop");
    }

    @Test
    public void addStorageReturnsCorrectAmount() {
        assertEquals(15000, comp.addStoarge(5000));
    }

    @Test
    public void powerSwitchTogglesCorrectly() {
        comp.power(true);
        assertTrue(comp.isOn());
    }
}
