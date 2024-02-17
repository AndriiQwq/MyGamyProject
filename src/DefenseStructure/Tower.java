package DefenseStructure;

import DefenseStructure.DefenseStructure;

public class Tower extends DefenseStructure {

    private int Tower_count = 0;
    public Tower(float defence, boolean created){
        super(defence, created);
        defence += 5;
        Tower_count++;
    }

    public void info(){
        System.out.println( "Tower count: "+ Tower_count);
        System.out.println( "Defence of Tower: "+ 5 * Tower_count);
    }

}
