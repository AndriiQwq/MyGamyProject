package DefenseStructure;

import DefenseStructure.DefenseStructure;

public class Stronghold extends DefenseStructure {

    private static int Stronghold_count = 0;
    public Stronghold(float defence, boolean created){
        super(defence,  created);
        //DefenseStructure.defence += 7;
        Stronghold_count++;
        info();
    }

    public void info(){
        System.out.println( "Stronghold count: "+ Stronghold_count);
        System.out.println( "Defence of all Strongholds(1i = 7d): "+ 7 * Stronghold_count);
    }

}
