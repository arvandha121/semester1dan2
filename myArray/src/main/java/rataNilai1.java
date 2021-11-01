import java.util.*;
public class rataNilai1 {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah Mahasiswa: ");
        int jumlah = input.nextInt();
        int [] nilaiMHS = new int[4];
        double rata1, rata2;
        int Lulus = 0,tidakLulus = 0;
        //=============================================================
        for(int i = 0; i<nilaiMHS.length; i++){
            System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+": ");
            nilaiMHS[i] = input.nextInt();
        }
        for(int i=0; i<nilaiMHS.length; i++){
            if(nilaiMHS[i]>70){
                Lulus += nilaiMHS[i];
                int n=1;
            }else{
                tidakLulus += nilaiMHS[i];
                int n=1;
            }
        }
        //=============================================================
        rata1 = Lulus/2;
        rata2 = tidakLulus/4;
        //=============================================================
        System.out.println("Nilai rata-rata lulus: "+rata1);
        System.out.println("Nilai rata-rata tidak lulus: "+tidakLulus);
    }
}
