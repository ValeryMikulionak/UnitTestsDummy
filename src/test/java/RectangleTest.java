import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    Rectangle rec = new Rectangle(5.5D,4);

    @Test
    public void getLengthTest() {
        assertEquals ("The result is not correct", 5.5D, rec.getLength(),0);
    }

    @Test
    public void setLengthTest() {
        rec.setLength(8);
        assertEquals ("The result is not correct", 8, rec.getLength(),0);
    }

    @Test
    public void getWidthTest() {
        assertEquals("The result is not correct", 4, rec.getWidth(),0);
    }

    @Test
    public void setWidthTest() {
        rec.setWidth(3.5D);
        assertEquals("The result is not correct", 3.5D, rec.getWidth(),0);
    }

    @Test
    public void getAreaTest() {
        assertEquals("The result is not correct", 22, rec.getArea(),0);
    }

}
