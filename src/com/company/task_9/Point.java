package com.company.task_9;

public final class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double xTranslate, double yTranslate) {
        return new Point(x + xTranslate, y + yTranslate);
    }

    public Point scale(double scaleFactor) {
        return new Point((x * scaleFactor), (y * scaleFactor));
    }
}


