package Fighter;

public class MAGE extends Fighter{

    private static int MAGE_count = 0;
    public MAGE(float attack, boolean active){
        super( attack, active);
        MAGE_count++;
        info();
    }

    public void info(){
        System.out.println( "MAGE count: " + MAGE_count);
        System.out.println( "Attack of MAGE: " + 7 * MAGE_count);
    }

}
