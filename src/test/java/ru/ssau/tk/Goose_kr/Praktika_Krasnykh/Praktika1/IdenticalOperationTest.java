package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    private final double DOUBLE = 0.0001;
    IdenticalOperation identical = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(identical.apply(5), 5, DOUBLE);
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DOUBLE);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DOUBLE);
        assertEquals(identical.apply(Double.NaN), Double.NaN, DOUBLE);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(identical.applyTriple(5), 5, DOUBLE);
        assertEquals(identical.applyTriple(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DOUBLE);
        assertEquals(identical.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DOUBLE);
        assertEquals(identical.applyTriple(Double.NaN), Double.NaN, DOUBLE);
    }
}