package Enemy;

public abstract class Enemy {


    public static float damage;
    public static float Attack_power;

    public static int count;
    protected boolean active;


    public Enemy(float Attack_power, int count, boolean active){
        Enemy.Attack_power = Attack_power;
        Enemy.count = count;
        this.active = active;
    }

    public static void attack_all() {
        damage = Goblin.attack() + Orc.attack() + Skeleton.attack();
    }


    public abstract void Damage_to_the_fortress();

}
