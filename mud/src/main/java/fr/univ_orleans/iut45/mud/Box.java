package fr.univ_orleans.iut45.mud;
import com.google.gson.Gson;
import com.google.gson.GsonBuider;
import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException;

public class Box {
    private String name;
    private Thing thing;

    public Box(String name, Thing thing) {
        this.name = name;
        this.thing = thing;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Thing getThing() {
        return thing;
    }
    public void setThing(Thing thing) {
        this.thing = thing;
    }

    public static Box fromJSON(String path) {
        GsonBuider builder = new GesonBuilder();
        Gson gson= builder.create();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        Box res = gson.fromJSON(bufferedReader, Box.class);
        return res;
    }
}
