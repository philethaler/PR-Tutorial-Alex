package org.example.domain;

// Exercise 2 Ben Issue B AmountTest

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmountTest {

    @Test
    void amountConversionTest() {
        Amount oneHundredCHF = Amount.of(100.0, Currency.CHF);
        double amount = oneHundredCHF.amount();

        assertEquals(10000.0, amount);
    }
}
