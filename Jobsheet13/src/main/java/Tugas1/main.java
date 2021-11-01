package Tugas1;
import java.util.Stack;
import java.util.Scanner;
public class main{
    
    static void menu(){
        System.out.println("======================");
        System.out.println("Data Buku Perpustakaan");
        System.out.println("======================");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cetak Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("0. Keluar!");
        System.out.println("----------------------");
        System.out.println("Pilih : ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Stack<Buku> buku = new Stack<>();
        
        int ulang = 0;
        do{
            menu();
            int pilih = sc.nextInt();
            if(pilih == 1){
                sc.nextLine();
                System.out.println("**********************");
                System.out.println("   Entry Judul Buku   ");
                System.out.println("**********************");
                System.out.println("Isbn\t: ");
                String isbn = sc1.nextLine();
                System.out.println("Judul\t: ");
                String judul = sc1.nextLine();
                System.out.println("Terbit\t: ");
                String terbit = sc1.nextLine();
                System.out.println("Penerbit: ");
                String penerbit = sc1.nextLine();
                Buku b = new Buku();
                buku.push (b = new Buku (isbn, judul, terbit, penerbit));
            }else if(pilih == 2){
                System.out.println("**********************");
                System.out.println("  Ambil Buku Teratas  ");
                System.out.println("**********************");
                System.out.println("Buku teratas : ");
                buku.pop();
                System.out.println("Buku telah diambil!");
            }else if(pilih == 3){
                System.out.println("**********************");
                System.out.println("  Cetak Buku Teratas  ");
                System.out.println("**********************");
                System.out.println("Buku{" + "isbn=" + (buku.get(buku.size() - 1).isbn)
                + ", " + "judul=" + (buku.get(buku.size() - 1).judulBuku) + ", "
                + "Terbit=" + (buku.get(buku.size() - 1).terbitBuku) + ", " 
                +"Penerbit=" + (buku.get(buku.size() - 1).penerbitBuku) + '}');
            }else if(pilih == 4){
                System.out.println("**********************");
                System.out.println("   Print Cetak Buku   ");
                System.out.println("**********************");
                buku.stream().forEach(b -> {
                    System.out.println("Buku{" + "isbn=" + b.isbn + ", " 
                    + "judul=" + b.judulBuku + ", " + "terbit=" 
                    + b.terbitBuku + ", " + "penerbit=" + b.penerbitBuku + '}');
                });
            }else if(pilih == 0){
                System.out.println("Anda keluar dari program!");
                break;
            }else{
                System.out.println("pilihan anda tidak tersedia!");
            }
        }while(ulang != 0 || ulang < 3);
    }
}
