package ArrayBalok;
import java.util.*;
public class Balok{
    int panjang, lebar, tinggi;
    
    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    public int hitungVolume(){
        return panjang*lebar*tinggi;
    }
}



