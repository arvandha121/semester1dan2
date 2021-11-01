import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your code number: ");
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            int x = i * n;
            System.out.println(n+" * "+i+" = "+x);
        }
    }
}
