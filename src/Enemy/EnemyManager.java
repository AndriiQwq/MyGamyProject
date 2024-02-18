package Enemy;

import java.util.Random;
public class EnemyManager {
    static Random random = new Random();
    // Генерируем случайное число в диапазоне от 0 до 1
    private static int random_counter = random.nextInt(2);
    public static int randomNumberInRange0 = random.nextInt(5);
    public static int randomNumberInRange1 = random.nextInt(4);
    public static int randomNumberInRange2 = random.nextInt(3);

    // Генерируем случайное число с плавающей точкой от 0 до 1
    //public static double randomDouble = random.nextDouble();

    static float randomFloat = 0.3f + (1.1f - 0.3f) * random.nextFloat();

    public static int counter = 0;
    public static float attackAll() {
        Goblin.attack_all();
        Goblin goblin = new Goblin(3 * randomFloat, (randomNumberInRange0 + counter), true);
        goblin.Damage_to_the_fortress();
        Orc orc = new Orc(5 * randomFloat, randomNumberInRange1 + counter, true);
        orc.Damage_to_the_fortress();
        Skeleton skeleton = new Skeleton(7 * randomFloat, randomNumberInRange2 + counter, true);
        skeleton.Damage_to_the_fortress();
        counter += random_counter;
        //counter *= randomDouble;
        return Enemy.damage;
    }
}