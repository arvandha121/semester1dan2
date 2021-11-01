package tugas;
import java.util.*;
public class Tugas2Array2 {
    public static void main(String[] args) {
        //======================================================================
        Scanner input = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.print("Masukkan Baris : ");
        int Baris = input.nextInt();
        System.out.print("Masukkan Kolom : ");
        int Kolom = input.nextInt();
        System.out.print("----------------------------------------------------");
        //======================================================================
        int[]arr[] = new int[Baris][Kolom];
        System.out.println();
        //======================================================================
        for(int i=0; i<Baris; i++){
            for(int j=0; j<Kolom; j++){
                System.out.print("arr["+i+"]["+j+"] : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("--------------------------------------------------");
        //======================================================================
        System.out.println(Arrays.deepToString(arr));
        System.out.println("");
        for(int []array : arr){
            for(int hasil : array){
                System.out.print(hasil+"  ");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------------------");
        //======================================================================
        System.out.println("==================== MENU ====================");
        System.out.println("1. Array Terkecil");
        System.out.println("2. Array Terkecil Dan Penjumlahan seluruhnya");
        System.out.println("3. Kondisi Terdapat Angka 50?");
        System.out.println("");
        System.out.print("PILIH MENU DIATAS INI : ");
        int menu = input.nextInt();
        //======================================================================
        int min = 0;
        switch(menu){
            case(1):
                for(int[]array : arr){
                    for(int hasil : array){
                        min = hasil;
                        int a = 0;
                        int b = 0;
                        if(arr[a][b]<min){
                            min = arr[a][b];
                        }
                    }
                }
            System.out.println("Array terkecil : "+min);
         break;
        }
        int min2 = 0;
        switch(menu){
            case(2):
                for(int[]array : arr){
                    for(int hasil : array){
                        min2 = hasil;
                        int a = 0;
                        int b = 0;
                        if(arr[a][b]<min){
                            min2 = arr[a][b];
                            min2 -= 0;
                        }
                    }
                }
            System.out.println("Array terkecil : "+min2);
            System.out.println("Jumlah Array Terkecil Adalah : "+min2);
        break;
        }
        int min3 = 0;
        switch(menu){
            case(3):
                for(int[]array : arr){
                    for(int hasil : array){
                        int a = 0;
                        int b = 0;
                        if(arr[a][b]==50){
                            min3 = 1;
                        }
                    }
                }
            if(min3==1){
                System.out.println("Ada");
            }else if(min3!=1){
                System.out.println("Tidak Ada");
            }
        }
    }
}