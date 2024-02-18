package Fighter;

public class WARRIOR extends Fighter{

    private static int WARRIOR_count = 0;
    public WARRIOR(float attack, boolean active){
        super( attack, active);
        WARRIOR_count++;
        //protected float attack;
        // Поле attack в классе Fighter объявлено с модификатором protected, что означает,
        // что оно доступно внутри этого класса и его подклассов.
        // Класс WARRIOR является подклассом Fighter, поэтому он имеет доступ к полю attack и может его изменять.
        info();
    }

    public void info(){
        System.out.println( "WARRIOR count: " + WARRIOR_count);
        System.out.println( "Attack of WARRIOR: " + 3 * WARRIOR_count);
    }

}
