package org.example.domain;

// Exercise 2 Alex Issue A ChfAccountTest Class, Part 2
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ChfAccountTest {
    @Test
    void simpleTest() {
        ChfAccount alexAccount = new ChfAccount("Alex");
        Double actualBalance = alexAccount.getBalance();
        assertEquals(0.0, actualBalance);
    }
}