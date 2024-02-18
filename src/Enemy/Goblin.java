package Enemy;

public class Goblin extends Enemy{


    public static int Goblin_count = 0;
    public Goblin(float Attack_power, int count,  boolean active){
        super( Attack_power, count, active);
        if(active) {
            Goblin_count++;
            Enemy.count++;
        }
    }

    public void Damage_to_the_fortress() {
        try {
            damage = attack();
        }catch (StackOverflowError e){
            System.out.println("StackOverflowError");
        }finally {
            damage = attack();
        }
    }

    public static float attack() {
        return Attack_power * Goblin_count;
    }


}
