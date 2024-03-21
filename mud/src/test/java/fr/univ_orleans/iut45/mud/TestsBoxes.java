package fr.univ_orleans.iut45.mud;
import org.junit.*;
import static org.junit.Assert.assertEquals;
public class TestsBoxes{
    @Test
    public void testBoxFromJSONSimple(){
        // use the file test1.json in ressources folder
        String path =
        TestsBoxes.class.getClassLoader().getResource("test1.json").getFile();
        Box b = Box.fromJSON(path);
        assertEquals(b.capacity(), -1);
        assertTrue(b.isOpen());
    }
}

   