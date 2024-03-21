
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
}
