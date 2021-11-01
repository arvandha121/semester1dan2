package Jobsheet1Praktikum;
import java.util.*;
public class Praktikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nim : ");
        String nim = sc.next();
        String substring = nim.substring(nim.length()-2);
        
        System.out.println(substring);
        
        int perseInt = Integer.parseInt(substring);
        
        for(int i=1; i<=nim.length(); i++){
            for(int j=1; j<=perseInt; j++){
                if(j==1){
                    System.out.print("Senin ");
                }else if(j==2){
                    System.out.print("Selasa ");
                }else if(j==3){
                    System.out.print("Rabu ");
                }else if(j==4){
                    System.out.print("Kamis ");
                }else if(j==5){
                    System.out.print("Jumat ");
                }else if(j==6){
                    System.out.print("Sabtu ");
                }else if(j==7){
                    System.out.print("Minggu ");
                }
            }
        }
    }
}
