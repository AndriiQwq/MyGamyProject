package Enemy;

public class Skeleton extends Enemy{

    public static int Skeleton_count = 0;
    public Skeleton(float Attack_power, int count,  boolean active){
        super( Attack_power, count, active);
        Skeleton_count++;
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
        return Attack_power * Skeleton_count;
    }


}
