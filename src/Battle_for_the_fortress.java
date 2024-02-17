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
                "Выберите действие (1-3):\n");
        Scanner scanner = new Scanner(System.in);

        while(true){
            String name = scanner.nextLine(); //выбор действия




            if (Objects.equals(name, "exit")){break;}
        }
        scanner.close();// Закрытие Scanner после использования (необязательно, но рекомендуется)


    }

}