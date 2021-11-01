package Jobsheet2Praktikum;
public class SewaMain {
    public static void main(String[] args) {
        Sewa game = new Sewa();
        game.id = 2041720134;
        game.namaMember = "Arief Nauvan Ramadha";
        game.namaGame = "GTA VI";
        game.lamaPeminjaman = 5;
        game.hargaSewaGame = 25000;
        game.sewaGame();
        int hargaTotal = game.hitungHargaTotal(1);
        System.out.println("Total harga sewa : "+hargaTotal);
    }
}
