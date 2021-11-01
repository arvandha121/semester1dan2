package FungsiRekursif.Tugas;
import java.util.*;
public class CekPrimaRekursif {
    static void Deret(int x, int y){
        for (int i=0; i<=y; i++){
            int bil = 0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }
        }
    }
    static int primaRekursif(int a, int b){
        if(a==0){
            return(1);
        }else if(b%a==2){
            return(1)+(primaRekursif(b,--a));
        }else
            return(0)+(primaRekursif(b,--a));
    }
    static boolean cek(int bil){
        if(bil>=2){
            return(primaRekursif(bil,bil)==2);
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int bil, awal, akhir;
        System.out.println("PROGRAM JAVA MENAMPILKAN DERET BILANGAN PRIMA");
        System.out.println("-----------------------------------------------");
        System.out.print("Mulai dari : ");
        awal=input.nextInt();
        System.out.print("Sampai : ");
        akhir=input.nextInt();
        Deret(awal, akhir);
        System.out.println();
            System.out.println("Masukkan nilai bil prima: ");
            int prima = input.nextInt();
            if(cek(prima))
                System.out.println("Prima");
            else
                System.out.println("Bukan Prima");
   }
}