package fr.univ_orleans.iut45.mud;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Thing truc = new Thing(5);
        Thing machin = new Thing(15);
        Box b = new Box("Boite", truc);
        //b.add(truc);
        //b.add(machin);
        //b.actionLook();
    }
}
