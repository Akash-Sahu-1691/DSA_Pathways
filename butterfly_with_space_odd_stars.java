package Loops_in_Java;

public class butterfly_with_space_odd_stars {
    public static void main(String[] args) {

        int n = 4;
        int s;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            for (int j = 1; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            s = i;
            if (s == n)
                s = n - 1;

            for (int j = 1; j <= s; j++) {
                System.out.print("*");

            }
            System.out.println();
        }


        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            for (int j = 1; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }
            s = i;
            if (s == n)
                s = n - 1;

            for (int j = 1; j <= s; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
