package mds.practice.core;

enum Weather {
    RAINY, Sunny;
    int count = 0;

    Weather() {
        System.out.println("c ");
        count++;
    }
}

public class WeatherTest {
    static Weather w;

    public static void main(String[] args) {
        System.out.println(w.RAINY.count + " " + w.Sunny.count + " ");
    }

}