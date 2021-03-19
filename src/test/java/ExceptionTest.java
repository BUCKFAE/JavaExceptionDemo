import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ExceptionTest {


    @Test
    void exceptionTesting() {

        // Checks if exception is thrown an has correct type
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Main m = new Main();
            m.testMethod01();
        }, "Expected testMethod01 to raise a IllegalArgumentException, but nothing was raised");


        // Tests for exact message match
        assertEquals("A bad argument was given!", exception.getMessage());

        // Test for substring in message
        assertTrue(exception.getMessage().contains("bad"), "Exception did not contain the word \"bad\"");

    }
}