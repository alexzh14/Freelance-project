package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FreelanceServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

    public void testCalculateMonth(int expected, int income, int expenses, int threshold) {
        FreelanceService service = new FreelanceService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}


//    @Test

//    public void testCalculateMonthCase1() {
//        FreelanceService service = new FreelanceService();
//
//       int actual = service.calculate(10_000, 3_000, 20_000);
//        int expected = 3;
//
//       Assertions.assertEquals(expected, actual);
//   }
//
//    @Test
//    public void testCalculateMonthCase2() {
//        FreelanceService service = new FreelanceService();
//
//        int actual = service.calculate(100_000, 60_000, 150_000);
//        int expected = 2;
//
//       Assertions.assertEquals(expected, actual);
//    }
//}
