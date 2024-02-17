import javax.sound.sampled.*;
import java.util.Objects;
import java.util.Scanner;

public class Battle_for_the_fortress {

    public static void main(String[] args){
        System.out.println("Добро пожаловать в игру \"Битва за крепость\"!\n" +
                "\n" +
                "Крепость здорова. У вас есть 100 золота.\n" +
                "\n" +
                "Выберите действие:\n" +
                "1. Построить оборонительное сооружение\n" +
                "2. Нанять бойца\n" +
                "3. Пропустить ход и подготовиться к нападению врагов\n" +
                "В любое время вы можете ввести exit если вы хотите закончить игру\n"+
                "Вы можете выбрать действие действие (1-3):\n" +
                "Для начала давайте построим первое оборонительное ваше сооружение.\n" +
                "Введите действие номер \"1\"\n");
        Scanner scanner = new Scanner(System.in);
        String input = null;
        Fortress My_fortes = new Fortress();

        while(!Objects.equals(input, "exit")){
            input = scanner.nextLine(); //выбор действия
            while(!Objects.equals(input, "1")){
                input = scanner.nextLine(); //выбор действия
            }
            System.out.println("Вы вибрали: " + input + "\n" +
                "1. Wall - 50g\n" +
                "2. Tower - 200g\n" +
                "3. Stronghold - 500g\n" +
                    "Выберите оборонителоьное сооружение. У вас в наличии: " + My_fortes.gold + "g." );


            if (Objects.equals(input, "exit")){break;}
        }


        do {
            input = scanner.nextLine(); //выбор действия


        } while (!Objects.equals(input, "exit"));
        scanner.close();// Закрытие Scanner после использования (необязательно, но рекомендуется)
    }



}