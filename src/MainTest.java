import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class MainTest {
    private Main m;

@BeforeEach
    public void init(){
    m=new Main();

}
@Test
    public void testBinarySearch_oneElement(){
    int[]actual={1};
    assertEquals(0,m.binarSuche(1,actual));
}
    @Test
    public void testBinarySearch_noElements(){
        int[]actual={};
        assertEquals(-1,m.binarSuche(2,actual));
    }

    @Test
    public void testBinarySearch_withOutElement(){
        int[]actual={1,1,1,1,1,};
        assertEquals(-1,m.binarSuche(2,actual));
    }

    @Test
    public void testBinarySearch_fallingElement(){
        int[]actual={9,8,7,6,5,4,3,2,1};
        assertEquals(-1,m.binarSuche(9,actual));
    }
    @Test
    public void testBinarySearch_ascendingElement(){
        int[]actual={1,2,3,4,5,6,7,8,9};
        assertEquals(0,m.binarSuche(1,actual));
    }






}