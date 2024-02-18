package DefenseStructure;

public class Wall extends DefenseStructure {

    private static int Wall_count = 0;
    public Wall(float defence, boolean created) {
        super(defence, created);
        //DefenseStructure.defence += 3;
        Wall_count++;
        info();
    }

    public void info(){
        System.out.println( "Wall count: "+ Wall_count);
        System.out.println( "Defence of all Wall(1i = 3d): " + 3 * Wall_count);
    }
}
