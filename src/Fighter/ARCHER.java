package Fighter;

public class ARCHER extends Fighter{

    private int ARCHER_count = 0;
    public ARCHER(float attack, boolean active){
        super( attack, active);
        attack += 5;
        ARCHER_count++;
    }

    public void info(){
        System.out.println( "ARCHER count: " + ARCHER_count);
        System.out.println( "Attack of ARCHER: " + 5 * ARCHER_count);
    }

}
