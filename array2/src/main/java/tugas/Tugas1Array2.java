package tugas;

import java.util.*;
import java.util.Arrays;
public class Tugas1Array2 {
    public static void main(String Args[]){
        //================================================================================================================================
        Scanner input = new Scanner(System.in);
        char[]arr = {'A','B','D','E','F','G','H',
                       'L','N','T'};
        String []kota[] = {
            {"B","A","N","T","E","N"},
            {"J","A","K","A","R","T","A"},
            {"B","A","N","D","U","N","G"},
            {"C","I","R","E","B","O","N"},
            {"B","O","G","O","R"},
            {"P","E","K","A","L","O","N","G","A","N"},
            {"S","E","M","A","R","A","N","G"},
            {"S","U","R","A","B","A","Y","A"},
            {"M","A","L","A","N","G"},
            {"T","E","G","A","L"}
        };
        //================================================================================================================================
        System.out.println("=======PLAT NOMER SESUAI KOTA=======");
        System.out.println("-----------------------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------------");
        //================================================================================================================================
        System.out.println("  A"+" = "+kota[0][0]+" "+kota[0][1]+" "+kota[0][2]+" "+kota[0][3]+" "+kota[0][4]+" "+kota[0][5]);
        System.out.println("  B"+" = "+kota[1][0]+" "+kota[1][1]+" "+kota[1][2]+" "+kota[1][3]+" "+kota[1][4]+" "+kota[1][5]
                            +" "+kota[1][6]);
        System.out.println("  D"+" = "+kota[2][0]+" "+kota[2][1]+" "+kota[2][2]+" "+kota[2][3]+" "+kota[2][4]+" "+kota[2][5]
                            +" "+kota[2][6]);
        System.out.println("  E"+" = "+kota[3][0]+" "+kota[3][1]+" "+kota[3][2]+" "+kota[3][3]+" "+kota[3][4]+" "+kota[3][5]
                            +" "+kota[3][6]);
        System.out.println("  F"+" = "+kota[4][0]+" "+kota[4][1]+" "+kota[4][2]+" "+kota[4][3]+" "+kota[4][4]);
        System.out.println("  G"+" = "+kota[5][0]+" "+kota[5][1]+" "+kota[5][2]+" "+kota[5][3]+" "+kota[5][4]+" "+kota[5][5]
                            +" "+kota[5][6]+" "+kota[5][7]+" "+kota[5][8]+" "+kota[5][9]);
        System.out.println("  H"+" = "+kota[6][0]+" "+kota[6][1]+" "+kota[6][2]+" "+kota[6][3]+" "+kota[6][4]+" "+kota[6][5]
                            +" "+kota[6][6]+" "+kota[6][7]);
        System.out.println("  L"+" = "+kota[7][0]+" "+kota[7][1]+" "+kota[7][2]+" "+kota[7][3]+" "+kota[7][4]+" "+kota[7][5]
                            +" "+kota[7][6]+" "+kota[7][7]);
        System.out.println("  N"+" = "+kota[8][0]+" "+kota[8][1]+" "+kota[8][2]+" "+kota[8][3]+" "+kota[8][4]+" "+kota[8][5]);
        System.out.println("  T"+" = "+kota[9][0]+" "+kota[9][1]+" "+kota[9][2]+" "+kota[9][3]+" "+kota[9][4]);
        System.out.println("-----------------------------------");
        //================================================================================================================================
        System.out.print("Masukkan Plat Nomor Kendaraan : ");
        String plat = input.next();
        String in = plat.toUpperCase();
        char platkota = in.charAt(0);
        int total=10;
        switch(platkota){
            case 'A':
                System.out.println("BANTEN");
            break;
            case 'B':
                System.out.println("JAKARTA");
            break;
            case 'D':
                System.out.println("BANDUNG");
            break;
            case 'E':
                System.out.println("CIREBON");
            break;
            case 'F':
                System.out.println("BOGOR");
            break;
            case 'G':
                System.out.println("PEKALONGAN");
            break;
            case 'H':
                System.out.println("SEMARANG");
            break;
            case 'L':
                System.out.println("SURABAYA");
            break;
            case 'N':
                System.out.println("MALANG");
            break;
            case 'T':
                System.out.println("TEGAL");
            break;
            default:
                System.out.println("Inputan yang anda masukkan Salah!");
        }
    }
}