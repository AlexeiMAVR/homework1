package homework1;

public class zadanie1_4 {
    public static void main(String[] args) {

        int a = 42; // 101010
        int b = 15; // 1111

        int c = a & b;
        int c1 = a &= b;
        int c2 = a | b;
        int c3 = a |= b;
        int c4 = a ^ b;
        int c5 = a ^= b;
        int c6 = a >> b;
        int c7 = a >>= b;
        int c8 = a >>> b;
        int c9 = a << b;
        int c10 = a <<= b;
        int c11 = a >>>= b;

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
        System.out.println(c10);
        System.out.println(c11);
    }
}
