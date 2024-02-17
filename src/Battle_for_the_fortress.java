import DefenseStructure.Wall;

import java.util.Objects;
import java.util.Scanner;

public class Battle_for_the_fortress {

    public static void main(String[] args){
        System.out.println("""
                Добро пожаловать в игру "Битва за крепость"!" 
                "Крепость здорова. У вас есть 100 золота." 
                "Выберите действие: 
                "1. Построить оборонительное сооружение"
                "2. Нанять бойца" 
                "3. Пропустить ход и подготовиться к нападению врагов"
                "В любое время вы можете ввести exit если вы хотите закончить игру"
                "Вы можете выбрать действие действие (1-3):"
                "Для начала давайте построим первое оборонительное ваше сооружение." +
                "Введите действие номер "1" """);
        Scanner scanner = new Scanner(System.in);
        String input = null;
        Fortress My_fortes = new Fortress();


        input = scanner.nextLine(); //выбор действия
        while(!Objects.equals(input, "1")){
            input = scanner.nextLine(); //выбор действия
            if (Objects.equals(input, "exit"))
                throw new RuntimeException("Принудительное завершение программы");
        }
        System.out.println("Вы вибрали: " + input + "\n" +
            "1. DefenseStructure.Wall - 50g\n" +
            "2. DefenseStructure.Tower - 200g\n" +
            "3. DefenseStructure.Stronghold - 500g\n" +
                "Выберите оборонителоьное сооружение. У вас в наличии: " + My_fortes.gold + "g.");
        Fortress fortress = new Fortress();

        while(!Objects.equals(input, "exit")){
            input = scanner.nextLine(); //выбор действия

            switch (input) {
                case "1" -> {
                    Wall wall = new Wall(3, true);
                    System.out.println("Стена была построена.\nНажми x чтобы выйти.");
                    input = "exit";
                }
                case null, default -> System.out.println("Недостаточно денег, выбери другой вариант");
            }
            if (Objects.equals(input, "exit"))
                throw new RuntimeException("Принудительное завершение программы");
        }

        while(!Objects.equals(input, "x")){
            if (Objects.equals(input, "exit"))
                throw new RuntimeException("Принудительное завершение программы");
        }

        System.out.println(
                """
                        Выберите действие:
                        1. Построить оборонительное сооружение
                        2. Нанять бойца
                        3. Пропустить ход и подготовиться к нападению врагов
                        Теперь давай наймем еового бойца.
                        Введите действие номер "2"
                        """);

        while(!Objects.equals(input, "2")){
            if (Objects.equals(input, "exit"))
                throw new RuntimeException("Принудительное завершение программы");
        }












        do {
            input = scanner.nextLine(); //выбор действия

            if (Objects.equals(input, "exit"))
                throw new RuntimeException("Принудительное завершение программы");
        } while (!Objects.equals(input, "exit"));
        scanner.close();// Закрытие Scanner после использования (необязательно, но рекомендуется)
    }



}