package ru.netology.restmaven.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")

    public void shouldCalculateForRest(int expected, int income, int expence, int treshold) {
        RestService service = new RestService();

        int actual = service.calculate(income, expence, treshold);
        Assertions.assertEquals(expected, actual);
    }

}