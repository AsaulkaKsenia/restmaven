package ru.netology.restmaven.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {

    @Test
    void shouldCalculateForRest() {
        RestService service = new RestService();
        int income = 10_000;
        int expence = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expence, treshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForJob() {
        RestService service = new RestService();
        int income = 100_000;
        int expence = 60_000;
        int treshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expence, treshold);
        Assertions.assertEquals(expected, actual);
    }
}

