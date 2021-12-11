package homework2;
//Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход
// вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том
// что пользователь ввёл некорректные данные.
//		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080

import java.util.Arrays;
import java.util.Scanner;

public class loop1_2 {
    public static void main(String[] args) {
        Scanner concole = new Scanner(System.in);
        System.out.println("Введите пожалуйста число");

        int[] data = new int[concole.nextInt()];
        for (int i = 0; i < data.length; i++) {
            System.out.println("Введите число?");
            data[i] = concole.nextInt();
        }
            long sum = 1;
            for (int item : data) {
                sum *= item;
            }
            //System.out.println(data[i]);
            //System.out.println(sum);
            System.out.println(Arrays.toString(data) + " = " + sum);

        }
}