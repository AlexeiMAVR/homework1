package homework1;

import java.util.Objects;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();

//        if (Objects.equals(name , "Вася" )){
//            System.out.println("Привет!");
//            System.out.println("Я тебя так долго ждал.");
//            //System.out.println("Привет!\nЯ тебя так долго ждал.");
//        }else {
//            if (Objects.equals(name , "Анастасия" )){
//                System.out.println("Я тебя так долго ждал.");
//            } else {
//                System.out.println("Добрый день. А вы кто?");
//            }
//        }
//    }
        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал.");
            //System.out.println("Привет!\nЯ тебя так долго ждал.");
        }
        if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал.");
        }
        if (!Objects.equals(name, "Анастасия") && !Objects.equals(name, "Вася")) {
            System.out.println("Добрый день. А вы кто?");
        }
    }
}
