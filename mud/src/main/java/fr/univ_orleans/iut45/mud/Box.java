package fr.univ_orleans.iut45.mud;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        return this.thing;
    }
    public void setThing(Thing thing) {
        this.thing = thing;
    }

    public static Box fromJSON() throws IOException {
        Path path = Paths.get("/home/iut45/Etudiants/o22303038/Documents/TP_TD/R2.03/TP4_MVN/mud/src/test/resources/test1.json");
        String content = String.join("",Files.readAllLines(path));
        //GsonBuilder builder = new GsonBuilder();
        //builder.setPrettyPrinting();
        Box box = new Gson().fromJson(content, Box.class);
        //BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        //Box res = gson.fromJSON(bufferedReader, Box.class);
        return box;
    }
}
