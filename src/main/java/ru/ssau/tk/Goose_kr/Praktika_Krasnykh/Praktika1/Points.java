package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

public class Points {
    private Points() {
    }

    public static double length(Point obj) {
        return obj.length();
    }

    public static Point sum(Point firstObj, Point secondObj) {
        return new Point(firstObj.x + secondObj.x, firstObj.y + secondObj.y, firstObj.z + secondObj.z);
    }

    public static Point subtract(Point firstObj, Point secondObj) {
        return new Point(firstObj.x - secondObj.x, firstObj.y - secondObj.y, firstObj.z - secondObj.z);
    }

    public static Point multiply(Point firstObj, Point secondObj) {
        return new Point(firstObj.x * secondObj.x, firstObj.y * secondObj.y, firstObj.z * secondObj.z);
    }

    public static Point divide(Point firstObj, Point secondObj) {
        return new Point(firstObj.x / secondObj.x, firstObj.y / secondObj.y, firstObj.z / secondObj.z);
    }

    public static Point enlarge(Point obj, double number) {
        return new Point(obj.x * number, obj.y * number, obj.z * number);
    }

    public static double scalarProduct(Point firstObj, Point secondObj) {
        return firstObj.x * secondObj.x + firstObj.y * secondObj.y + firstObj.z * secondObj.z;
    }

    public static Point vectorProduct(Point firstObj, Point secondObj) {
        return new Point(firstObj.y * secondObj.z - firstObj.z * secondObj.y, firstObj.z * secondObj.x - firstObj.x * secondObj.z, firstObj.x * secondObj.y - firstObj.y * secondObj.x);
    }

    public static Point opposite(Point obj) {
        return new Point(-obj.x, -obj.y, -obj.z);
    }

    public static Point inverse(Point obj) {
        return new Point(1 / obj.x, 1 / obj.y, 1 / obj.z);
    }

}
