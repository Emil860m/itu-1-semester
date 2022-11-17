package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest
{
    Point p;
    Point q;
    Rectangle r;

    @BeforeEach
    public void setUp()
    {
        p = new Point(-2,3);
        q = new Point(4,-2);
        r = new Rectangle(p, q);
    }

    @Test
    public void Test1(){
        int result = r.p.x + r.q.x;
        assertEquals(result,2);
    }

    @Test
    void where() {
    }
}
