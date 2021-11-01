package uas2;
public class Pajak {
    int nominal, denda, bulanbayar;
    int kode;
    Kendaraan data;
    Pajak next;
    Pajak(Kendaraan data, int kode, int nominal, int denda, int bulanbayar, Pajak next){
        this.data=data;
        this.kode=kode;
        this.nominal=nominal;
        this.denda=denda;
        this.bulanbayar=bulanbayar;
        this.next=next;
    }
}
