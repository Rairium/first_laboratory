package com.company.task_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointMutatorTest {

    @Test
    public void translate() {
        PointMutator pm1 = new PointMutator();
        PointMutator pm2 = new PointMutator(2, 2);
        pm1.translate(2, 2);
        assertEquals(pm1.getX(), pm2.getX(), 0);
        assertEquals(pm1.getY(), pm2.getY(), 0);
    }


    @Test
    public void scale() {
        PointMutator pm1 = new PointMutator();
        PointMutator pm2 = new PointMutator(4, 4);
        pm1.translate(2, 2);
        pm1.scale(2);
        assertEquals(pm1.getX(), pm2.getX(), 0);
        assertEquals(pm1.getY(), pm2.getY(), 0);
    }
}