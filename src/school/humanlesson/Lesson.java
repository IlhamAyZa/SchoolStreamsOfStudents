package school.humanlesson;

public class Lesson {
    
    String name;
    Hardness hardness;
    
    public Lesson ( String name, Hardness hardness ){
        this.name = name;
        this.hardness = hardness;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setHardness(Hardness hardness) {
        this.hardness = hardness;
    }

    public Hardness getHardness() {
        return hardness;
    }
}
