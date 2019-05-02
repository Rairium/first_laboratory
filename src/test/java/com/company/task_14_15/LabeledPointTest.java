package com.company.task_14_15;

import org.junit.Test;

import static org.junit.Assert.*;

public class LabeledPointTest {

    @Test
    public void hashCode1() {
        LabeledPoint labeledPoint = new LabeledPoint("Name", 2, 3);
        assertEquals(labeledPoint.hashCode(), 2928857);
    }

    @Test
    public void equals1() {
        LabeledPoint labeledPoint1 = new LabeledPoint("Name", 2, 3);
        LabeledPoint labeledPoint2 = new LabeledPoint("Name", 2, 3);
        assertTrue(labeledPoint1.equals(labeledPoint2));
    }

    @Test
    public void toString1() {
        LabeledPoint labeledPoint = new LabeledPoint("Name", 2, 3);
        assertEquals(labeledPoint.toString(), ("LabelPoint label is: " + labeledPoint.getLabel() + "\n" + "LabelPoint coordinates are: \n x = " + labeledPoint.getX() + " \n y = " + labeledPoint.getY()));
    }

    @Test
    public void getLabel() {
        LabeledPoint labeledPoint = new LabeledPoint("Name", 2, 3);
        assertEquals(labeledPoint.getLabel(), "Name");
    }
}