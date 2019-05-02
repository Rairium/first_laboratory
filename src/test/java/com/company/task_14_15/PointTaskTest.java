package com.company.task_14_15;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTaskTest {

    @Test
    public void hashCode1() {
        PointTask pointTask = new PointTask(2, 3);
        assertEquals(pointTask.hashCode(), 16402);
    }

    @Test
    public void equals1() {
        PointTask pt1 = new PointTask(2, 3);
        PointTask pt2 = new PointTask(2, 3);
        assertTrue(pt1.equals(pt2));
    }

    @Test
    public void toString1() {
        PointTask pointTask = new PointTask(2, 3);
        assertEquals(pointTask.toString(), "Point coordinates are: \n x = " + pointTask.getX() + " \n y = " + pointTask.getY());
    }

    @Test
    public void getX() {
        PointTask pointTask = new PointTask(2, 3);
        assertEquals(pointTask.getX(), 2, 0);
    }

    @Test
    public void getY() {
        PointTask pointTask = new PointTask(2, 3);
        assertEquals(pointTask.getY(), 3, 0);
    }
}