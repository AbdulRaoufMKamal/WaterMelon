import static org.junit.Assert.*;

public class WaterMelonTest {

    @org.junit.Test
    public void waterMelon() {
        WaterMelon waterMelon = new WaterMelon();
        assertEquals("YES",waterMelon.waterMelon(8));
        assertEquals("NO",waterMelon.waterMelon(5));
        assertEquals("YES",waterMelon.waterMelon(10));
        assertEquals("YES",waterMelon.waterMelon(4));
        assertEquals("NO",waterMelon.waterMelon(3));
        assertEquals("NO",waterMelon.waterMelon(2));
        assertEquals("NO",waterMelon.waterMelon(1));
        assertEquals("NO",waterMelon.waterMelon(7));
        assertEquals("YES",waterMelon.waterMelon(6));
        assertEquals("NO",waterMelon.waterMelon(9));
        assertEquals("NO",waterMelon.waterMelon(53));
        assertEquals("NO",waterMelon.waterMelon(77));
        assertEquals("YES",waterMelon.waterMelon(32));
        assertEquals("YES",waterMelon.waterMelon(44));
        assertEquals("YES",waterMelon.waterMelon(98));
        assertEquals("NO",waterMelon.waterMelon(99));
        assertEquals("YES",waterMelon.waterMelon(90));
        assertEquals("NO",waterMelon.waterMelon(67));
        assertEquals("YES",waterMelon.waterMelon(100));
        assertEquals("YES",waterMelon.waterMelon(88));

    }
}