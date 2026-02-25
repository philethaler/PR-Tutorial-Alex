package org.example.domain;

// Exercise 2 Ben Issue B AmountTest

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmountTest {

    @Test
    void amountConversionTest() {
        Amount oneHundredUSD = Amount.of(100.0, Currency.USD);
        double amount = oneHundredUSD.amount();

        assertEquals(100.0, amount);
    }
}
