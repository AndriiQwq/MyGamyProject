import java.util.Objects;
import java.util.Scanner;

public class Fortress {

    public float health = 100;
    public float gold = 100;

    public void Construction_of_defences(){
        System.out.println(
                "1. Wall - 50g\n" +
                "2. Tower - 200g\n" +
                "3. Stronghold - 500g\n" +
                "Выберите оборонителоьное сооружение или введите 'x' чтобы выйти. У вас в наличии: " + gold + "g.");
        Scanner scanner = new Scanner(System.in);
        String input = null;
        while(!Objects.equals(input, "x")){
            input = scanner.nextLine(); //выбор действия

            /// / // / '/ / / / / / / / / /   // / / /
        }
        scanner.close();// Закрытие Scanner после использования (необязательно, но рекомендуется)

    }

    public void Hiring_fighters(){

    }

    public void Handling_Enemy_Attacks(){

    }

}
