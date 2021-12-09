package homework1;

public class zadanie2_1_5 {
    public static void main(String[] prior) {
        int x = 5;
        int y = 2;
        double  z = 8.00000000; // пункт 2.1
        double b = x + y/z;
        System.out.println(b);

                // пункт 2.2
        System.out.println((x+y)/z);

                  // пункт 2.3
        System.out.println((x + y++)/z);

                // пункт 2.4
        System.out.println((x + y++)/--z);

                 // пункт 2.5
       System.out.println((y * x >> y++)/--z);

    }
}
