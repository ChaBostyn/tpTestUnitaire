package umons;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {
    @Test
    public void testaddition() {
        Addition addition = new Addition();

        assertNotEquals(addition.add(5,1), 45);
    }
}