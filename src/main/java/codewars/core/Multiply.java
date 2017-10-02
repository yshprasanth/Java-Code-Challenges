package codewars.core;

import java.math.BigDecimal;

public class Multiply {

        public static Double multiply(Double a, Double b) {
            return new BigDecimal(a).multiply(new BigDecimal(b)).doubleValue();
        }

        public static void main(String[] args) {

        }
}
