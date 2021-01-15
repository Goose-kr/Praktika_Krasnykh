package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {
    private final double DOUBLE = 0.0001;
    SqrtOperation sqrt = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(sqrt.apply(5), Math.sqrt(5), DOUBLE);
        assertEquals(sqrt.apply(Double.NEGATIVE_INFINITY), Double.NaN, DOUBLE);
        assertEquals(sqrt.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DOUBLE);
        assertEquals(sqrt.apply(Double.NaN), Double.NaN, DOUBLE);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(sqrt.applyTriple(5), Math.sqrt(Math.sqrt(Math.sqrt(5))), DOUBLE);
        assertEquals(sqrt.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DOUBLE);
        assertEquals(sqrt.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DOUBLE);
        assertEquals(sqrt.applyTriple(Double.NaN), Double.NaN, DOUBLE);
    }
}