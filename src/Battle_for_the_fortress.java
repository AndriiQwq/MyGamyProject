import DefenseStructure.DefenseStructure;
import DefenseStructure.Wall;
import Fighter.*;
import DefenseStructure.*;
import Enemy.*;

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
        //Fortress My_fortes = new Fortress(100, 100);


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
                "Выберите оборонителоьное сооружение. У вас в наличии: " + Fortress.gold + "g.");

        while(!Objects.equals(input, "exit")){
            input = scanner.nextLine(); //выбор действия

            switch (input) {
                case "1" -> {
                    Wall wall = new Wall(3, true);
                    //wall.defence = 3;
                    System.out.println("Стена была построена.\nНажми x чтобы выйти.");
                    Fortress.gold -= 50;
                    input = "exit";
                }
                case null, default -> System.out.println("Недостаточно денег, выбери другой вариант");
            }
        }
        input = null;

        while(!Objects.equals(input, "x")){
            input = scanner.nextLine(); //выбор действия
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
            if (Objects.equals(input, "exit"))
                throw new RuntimeException("Принудительное завершение программы");
        }

        while(!Objects.equals(input, "exit")){
            System.out.println(
                    "1. warrior - 50g\n" +
                            "2. archer - 200g\n" +
                            "3. mage - 500g\n" +
                            "Выберите воина. У вас в наличии: " + Fortress.gold + "g.");
            input = scanner.nextLine(); //выбор действия
            switch (input) {
                case "1" -> {
                    WARRIOR warrior = new WARRIOR(3, true);
                    System.out.println("Вы наняли воина.\nНажми x чтобы выйти.");
                    Fortress.gold -= 50;
                    input = "exit";
                }
                case null, default -> System.out.println("Недостаточно денег, выбери другой вариант");
            }
        }

        System.out.println("У вас осталось: " + Fortress.gold + "g.");

        /////////////////////////////////////////////////////////////////////////////

        while (Objects.equals(input, "3")) {
            System.out.println("""
                    "1. Построить оборонительное сооружение"
                    "2. Нанять бойца"
                    "3. Пропустить ход и подготовиться к нападению врагов"
                    """);
            if (Objects.equals(input, "exit"))
                throw new RuntimeException("Принудительное завершение программы");
        }

        //WARRIOR warrior4 = new WARRIOR(3, true);
        //warrior4.info();
//        info(new WARRIOR(0, true), new ARCHER(0, true), new MAGE(0, true), new Fighter(0, true),
//                new Wall(0, true), new Tower(0, true), new Stronghold(0, true), new DefenseStructure(( float) 0, true) {
//                }
//        );
//        info(null, null, null, null, null, null, null, null);


        do {
            input = scanner.nextLine(); //выбор действия

            if (Objects.equals(input, "exit"))
                throw new RuntimeException("Принудительное завершение программы");
        } while (!Objects.equals(input, "exit"));
        scanner.close();// Закрытие Scanner после использования (необязательно, но рекомендуется)
    }

//    private static void info(WARRIOR warrior, ARCHER archer, MAGE mage, Fighter fighter,
//                             Wall wall, Tower tower, Stronghold stronghold, DefenseStructure defenseStructure
//
//    ) {
//        warrior.info();
//        archer.info();
//        mage.info();
//        fighter.attack_info();
//
//        wall.info();
//        tower.info();
//        stronghold.info();
//        defenseStructure.def_info();
//    }

    public void hire_a_warrior(){
        System.out.println(
                "1. warrior - 50g\n" +
                        "2. archer - 200g\n" +
                        "3. mage - 500g\n" +
                        "Выберите воина или введите 'x' чтобы выйти. У вас в наличии: " + Fortress.gold + "g.");
        Scanner scanner = new Scanner(System.in);
        String input = null;
        while(!Objects.equals(input, "x")){
            input = scanner.nextLine(); //выбор действия

            if(Objects.equals(input, "1") && Fortress.gold >= 50) {
                WARRIOR warrior = new WARRIOR(3, true);
                break;
            } else if (Objects.equals(input, "2") && Fortress.gold >= 200) {
                ARCHER archer = new ARCHER(5, true);
                break;
            } else if (Objects.equals(input, "3") && Fortress.gold >= 500) {
                MAGE mage = new MAGE(7, true);
                break;
            }
        }
        scanner.close();// Закрытие Scanner после использования (необязательно, но рекомендуется)

    }



}