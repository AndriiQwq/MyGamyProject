package Fighter;

import java.util.Objects;
import java.util.Scanner;

public abstract class Fighter {

    public static float attack;
    public boolean active;

    public Fighter(float attack, boolean active) {
        Fighter.attack += attack;
        this.active = active;
        attack_info();
    }

    public void Attack(){

    }

    public void Defence(){

    }

    public void attack_info(){
        System.out.println("Attack: " + attack);
    }

}
