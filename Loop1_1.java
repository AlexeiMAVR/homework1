package homework2;

//    1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
//    Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю. Пример: Ввели 5, должно
//    получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//    	1.1.1. Используя только цикл



public class Loop1_1 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int sum = 1;
        for (int i = 1; i < number + 1; i++) {
            sum *= i;
            System.out.print(i);
            if (i != number) {
                System.out.print("*");
            }

        }
        System.out.println("= " + sum);
    }
}


