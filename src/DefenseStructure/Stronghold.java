package DefenseStructure;

import DefenseStructure.DefenseStructure;

public class Stronghold extends DefenseStructure {

    private int Stronghold_count = 0;
    public Stronghold(float defence, boolean created){
        super(defence,  created);
        defence += 7;
        Stronghold_count++;
    }

    public void info(){
        System.out.println( "Stronghold count: "+ Stronghold_count);
        System.out.println( "Defence of Stronghold: "+ 7 * Stronghold_count);
    }

}
