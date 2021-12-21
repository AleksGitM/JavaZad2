package pl.akademia108;

import java.math.BigInteger;
import static java.math.BigInteger.valueOf;

public class Main {

    public static void main(String[] args) {
        byte x8 = 127;
        short x16 = 32767;
        int x32 = 2147483647;
        long x64 = 9223372036854775807L;
        int x8a = x8 * 2;
        int x16a = x16 * 2;
        long x32a = (long) x32 * 2L;
        BigInteger x64a = valueOf(x64);
        BigInteger x64b = x64a.multiply(new BigInteger("2"));
        System.out.println(x8a);
        System.out.println(x16a);
        System.out.println(x32a);
        System.out.println(x64b);
    }
}
