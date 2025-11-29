package big_num;

import java.math.BigDecimal;

/**
 * @author 张 书航
 */
public class BigDecimalExercise {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("65.99999999999999999999999999" +
                "9999999999999999999999999999999");
        BigDecimal add = bigDecimal.add(new BigDecimal("0.00000000000000000000000000" +
                "0000000000000000000000000000001"));
        BigDecimal subtract = bigDecimal.subtract(new BigDecimal("0.000000000000000000000000000" +
                "9999"));
        BigDecimal multiply = bigDecimal.multiply(new BigDecimal("2"));
        BigDecimal divide = bigDecimal.divide(new BigDecimal("2"));
        System.out.println(bigDecimal);
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
    }
}

class Person {
    private String name;
    private Double sal;

    public Person(String name, Double sal) {
        this.name = name;
        this.sal = sal;
    }
}
