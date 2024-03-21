package fr.univ_orleans.iut45.mud;
import org.junit.*;
import static org.junit.Assert.assertEquals;
public class TestsBoxes{
    @Test
    public void testBoxFromJSONSimple(){
        // use the file test1.json in ressources folder
        TestsBoxes.class.getClassLoader().getResource("test1.json").getFile();
        try {
            Box b = Box.fromJSON();
            assertEquals(10, b.getThing().getCapacity());
            assertEquals("Box1", b.getName());
            System.out.println("Nom de la Box : "+b.getName());
            System.out.println("Thing : "+b.getThing());

        } 
        catch(Exception IOException) {
            System.out.println("Impossible de trouver ou lire le ficher");
        }
    }
       
}

   