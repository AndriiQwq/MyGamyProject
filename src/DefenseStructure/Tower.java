package DefenseStructure;

import DefenseStructure.DefenseStructure;

public class Tower extends DefenseStructure {

    private static int Tower_count = 0;
    public Tower(float defence, boolean created){
        super(defence, created);
        //DefenseStructure.defence += 5;
        Tower_count++;
        info();
    }

    public void info(){
        System.out.println( "Tower count: "+ Tower_count);
        System.out.println( "Defence of all Tower(1i = 5d): "+ 5 * Tower_count);
    }

}
