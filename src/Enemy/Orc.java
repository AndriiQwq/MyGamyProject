package Enemy;

public class Orc extends Enemy{

    public static int Orc_count = 0;

    public Orc(float Attack_power, int count,  boolean active){
        super( Attack_power, count, active);
        Orc_count++;
        Enemy.count++;
    }

    @Override
    public void Damage_to_the_fortress() {
        try {
            damage += attack();
        }catch (StackOverflowError e){
            System.out.println("StackOverflowError");
        }finally {
            damage += attack();
        }
    }

    public static float attack(){
        return Attack_power * Orc_count;
    }


}
