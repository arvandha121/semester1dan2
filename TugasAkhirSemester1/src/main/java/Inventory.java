import java.util.Scanner;
 
public class Inventory {
 
    public static String[] nama, alasan;
    public static int[] jumlah, pass, jumlahBarang, kode, harga, masuk, keluar, rusak, total;
//fungsi untuk menginputkan data
    static void inputan() {
        String username;
        int pass;
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------- Login Akun ---------------------");
        do {
            System.out.println("");
            System.out.print("Masukkan username akun : ");
            username = input.next();
            System.out.print("Masukkan password akun (4 digit angka) : ");
            pass = input.nextInt();
            if (pass == 1234) {
                System.out.println("");
                System.out.println("~ANDA BERHASIL LOGIN~");
            } else {
                System.out.println("");
                System.out.println("~PASSWORD YANG ANDA MASUKKAN SALAH~");
            }
        } while (pass != 1234);
 
        System.out.println("");
        System.out.println("-------------------------------");
        System.out.print("Masukkan banyaknya barang : ");
        int data = input.nextInt();
        System.out.println("-------------------------------");
 
        System.out.println("");
 
        jumlahBarang = new int[data];
        nama = new String[data];
        kode = new int[data];
        harga = new int[data];
        masuk = new int[data];
        keluar = new int[data];
        rusak = new int[data];
        alasan = new String[data];
        total = new int[data];
 
        for (int i = 0; i < jumlahBarang.length; i++) {
            System.out.println("");
            System.out.print("Masukkan kode barang ke-" + (i + 1) + " : ");
            kode[i] = input.nextInt();
            System.out.print("Masukkan nama barang ke-" + (i + 1) + " : ");
            input.nextLine();
            nama[i] = input.nextLine();
            System.out.print("Masukkan jumlah " + nama[i] + "  : ");
            jumlahBarang[i] = input.nextInt();
            System.out.print("Masukkan harga " + nama[i] + "   : Rp ");
            harga[i] = input.nextInt();
            System.out.println("");
        }
    }
//fungsi untuk menginputkan barang masuk
    static void barangMasuk() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < jumlahBarang.length; i++) {
            System.out.println("");
            System.out.println("MEMASUKKAN DATA BARANG MASUK KE-" + (i + 1));
            System.out.println("-----------------------------------");
            System.out.print("Masukkan jumlah " + nama[i] + " masuk : ");
            masuk[i] = in.nextInt();
 
        }
        System.out.println("");
        System.out.println("");
    }
//fungsi untuk menginputkan barang keluar
    static void barangKeluar() {
        Scanner out = new Scanner(System.in);
        for (int i = 0; i < jumlahBarang.length; i++) {
            System.out.println("");
            System.out.println("MEMASUKKAN DATA BARANG KELUAR KE-" + (i + 1));
            System.out.println("-----------------------------------");
            System.out.print("Masukkan jumlah " + nama[i] + " keluar : ");
            keluar[i] = out.nextInt();
 
        }
        System.out.println("");
        System.out.println("");
    }
//fungsi untuk menginputkan barang rusak
    static void barangRusak() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < jumlahBarang.length; i++) {
            System.out.println("");
            System.out.println("MEMASUKKAN DATA BARANG RUSAK KE-" + (i + 1));
            System.out.println("-----------------------------------");
            System.out.print("Masukkan jumlah " + nama[i] + " rusak : ");
            rusak[i] = sc.nextInt();
            System.out.print("Masukkan jenis kerusakan : ");
            sc.nextLine();
            alasan[i] = sc.nextLine();
 
        }
        System.out.println("");
        System.out.println("");
    }
//untuk mencari nama barang
    public static void cariData() {
        Scanner cari = new Scanner(System.in);
        System.out.print("Masukkan nama barang yang ingin dicari : ");
        String dataBarang = cari.nextLine();
        System.out.println("");
        for (int k = 0; k < nama.length; k++) {
            if (nama[k].equals(dataBarang)) {
                System.out.println("======= DATA BARANG DITEMUKAN =======");
                menampilkanData(k);
                break;
            } else {
                System.out.println("======= DATA BARANG TIDAK DITEMUKAN =======");
                break;
            }
        }
        System.out.println("");
        System.out.println("");
    }
//fungsi untuk menampilkan data pencarian
    public static void menampilkanData(int x) {
        System.out.println("Nama Barang : " + nama[x] + "\nKode Barang      : " + kode[x] + "\nJumlah Barang   : " + jumlahBarang[x] + "\nHarga Barang   : " + harga[x]);
        System.out.println("===================================");
    }
//fungsi untuk mencetak laporan
    static void cetakLaporan() {
        for (int i = 0; i < jumlahBarang.length; i++) {
            System.out.println("");
            System.out.println("============ CETAK LAPORAN =============");
            System.out.println("| Kode Barang            : " + kode[i] + "\t\t|");
            System.out.println("| Nama Barang            : " + nama[i] + "\t\t|");
            System.out.println("| Harga Barang           : " + harga[i] + "\t\t|");
            System.out.println("| Jumlah Barang          : " + jumlahBarang[i] + "\t\t|");
            System.out.println("| Jumlah Barang Masuk    : " + masuk[i] + "\t\t|");
            System.out.println("| Jumlah Barang Keluar   : " + keluar[i] + "\t\t|");
            System.out.println("| Jumlah Barang Rusak    : " + rusak[i] + "\t\t|");
            System.out.println("|---------------------------------------|");
            total[i] = jumlahBarang[i] + masuk[i] - keluar[i] - rusak[i];
            System.out.println("| Total Barang Saat Ini  : " + total[i] + "\t\t|");
            System.out.println("");
        }
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==========================================================================");
        System.out.println("================== SELAMAT DATANG DI APLIKASI INVENTORY ==================");
        System.out.println("==========================================================================");
        System.out.println("");
        inputan();
        barangMasuk();
        barangKeluar();
        barangRusak();
        cariData();
        cetakLaporan();
        System.out.println("Apakah anda mau mengulang program diatas (Y/T)? : ");
        char program = input.next().charAt(0); 
        char ulang = 2;
        switch(program){
            case 'y':
            if(ulang == 2){
                barangMasuk();
                barangKeluar();
                barangRusak();
                cariData();
                cetakLaporan();
                break;
            }
            default:
                System.out.println("Anda telah keluar dari program!");
            }
        }
    }