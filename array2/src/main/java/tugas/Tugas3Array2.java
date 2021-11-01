package tugas;
import java.util.*;
public class Tugas3Array2 {
    public static void main(String[] args) {
        //======================================================================
        Scanner input = new Scanner(System.in);
        int[]arr[] = {
            {15,10,7,12,25},{37,22,30,17,11},{8,37,4,18,32}
        };
        System.out.println("");
        System.out.println("\t==========Nilai Terbesar Baris & Kolom==========");
        //======================================================================
        System.out.println(Arrays.deepToString(arr));
        System.out.println("---------------------------------------------------");
        //======================================================================
        for (int[] arr1 : arr) {
                System.out.println(Arrays.toString(arr1));
        }
        //======================================================================
        System.out.println("---------------------------------------------------");
        System.out.println("Maka output yang akan ditampilkan pada layar adalah : ");
        int a=0;
        for(; a<1; a++){
            int b = 0;
            for(; b<1; b++){
                int nilai = arr[1][0];
                System.out.println("nilai terbesar kolom-"+b+" adalah = "+nilai);
            }
        }
        int b=1;
        for(; b<2; b++){
            int c = 1;
            for(; c<2; c++){
                int nilai = arr[2][1];
                System.out.println("nilai terbesar kolom-"+c+" adalah = "+nilai);
            }
        }
        int c=2;
        for(; c<3; c++){
            int d = 2;
            for(; d<3; d++){
                int nilai = arr[1][2];
                System.out.println("nilai terbesar kolom-"+d+" adalah = "+nilai);
            }
        }
        int d=3;
        for(; d<4; d++){
            int e = 3;
            for(; e<4; e++){
                int nilai = arr[2][3];
                System.out.println("nilai terbesar kolom-"+e+" adalah = "+nilai);
            }
        }
        int e=4;
        for(; e<5; e++){
            int f = 4;
            for(; f<5; f++){
                int nilai = arr[2][4];
                System.out.println("nilai terbesar kolom-"+f+" adalah = "+nilai);
            }
        }
        System.out.println("---------------------------------------------------");
        int baris1=0;
        for(; baris1<1; baris1++){
            int kolom1 = 0;
            for(; kolom1<1; kolom1++){
                int nilai = arr[0][4];
                System.out.println("nilai terbesar baris-"+baris1+" adalah = "+nilai);
            }
        }
        int baris2=1;
        for(; baris2<2; baris2++){
            int kolom2 = 1;
            for(; kolom2<2; kolom2++){
                int nilai = arr[1][0];
                System.out.println("nilai terbesar baris-"+baris2+" adalah = "+nilai);
            }
        }
        int baris3=2;
        for(; baris3<3; baris3++){
            int kolom3 = 2;
            for(; kolom3<3; kolom3++){
                int nilai = arr[2][1];
                System.out.println("nilai terbesar baris-"+baris3+" adalah = "+nilai);
            }
        }
        System.out.println("---------------------------------------------------");
    }
}