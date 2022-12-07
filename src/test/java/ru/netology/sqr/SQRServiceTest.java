package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    public void calcTestWhenFewNumbersFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;


        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void calcTestWhenNumbersUnderLimit() {
        SQRService service = new SQRService();

        int actual = service.calc(99, 100);
        int expected = 1;


        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void calcTestWhenNumbersAboveLimit() {
        SQRService service = new SQRService();

        int actual = service.calc(9801, 9802);
        int expected = 1;


        Assertions.assertEquals(expected, actual);
    }

}