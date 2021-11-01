import java.util.*;
public class Coba1 {
    public static void main(String[] args) {
        //======================================================================
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan Kolom: ");
        int kolom = sc.nextInt();
        System.out.print("----------------------------------------------------");
        //======================================================================
        int[]arr[] = new int[baris][kolom];
        System.out.println();
        //======================================================================
        for(int i=0; i<baris; i++){
            for(int j=0; j<kolom; j++){
                System.out.print("baris ["+i+"] dan kolom ["+j+"] adalah: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------------------------------------------------");
        //======================================================================
        System.out.println(Arrays.deepToString(arr));
	System.out.print("\n");
	for(int []array : arr){
            for(int hasil : array){
                System.out.print(hasil+"  ");
            }
            System.out.print("\n");
        }
        System.out.println("--------------------------------------------------");
        //======================================================================
        System.out.println("============== MENU ==============");
        System.out.println("1. Array Terkecil");
        System.out.println("2. Array Terkecil Dan Penjumlahan seluruhnya");
        System.out.println("3. Apa ada arr 50?");
        System.out.println("--------------------------------------------------");
        System.out.print("Pilih menu diatas ini : ");
        int pilih = sc.nextInt();
        //======================================================================
        switch(pilih){
            case(1):
                for(int[]array : arr){
                    for(int hasil : array){
                        int a = 0;
                        int b = 0;
                        if(arr[a][b]<hasil){
                            hasil = arr[a][b];
                        System.out.println("Array terkecil : "+arr[a][b]);
                        }
                    }
                }
        break;
        }
        switch(pilih){
            case(2):
            int i = 0;
            int j=0;
            for(int k=0; k<i; k++){
                for(int l=0; l<j; l++){
                    int hasil = 0;
                    if(arr[k][l] == hasil){
                        System.out.println("Mie Goreng");
                    }
                }
            }
        }
        switch(pilih){
            case(3):
            for(int k=0; k<baris; k++){
                for(int l=0; l<kolom; l++){
                    if(arr[k][l] == 50){
                        System.out.println("Ada");
                    }else{
                        System.out.println("Tidak Ada");
                    }
                }
            }
        }
    }    
}