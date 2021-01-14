package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

public class PointInstance {
    public static void main(String[] args) {
        Point firstPoint = new Point(0., 0., 0.);
        Point secondPoint = new Point(-8., -10., 5.);
        Point thirdPoint = new Point(3.25, 100., 59.4);

        System.out.println("firstPoint = (" + firstPoint.x + ", " + firstPoint.y + ", " + firstPoint.z + ")");
        System.out.println("secondPoint = (" + secondPoint.x + ", " + secondPoint.y + ", " + secondPoint.z + ")");
        System.out.println("thirdPoint = (" + thirdPoint.x + ", " + thirdPoint.y + ", " + thirdPoint.z + ")");
    }
}
