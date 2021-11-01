package Tugas1;
public class Buku {
    //mendeklarasikan atribut
    String isbn;
    String judulBuku;
    String terbitBuku;
    String penerbitBuku;

    //membuat konstruktor default
    public Buku() {
        
    }
    //membuat konstruktor berparameter
    public Buku(String isbn, String judulBuku, String terbitBuku, String penerbitBuku) {
        this.isbn = isbn;
        this.judulBuku = judulBuku;
        this.terbitBuku = terbitBuku;
        this.penerbitBuku = penerbitBuku;
    }

    Buku(String bn, String jb, int ttb, String npb) {
        
    }

    //membuat method toString
    @Override
    public String toString() {
        return "Buku{" + "isbn=" + isbn + ", judul=" + judulBuku + 
                ", terbit=" + terbitBuku + ", penerbit=" + penerbitBuku + '}';
    }
}
