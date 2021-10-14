package mds.practice.core;

public class Jail {
    private int x = 4;

    public static void main(String[] args) {
        // Local varis can't have access modifiers
        // protected int x = 6;
        int x = 6;
        new Jail().new Cell().slam();
    }

    class Cell {
        void slam() {
            System.out.println("Throw away key" + x);
        }
    }
}
