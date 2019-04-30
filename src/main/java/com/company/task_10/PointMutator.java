package com.company.task_10;

public final class PointMutator {
    private double x;
    private double y;

    public PointMutator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public PointMutator() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void translate(int xTranslate, int yTranslate) {
        this.x += xTranslate;
        this.y += yTranslate;
    }

    public void scale(double scaleFactor) {
        this.x *= scaleFactor;
        this.y *= scaleFactor;
    }
}


