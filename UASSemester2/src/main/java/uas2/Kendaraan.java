package uas2;
public class Kendaraan {
    String nama,tahun;
    int bulan,cc,jenis,tnkb;
    
    Kendaraan(int tnkb, String nama, int jenis, int cc,String tahun,int bulan) {
       
        this.tnkb=tnkb;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun= tahun;
        this.bulan= bulan;
    }
}
