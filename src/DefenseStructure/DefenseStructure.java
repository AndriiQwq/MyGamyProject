package DefenseStructure;

public abstract class DefenseStructure {

    public boolean active;

    public static float defence;

    public DefenseStructure(float defence, boolean active){
        DefenseStructure.defence += defence;
        this.active = active;
        def_info();
    }

    public void def_info(){
        System.out.println( "Defence: " + defence);
    }


}
