import java.util.*;
public class rataNilai {
    public static void main(String Args[]){
        
        Scanner input = new Scanner(System.in);
        int [] nilaiMHS = new int[10];
        double total = 0;
        double rata;
        
        //=============================================================
        for(int i = 0; i<nilaiMHS.length; i++){
            System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+": ");
            nilaiMHS[i] = input.nextInt();
        }
        for(int i=0; i<nilaiMHS.length; i++){
            total += nilaiMHS[i];
        }
        rata = total/nilaiMHS.length;
        System.out.println(rata);
    }
}
