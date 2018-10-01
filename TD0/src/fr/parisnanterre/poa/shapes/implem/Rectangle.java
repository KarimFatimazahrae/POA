package fr.parisnanterre.poa.shapes.implem;

public class Rectangle extends Shape2D
{
    private double length;
    private double width;

    public Rectangle(Point2D refPoint , double length, double width) {
        super(refPoint);
        this.length=length;
        this.width=width;
    }

    public double surface(){
        return 12;
    }

    @Override
    public double perimetre() {
        return 0;
    }
}
