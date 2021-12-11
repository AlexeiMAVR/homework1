package homework2;
// Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint,
// если хотите можете добавить проверки на корректность ввода данных. Число положительное, максимум long:
//    1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
//    Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю. Пример: Ввели 5, должно
//    получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//    	1.1.1. Используя только цикл

import java.util.Scanner;

public class loop1_1 {
    public static void main(String[] args) {
        Scanner concole = new Scanner(System.in);
        System.out.println("Введите пожалуйста число");
        int[] data = new int[concole.nextInt()];
        int value = 1;
        long maxValue = 100000;
        for (int i = 0; i < data.length; i++) {
            data[i] = value;
            value++;
        }
        long sum = 1;
        for (long item : data) {

            if (sum < maxValue) {
                sum *= item;
            } else {
                System.out.println("Результат больше " + maxValue);
                break;
            }
        }
        System.out.println(sum);
    }
}