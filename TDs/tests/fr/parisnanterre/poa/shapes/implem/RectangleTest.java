package fr.parisnanterre.poa.shapes.implem;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.*;

public class RectangleTest {

    Rectangle r1;

    @org.testng.annotations.BeforeMethod
    public void setUp() {
        Point2D p = new Point2D(0,0);
        r1= new Rectangle(p,4,3);
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() {
        r1=null;
    }

    @org.testng.annotations.Test
    public void testSurface() {
        assertEquals(r1.surface(),12);
    }

    @org.testng.annotations.Test
    public void testPerimetre() {
        assertEquals(r1.perimetre(),14);
    }
}