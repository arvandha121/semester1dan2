package uas;
public class Pajak {
    String TNKB,nama;
    int kode,nominal,denda,totPen;

    public Pajak(){
        
    }
    
    public Pajak(int k, String tnk, String nm, int nml, int dnd, int tp) {
        kode = k;
        TNKB = tnk;
        nama = nm;
        nominal = nml;
        denda = dnd;
        totPen = tp;
    }
}
