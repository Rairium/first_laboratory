package com.company.task_14_15;

public class LabeledPoint extends PointTask {
    private String label;

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) this.getX();
        result = 31 * result + (int) this.getY();
        result = 31 * result + label.hashCode();
        System.out.print("The hashcode of our LabelPoint is:");
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof LabeledPoint)) {
            return false;
        }
        LabeledPoint labeledPoint = (LabeledPoint) obj;
        return this.getX() == getX() &&
                this.getY() == getY() &&
                labeledPoint.label.equals(label);
    }

    @Override
    public String toString() {
        return "LabelPoint label is: " + label + "\n" + "LabelPoint coordinates are: \n x = " + getX() + " \n y = " + getY();
    }

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

//
