package Jobsheet2Praktikum;
import java.util.*;
public class PacManMain {
    public static void main(String[] args) {
        PacMan pc = new PacMan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan koordinat x : ");
        pc.x = sc.nextInt();
        System.out.println("Masukkan koordinat y : ");
        pc.y = sc.nextInt();
        System.out.println("Masukkan Batas width : ");
        pc.width = sc.nextInt();
        System.out.println("Masukkan Batas height : ");
        pc.height = sc.nextInt();
        System.out.println("----------------------------");
        pc.printPosition();
    }
}
