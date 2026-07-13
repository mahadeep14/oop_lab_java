import java.util.Scanner;
public class pattern5 {
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for(int space=0;space<n-i;space++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for(int space=0;space<n-i;space++){
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
