package mds.practice.core;

import java.util.ArrayList;
import java.util.List;

class Cereal {
}

public class Flakes extends Cereal {
    public static void main(String[] args) {

        boolean b = false;
        int i = 7;
        double d = 1.23;
        float f = 4.65f;
        String s = "test";

        System.out.format(" %b", b);
        System.out.format(" %d", i);
        System.out.format(" %f", f);
        System.out.format(" %f", d);
        System.out.format(" %s", s);
        // Legal
        List<Cereal> c1 = new ArrayList<Cereal>();

        // Illegal
        /*List<Flakes> c0 = new List<Flakes>();
        List<Cereal> c2 = new ArrayList<Flakes>();
        List<Flakes> c3 = new ArrayList<Cereal>();
        List<Object> c4 = new ArrayList<Flakes>();
        ArrayList<Cereal> c5 = new ArrayList<Flakes>();*/


    }
}
