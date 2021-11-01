import java.util.*;
public class ArrayInputLoop1 {
    public static void main(String Args[]){
        
        Scanner sc = new Scanner(System.in);
        int nilaiUAS[] = new int[6];
        
        for (int i=0;i<nilaiUAS.length;i++){
            System.out.print("Masukkan nilai UAS MHS ke-"+i+" : \n");
            nilaiUAS[i] = sc.nextInt();
        }
        for(int i=0; i<nilaiUAS.length; i++){
            if(nilaiUAS[i]>70){
                System.out.println("Mahasiswa ke-"+i+ " lulus!");
            }
        }
    }
}