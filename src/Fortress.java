import DefenseStructure.Stronghold;
import DefenseStructure.Tower;
import DefenseStructure.Wall;

import java.util.Objects;
import java.util.Scanner;

public class Fortress {

    public float health = 100;
    public float gold = 100;

    public void Construction_of_defences(){
        System.out.println(
                "1. DefenseStructure.Wall - 50g\n" +
                "2. DefenseStructure.Tower - 200g\n" +
                "3. DefenseStructure.Stronghold - 500g\n" +
                "Выберите оборонителоьное сооружение или введите 'x' чтобы выйти. У вас в наличии: " + gold + "g.");
        Scanner scanner = new Scanner(System.in);
        String input = null;
        while(!Objects.equals(input, "x")){
            input = scanner.nextLine(); //выбор действия

            if(Objects.equals(input, "1") && gold >= 50) {
                Wall wall = new Wall(3, true);
                break;
            } else if (Objects.equals(input, "2") && gold >= 200) {
                Tower tower = new Tower(5, true);
                break;
            } else if (Objects.equals(input, "3") && gold >= 500) {
                Stronghold stronghold = new Stronghold(7, true);
                break;
            }
        }
        scanner.close();// Закрытие Scanner после использования (необязательно, но рекомендуется)

    }

    public void Hiring_fighters(){

    }

    public void Handling_Enemy_Attacks(){

    }

}
