package Gui;

import DefenseStructure.*;
import Enemy.EnemyManager;
import Fighter.*;

import java.util.Objects;
import java.util.Scanner;

import static Enemy.EnemyManager.attackAll;

public class Fortress {

    public static float health = 100;
    public static float gold = 100;

    public Fortress(float health, float gold){}

    public static void Hiring_fighters(Scanner scanner){
        System.out.println(
                "1. warrior - 50g\n" +
                        "2. archer - 200g\n" +
                        "3. mage - 500g\n" +
                        "Выберите воина или введите 'x' чтобы выйти. У вас в наличии: " + Fortress.gold + "g.");
        String input = null;
        while(!Objects.equals(input, "x")){
            input = scanner.nextLine(); //выбор действия

            if(Objects.equals(input, "1") && gold >= 50) {
                WARRIOR warrior = new WARRIOR(3, true);
                gold -= 50;
                break;
            } else if (Objects.equals(input, "2") && gold >= 200) {
                ARCHER archer = new ARCHER(5, true);
                gold -= 200;
                break;
            } else if (Objects.equals(input, "3") && gold >= 500) {
                MAGE mage = new MAGE(7, true);
                gold -= 500;
                break;
            }
        }
    }

    public static void Construction_of_defences(Scanner scanner){
        System.out.println(
                "1. Wall - 50g\n" +
                        "2. Tower - 200g\n" +
                        "3. Stronghold - 500g\n" +
                        "Выберите оборонителоьное сооружение или введите 'x' чтобы выйти.. У вас в наличии: " + Fortress.gold + "g.");
        String input = null;
        while(!Objects.equals(input, "x")){
            input = scanner.nextLine(); //выбор действия

            if(Objects.equals(input, "1") && Fortress.gold >= 50) {
                Wall wall = new Wall(3, true);
                gold -= 50;
                break;
            } else if (Objects.equals(input, "2") && Fortress.gold >= 200) {
                Tower tower = new Tower(5, true);
                gold -= 200;
                break;
            } else if (Objects.equals(input, "3") && Fortress.gold >= 500) {
                Stronghold stronghold = new Stronghold(7, true);
                gold -= 500;
                break;
            }
        }
    }

    public static void Handling_Enemy_Attacks(){
        if (attackAll() == 0) {
            System.out.println("You win");
            System.exit(0);
        }
        float attack = DefenseStructure.defence + Fighter.attack - (float) (attackAll() * 0.2);
        if (attack <= 0) {
            health += attack;
            System.out.println("Вам нанесли: " + (-attack) + " урона");
        }
        if (health >= 0 ) {
            gold += (EnemyManager.randomNumberInRange0 + EnemyManager.counter) * 5 +
                    (EnemyManager.randomNumberInRange1 + EnemyManager.counter) * 20 +
                    (EnemyManager.randomNumberInRange2 + EnemyManager.counter) * 50;
        } else {
            System.out.println("Game over");
            System.exit(0);
        }
        info();
    }

    public static void info(){
        System.out.println("Defense: " + DefenseStructure.defence);
        System.out.println("Attack: " + Fighter.attack);
        System.out.println("Hp of Fortress: " + health);
        System.out.println("Gold: " + gold);
    }

    public static void help(){
        System.out.println("""
                    "1" -> Построить оборонительное сооружение"
                    "2" -> Нанять бойца"
                    "3" -> Пропустить ход и подготовиться к нападению врагов"
                    Вы всегда можете узнать дополнительную информацию если введете команду "info"
                    """);
    }


}
