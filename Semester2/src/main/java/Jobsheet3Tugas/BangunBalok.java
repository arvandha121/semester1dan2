package Jobsheet3Tugas;

public class BangunBalok {
    int panjang, lebar, tinggi;
    
    BangunBalok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    BangunBalok() {
        
    }
    
    float volumeBalok(){
        return panjang * lebar * tinggi;
    }
    float luasBalok(){
        return (2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi);
    }
    
}
