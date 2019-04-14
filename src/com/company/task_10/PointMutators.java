package com.company.task_10;

public final class PointMutators {
    private int x;
    private int y;

    public PointMutators() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
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


