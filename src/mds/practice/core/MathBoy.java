package mds.practice.core;

import static java.lang.Short.MAX_VALUE;

import java.util.Date;

public class MathBoy {
    public static void main(String[] args) {
        long x = 123456789;
        short y = 22766; // max value of short is 32767
        System.out.println("%1$+10d %2$010d " + x + " " + ( MAX_VALUE - y));
        System.out.println(new Date());
    }
}
