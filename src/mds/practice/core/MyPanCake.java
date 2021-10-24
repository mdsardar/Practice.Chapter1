package mds.practice.core;

import java.util.ArrayList;
import java.util.List;

interface Pancake {
    List<String> doStuff(List<String> s);
}

public class MyPanCake implements Pancake {
    public static void main(String[] args) {
        List<String> x = new ArrayList<String>();
        x.add("3");
        x.add("7");
        x.add("5");
        List<String> y = new MyPanCake().doStuff(x);
        y.add("1");
        System.out.println(x);

    }

    public List<String> doStuff(List<String> z) {
        z.add("9");
        return z;
    }
}