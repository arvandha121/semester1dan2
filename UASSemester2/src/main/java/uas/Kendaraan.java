package uas;
public class Kendaraan {
    
    String TNKB, nama, jenis;
    int cc, tahun, bulanHarusBayar;
    
    Kendaraan(){
        
    }
    
    Kendaraan(String tn, String n, String j, int c, int thn, int bhb){
        TNKB = tn;
        nama = n;
        jenis = j;
        cc = c;
        tahun = thn;
        bulanHarusBayar = bhb;
    }
}
