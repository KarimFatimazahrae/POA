package fr.parisnanterre.poa.shapes.implem;

import fr.parisnanterre.poa.shapes.api.Translatable2D;

public abstract class Shape2D  implements Translatable2D {

    private Point2D refPoint;

    public Shape2D(Point2D refPoint) {
        this.refPoint = refPoint;
    }

    public Point2D getRefPoint() {
        return refPoint;
    }

    public void setRefPoint(Point2D refPoint) {
        this.refPoint = refPoint;
    }
}
