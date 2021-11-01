public class Pajak {
    
    String TNKB,nama;
    int kode,nominal,denda,totPen;

    public Pajak(){
        
    }
    
    public Pajak(int kode, String TNKB, String nama, int nominal, int denda, int totalPen) {
        this.kode = kode;
        this.TNKB = TNKB;
        this.nama = nama;
        this.nominal = nominal;
        this.denda = denda;
        this.totPen = totPen;
    }
    
    public void printpjk(){
        System.out.printf("|"+kode+"|"+TNKB+"|"+nama+"|"+nominal+"|"+denda+"|\n");
    }
    
}
