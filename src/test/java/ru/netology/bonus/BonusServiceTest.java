package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    @CsvSource(
            value = {
                    "'registered user, bonus under limit',100060,true,30"
            }
    )
    void shouldCalculateForRegisteredAndLLowLimit(String testName, long amount, boolean registered, long expected) {

        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    @CsvSource(
            value = {
                    "'registered user, bonus under limit',1000000060,true,500"
            }
    )
    void shouldCalculateForRegisteredAndUnderLimit(String testName, long amount, boolean registered, long expected) {

        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
}