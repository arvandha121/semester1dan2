package ArraySegitiga;
import java.util.*;
public class Segitiga {
    int alas, tinggi;
    
    public Segitiga() {
        
    }
    int hitungLuas(){
        return 1/2 *(alas*tinggi);
    }
    int hitungKeliling(){
        double sisi;
        int hasil = (2*alas)+(2*tinggi);
        sisi = Math.sqrt(alas*alas)+(tinggi*tinggi);
        double keliling = sisi+sisi+sisi;
        return hasil;
    }
}
