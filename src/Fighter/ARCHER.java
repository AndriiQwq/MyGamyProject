package Fighter;

public class ARCHER extends Fighter{

    private static int ARCHER_count = 0;
    public ARCHER(float attack, boolean active){
        super( attack, active);
        ARCHER_count++;
        info();
    }

    public void info(){
        System.out.println( "ARCHER count: " + ARCHER_count);
        System.out.println( "Attack of ARCHER: " + 5 * ARCHER_count);
    }

}
