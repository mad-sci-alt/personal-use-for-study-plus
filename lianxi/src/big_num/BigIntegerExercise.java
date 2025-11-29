package big_num;

import java.math.BigInteger;

/**
 * @author 张 书航
 */
public class BigIntegerExercise {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("59999999999999999999999999999999");
        BigInteger add = bigInteger.add(new BigInteger("2"));
        BigInteger subtract = bigInteger.subtract(new BigInteger("3"));
        BigInteger multiply = bigInteger.multiply(new BigInteger("2"));
        BigInteger divide = bigInteger.divide(new BigInteger("2"));
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);


    }
}
