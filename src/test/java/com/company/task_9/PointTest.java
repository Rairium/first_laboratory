package com.company.task_9;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void translate() {
        Point p1 = new Point(2, 2).translate(4, 4);
        Point p2 = new Point(6, 6);
        assertEquals(p1.getX(), p2.getX(), 0);
        assertEquals(p1.getY(), p2.getY(), 0);
    }

    @Test
    public void translateWithZero() {
        Point p1 = new Point(2, 2).translate(0, 0);
        Point p2 = new Point(2, 2);
        assertEquals(p1.getX(), p2.getX(), 0);
        assertEquals(p1.getY(), p2.getY(), 0);
    }

    @Test
    public void scale() {
        Point p1 = new Point(2, 2).scale(3);
        Point p2 = new Point(6, 6);
        assertEquals(p1.getX(), p2.getX(), 0);
        assertEquals(p1.getY(), p2.getY(), 0);
    }

    @Test
    public void scaleWithZero() {
        Point p1 = new Point(2, 2).scale(0);
        Point p2 = new Point();
        assertEquals(p1.getX(), p2.getX(), 0);
        assertEquals(p1.getY(), p2.getY(), 0);
    }
}