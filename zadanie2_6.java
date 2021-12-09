package homework1;

public class zadanie2_6 {
    public static void main(String[] prior) {
        int x = 2;
        int y = 8;
        boolean ternar = 5 + 7 > 20;
        int ifTru = 68;
        int ifElse = 22 * 2 >> x++;

        int a = 5 + 7 > 20 ? 68 : 22 * 2 >> x++;

        double z = (ternar ? ifTru : ifElse) / --y;
        //double z = a / --y;

        System.out.println(z);

    }
}
