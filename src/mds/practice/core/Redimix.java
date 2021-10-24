package mds.practice.core;

public class Redimix {
    Redimix() {
        System.out.println("r ");
    }

    public static void main(String[] args) {
        new Redimix();
    }
}

class Concreate extends Sand {
    Concreate() {
        System.out.println("c ");
    }

    private Concreate(String s) {
    }
}

abstract class Sand {
    Sand() {
        System.out.println("s ");
    }
}