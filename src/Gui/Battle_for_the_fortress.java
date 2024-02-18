package Gui;

import Fighter.*;
import DefenseStructure.*;

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
                 В любое время вы можете ввести exit если вы хотите закончить игру.
                 Вы можете выбрать действие действие (1-3):
                 Для начала давайте построим первое оборонительное ваше сооружение. """);
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println(" Введите действие номер \"1\"\n");
        input = scanner.nextLine();
        while(!Objects.equals(input, "1")){
            input = scanner.nextLine(); //выбор действия
            System.out.println("Введите действие номер \"1\" \n");
            if (Objects.equals(input, "exit"))
                throw new RuntimeException("Принудительное завершение программы");
        }
        System.out.println("Вы вибрали: " + input + "\n" +
            "1. DefenseStructure.Wall - 50g\n" +
            "2. DefenseStructure.Tower - 200g\n" +
            "3. DefenseStructure.Stronghold - 500g\n" +
                "Выберите оборонителоьное сооружение. У вас в наличии: " + Fortress.gold + "g.\n");

        while(!Objects.equals(input, "exit")){
            input = scanner.nextLine(); //выбор действия

            switch (input) {
                case "1" -> {
                    Wall wall = new Wall(3, true);
                    //wall.defence = 3;
                    System.out.println("Стена была построена.\nНажми x чтобы выйти.\n");
                    Fortress.gold -= 50;
                    input = "exit";
                }
                case "2", "3" -> {System.out.println("Недостаточно денег, выбери другой вариант\n");}
                case null, default -> System.out.println("Ошибка, выбери другой вариант\n");
            }
        }
        input = null;

        while(!Objects.equals(input, "x")){
            input = scanner.nextLine(); //выбор действия
            System.out.println("Нажми x чтобы выйти.\n");
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
            input = scanner.nextLine(); //выбор действия
            System.out.println("Введите действие номер \"2\"\n");
            if (Objects.equals(input, "exit"))
                throw new RuntimeException("Принудительное завершение программы");
        }

        System.out.println(
                "1. warrior - 50g\n" +
                        "2. archer - 200g\n" +
                        "3. mage - 500g\n" +
                        "Выберите воина. У вас в наличии: " + Fortress.gold + "g.");
        while(!Objects.equals(input, "exit")){
            input = scanner.nextLine(); //выбор действия
            switch (input) {
                case "1" -> {
                    WARRIOR warrior = new WARRIOR(3, true);
                    System.out.println("Вы наняли воина.\nНажми x чтобы выйти.");
                    Fortress.gold -= 50;
                    input = "exit";
                }
                case "2", "3" -> {System.out.println("Недостаточно денег, выбери другой вариант\n");}
                case null, default -> System.out.println("Ошибка, выбери другой вариант\n");
            }
            System.out.println();
        }
        while(!Objects.equals(input, "x")){
            input = scanner.nextLine();
        }

        System.out.println("У вас осталось: " + Fortress.gold + "g.");

        /////////////////////////////////////////////////////////////////////////////
        System.out.println("""
                    "1. Построить оборонительное сооружение"
                    "2. Нанять бойца"
                    "3. Пропустить ход и подготовиться к нападению врагов"
                    """);

        while (Objects.equals(input, "3")) {
            System.out.println("""
                Теперь мы готовы к нападению, введи команду "3" для продолжения.
            
                """);
            input = scanner.nextLine();
            if (Objects.equals(input, "exit"))
                throw new RuntimeException("Принудительное завершение программы");
        }
        System.out.println("\n>>>Удачной игры\nВведите команду \"help\" если вым нужна помощь\n");

        do {
            input = scanner.nextLine(); //выбор действия

            switch (input){
                case "1" -> Fortress.Construction_of_defences(scanner);
                case "2" -> Fortress.Hiring_fighters(scanner);
                case "3" -> Fortress.Handling_Enemy_Attacks();
                case "info" -> Fortress.info();
                case "help" -> Fortress.help();
                case "cheat" -> Fortress.gold += 100000;
                case null, default -> System.out.println("Если вам нужна помощь введите команду \"help\"");
            }


            if (Objects.equals(input, "exit"))
                throw new RuntimeException("Принудительное завершение программы");
        } while (!Objects.equals(input, "exit"));
        scanner.close();// Закрытие Scanner после использования (необязательно, но рекомендуется)
    }

}