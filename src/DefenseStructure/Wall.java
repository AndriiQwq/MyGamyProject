package DefenseStructure;

public class Wall extends DefenseStructure {

    private int Wall_count = 0;
    public Wall(float defence, boolean created) {
        super(defence, created);
        defence += 3;
        Wall_count++;
    }

    public void info(){
        System.out.println( "Wall count: "+ Wall_count);
        System.out.println( "Defence of Wall: " + 3 * Wall_count);
    }
}
