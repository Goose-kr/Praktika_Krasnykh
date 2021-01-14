package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static java.lang.Double.*;

public class PointsTest {
    private final double DOUBLE = 0.0001;

    private boolean equalsApproximately(double firstNumber, double secondNumber) {
        return ((isNaN(firstNumber) && isNaN(secondNumber)) || (isInfinite(firstNumber) && isInfinite(secondNumber)) || Math.abs(firstNumber - secondNumber) < DOUBLE);
    }

    private boolean equalsApproximately(Point firstPoint, Point secondPoint) {
        return equalsApproximately(firstPoint.x, secondPoint.x) && equalsApproximately(firstPoint.y, secondPoint.y) && equalsApproximately(firstPoint.z, secondPoint.z);
    }

    Point firstPoint = new Point(3., 4., 5.);
    Point secondPoint = new Point(0., -1., 1.);

    @Test
    public void testSum() {
        assertTrue(equalsApproximately(Points.sum(firstPoint, secondPoint), new Point(3., 3., 6.)));
    }

    @Test
    public void testSubtract() {
        assertTrue(equalsApproximately(Points.subtract(firstPoint, secondPoint), new Point(3., 5., 4.)));
    }

    @Test
    public void testMultiply() {
        assertTrue(equalsApproximately(Points.multiply(firstPoint, secondPoint), new Point(0., -4., 5.)));
    }

    @Test
    public void testDivide() {
        assertTrue(equalsApproximately(Points.divide(firstPoint, secondPoint), new Point(POSITIVE_INFINITY, -4., 5.)));
    }

    @Test
    public void testEnlarge() {
        assertTrue(equalsApproximately(Points.enlarge(firstPoint, 5.), new Point(15., 20., 25.)));
    }

    @Test
    public void testOpposite() {
        assertTrue(equalsApproximately(Points.opposite(secondPoint), new Point(0., 1., -1.)));
    }

    @Test
    public void testInverse() {
        assertTrue(equalsApproximately(Points.inverse(secondPoint), new Point(POSITIVE_INFINITY, -1., 1.)));
    }

    @Test
    public void testVectorProduct() {
        assertTrue(equalsApproximately(Points.vectorProduct(firstPoint, secondPoint), new Point(9., -3., -3.)));
    }

    @Test
    public void testLength() {
        assertEquals(Points.length(firstPoint), Math.sqrt(50), DOUBLE);
    }

    @Test
    public void testScalarProduct() {
        assertEquals(Points.scalarProduct(firstPoint, secondPoint), 1., DOUBLE);
    }

}