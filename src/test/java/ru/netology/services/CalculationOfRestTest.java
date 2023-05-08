package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculationOfRestTest {
    @Test
    public void calculate() {
        CalculationOfRest calc = new CalculationOfRest();
        int expsale = 3;
        int actsale = calc.calculate(10000, 3000, 20000);
        Assertions.assertEquals(expsale, actsale);
    }

    @Test
    public void calculate2() {
        CalculationOfRest calc = new CalculationOfRest();
        int expsale = 2;
        int actsale = calc.calculate(100000, 60000, 150000);
        Assertions.assertEquals(expsale, actsale);
    }

}
