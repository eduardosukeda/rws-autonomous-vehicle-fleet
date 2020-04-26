package br.com.fiap.rwsautonomousvehiclefleet.util;

import java.math.BigDecimal;

public class Util {

    public static Integer generateMinutes() {
        Integer min = 1;
        Integer max = 5;
        Integer numRandom = (int) (Math.random() * (max - min + 1) + min);
        return numRandom;
    }

    public static BigDecimal generatePriceCourse() {
        BigDecimal randomBigDecimal = new BigDecimal(7).add(new BigDecimal(Math.random()).multiply(new BigDecimal(40).subtract(new BigDecimal(7))));
        return randomBigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
