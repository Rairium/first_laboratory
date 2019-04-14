package com.company.task_14_15;

public class PointTask {
    private double x;
    private double y;

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) x;
        result = 31 * result + (int) y;
        System.out.print("The hashcode of our Point is:");
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof PointTask)) {
            return false;
        }
        PointTask point = (PointTask) obj;
        return point.x == x &&
                point.y == y;
    }

    @Override
    public String toString() {
        return "Point coordinates are: \n x = " + x + " \n y = " + y;
    }

    public PointTask(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
