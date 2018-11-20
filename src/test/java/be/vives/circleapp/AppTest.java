package be.vives.circleapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Test setter of radius
     */
    @Test
    public void testSetRadius()
    {
      double expected = 14.33;

      Circle circle = new Circle();
      circle.setRadius(expected);
      assertEquals(expected, circle.getRadius(), 0.01);
    }

    /**
     * Test negative radius
     */
    @Test
    public void testNegativeRadius()
    {
      double expected = 14.33;

      Circle circle = new Circle();
      circle.setRadius(-expected);
      assertEquals("Radius should not be negative", expected, circle.getRadius(), 0.01);
    }

    /**
     * Test area of radius
     */
    @Test
    public void testArea()
    {
      double radius = 5.23;
      double expected = Math.PI*radius*radius;

      Circle circle = new Circle();
      circle.setRadius(radius);
      assertEquals(expected, circle.getArea(), 0.01);
    }

    /**
     * Test circumference of radius
     */
    @Test
    public void testCircumference()
    {
      double radius = 5.23;
      double expected = 2*Math.PI*radius;

      Circle circle = new Circle();
      circle.setRadius(radius);
      assertEquals(expected, circle.getCircumference(), 0.01);
    }
}
