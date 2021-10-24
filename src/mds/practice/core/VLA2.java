package mds.practice.core;

import java.util.Arrays;
import java.util.Comparator;

public class VLA2 implements Comparator<VLA2> {
    int dishSize;

    public VLA2(int d) {
        this.dishSize = d;
    }

    public static void main(String[] args) {
        VLA2[] va = {new VLA2(40), new VLA2(200), new VLA2(60)};

        int inta[] = {34, 10,22,35};
        //Arrays.sort(inta);
        Arrays.stream(inta).forEach(System.out::println);

        int indexInt = Arrays.binarySearch(inta, 0, 2, 45);
        System.out.println("Index B4 Sorting "+ indexInt);

        /*int indexB4 = Arrays.binarySearch(va, new VLA2(40), va[0]);
        System.out.println("Index B4 Sorting "+ indexB4);

        Arrays.sort(va, va[1]);
        Arrays.stream(va).forEach(System.out::println);
        int index = Arrays.binarySearch(va, new VLA2(40), va[0]);
        System.out.println(index + " ");
        index = Arrays.binarySearch(va, new VLA2(80), va[0]);
        System.out.println(index);*/
    }

    @Override
    public int compare(VLA2 o1, VLA2 o2) {
        return o2.dishSize - o1.dishSize;
    }

    @Override
    public String toString() {
        return "VLA2{" +
                "dishSize=" + dishSize +
                '}';
    }
}
