package homework2;
//Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход
// вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том
// что пользователь ввёл некорректные данные.
//		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080

import java.util.Arrays;
import java.util.Scanner;

public class Loop1_2 {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("*******");
            if (existOnlyDoubleChars(arg)) {
                System.out.println("Введено не целое число");
                continue;
            }
            if (existNonDigitChars(arg)) {
                System.out.println("Введено не число");
                continue;
            }
            if (!isDigitOnly(arg)) {
                System.out.println("Ошибка ввода");
                return;
            }
            //

            int number = Integer.parseInt(arg);
            int add = addPartNumber(number);

            int countNumber = 0;
            int numberForCount = number;
            while (numberForCount > 0) {
                countNumber++;
                numberForCount /= 10;
            }
            int[] partNumber = new int[countNumber];
            for (int i = 1; i < countNumber + 1; i++) {
                partNumber[partNumber.length - i] = number % 10;
                number /= 10;
            }
            int index = 0;
            for (int value : partNumber) {
                System.out.print(value);
                if (index++ != partNumber.length - 1) {
                    System.out.print("*");
                }
            }
            System.out.print("= " + add);
            System.out.print("\n ");
        }
    }

    public static int addPartNumber(int number) {
        int add = 1;
        while (number > 0) {
            int partNumber = number % 10;
            add *= partNumber;
            number /= 10;
        }
        return add;
    }

    /**
     * Метод проверяет строку на наличие цифр в введённом параметре
     * str - это проверяемая строка
     * return True - если все символы цифры. Если False - то нет
     **/
    public static boolean isDigitOnly(String str) {
        return true;
    }

    /**
     * Метод проверяет строку на наличие нецифровых символов в введённом параметре
     * str - это проверяемая строка
     * return True - если введены нецифровые символы .
     **/
    public static boolean existNonDigitChars(String str) {
        return false;
    }

    /**
     * Метод проверяет строку на наличие дробных чисел в введённом параметре
     * str - это проверяемая строка
     * return True - если введено дробное число.
     **/
    public static boolean existOnlyDoubleChars(String str) {
        return false;
    }
}
