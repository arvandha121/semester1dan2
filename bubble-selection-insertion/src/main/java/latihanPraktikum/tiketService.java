package latihanPraktikum;
import java.util.*;
public class tiketService {
    
    tiket[] tkt = new tiket[5];
    int a;
    
    void tambah(tiket t){
        if (a<tkt.length){
            tkt[a] = t;
            a++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }
    
    void tampil(){
        for(int i=0;i<tkt.length;i++){
            System.out.println("Maskapai : "+tkt[i].maskapai);
            System.out.println("Harga : "+tkt[i].harga);
            System.out.println("Asal : "+tkt[i].asal);
            System.out.println("Tujuan : "+tkt[i].tujuan);
        }
    }
    
     void bubbleSort(){
        for (int i=0; i<tkt.length; i++)
        {
            for (int j=i+1; j<tkt.length-i; j++)
            {
                if(tkt[j].harga > tkt[j-1].harga)
                {
                    tiket tmp = tkt[j];
                    tkt[j] = tkt[j-1];
                    tkt[j-1] = tmp;
                }
            }
        }
    }
    
    void selectionSort(){
        for (int i = 0; i < tkt.length; i++) {
            int t = i;
            for (int j = i+1; j < tkt.length-i; j++) {
                if (tkt[j].harga < tkt[t].harga) {
                    t = j;
                    
                }
            }
            tiket tmp = tkt[t];
            tkt[t] = tkt[i];
            tkt[i] = tmp;
        }
    }
    
}
