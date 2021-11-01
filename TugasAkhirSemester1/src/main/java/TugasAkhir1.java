//menggunakan import library ini supaya bisa mencangkup seluruh isi library yang ada di java
import java.util.*;
public class TugasAkhir1{
    
//=================================================================================================================================
    
    //Deklarasi atribut array dan deklarasi atribut tipe data
    public static String username;
    public static String[] nama;
    public static int[] barang, gudang, masuk, keluar, rusak, laporan;

//=================================================================================================================================
    
    //fungsi untuk menginput username dan password
    static void inputan() {
        int pass;
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------- Login Akun ----------------------------------");
        do{
            System.out.println("");
            //memasukkan username
            System.out.print("Masukkan username akun : ");//memasukkan username bebas dengan nama username apapun
            username = input.next();
            //memasukkan password
            System.out.print("Masukkan password akun (4 digit angka) : ");
            pass = input.nextInt();
            //password benar jika memasukkan input "1234"
            if (pass == 1234) {
                System.out.println("");
                System.out.println("~ANDA BERHASIL LOGIN~");
		System.out.println("------------------------------------------------------------------------------");
                System.out.println("\t\t~~SELAMAT DATANG "+username+" DI PROGRAM INVENTORI~~\n");
            }
            //password salah jika memasukkan selain input "1234"
            else {
                System.out.println("");
                System.out.println("~PASSWORD YANG ANDA MASUKKAN SALAH~");
            }
        }while (pass != 1234);
    }
    
//=================================================================================================================================
    
    //fungsi untuk menginput atau mengisi data diri pengguna
    static void dataDiri(){
        Scanner sc = new Scanner(System.in);
        System.out.println("* BAGIAN INI BOLEH DIKOSONGIN JIKA TIDAK DIPERLUKAN *");
        System.out.print("\n");
        System.out.print("Masukkan nama pengguna : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        String NIM = sc.nextLine();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Nama \t: "+nama);
        System.out.println("Kelas\t: "+kelas);
        System.out.println("NIM  \t: "+NIM);
    }
    
//=================================================================================================================================
    
    //method untuk memunculkan inputan jumlah barang, nama barang
    //barang di gudang, barang masuk, barang keluar, barang rusak
    static void namaBarang(){
        Scanner sc = new Scanner(System.in);
        //inputan user jumlah barang
        System.out.print("Masukkan jumlah barang : ");
        int banyakBarang = sc.nextInt();
        System.out.println(); 
            //digunakan array untuk menentukan memori jumlah barang sesuai inputan user
            barang = new int[banyakBarang];
            gudang = new int[banyakBarang];
            laporan = new int[banyakBarang];
            nama = new String[banyakBarang];
            masuk = new int[banyakBarang];
            keluar = new int[banyakBarang];
            rusak = new int[banyakBarang];
        //menggunakan perulangan for
        //untuk menginput barang di gudang, barang masuk, barang keluar, barang rusak. sesuai inputan user
        for(int i=0; i<barang.length; i++){
        //inputan user barang masuk
            System.out.print("Masukkan nama barang ke-" + (i+1) + " : ");
            sc.nextLine();
            nama[i] = sc.nextLine();
            System.out.println();
            //inputan user barang masuk
            System.out.print("Banyak "+nama[i]+" yang ada di gudang   : ");
            gudang[i] = sc.nextInt();
            System.out.print("Masukkan input "+nama[i]+" masuk       : ");
            masuk[i] = sc.nextInt();
            //inputan user barang keluar
            System.out.print("Masukkan input "+nama[i]+" keluar      : ");
            keluar[i] = sc.nextInt();
            //inputan user barang rusak
            System.out.print("Masukkan input "+nama[i]+" rusak       : ");
            rusak[i] = sc.nextInt();
            laporan[i] = masuk[i] - keluar[i] - rusak[i];
            System.out.println("------------------------------------------------------------------------------");
        }
    }
    
//=================================================================================================================================
    
    //fungsi untuk menampilkan data pencarian
    static void menampilkanData(int x) {
        System.out.println("Nama Barang     : "+nama[x]);
        System.out.println(nama[x]+" Masuk     : " + masuk[x]);
        System.out.println(nama[x]+" Keluar    : " + keluar[x]);
        System.out.println(nama[x]+" Rusak     : " + rusak[x]);
        System.out.println("-------------------------------  -");
        System.out.println(nama[x]+" Total     : " + laporan[x]);
        System.out.println(nama[x]+" Gudang    : " + gudang[x]);
        System.out.println("-------------------------------  +");
        laporan[x] += gudang[x];
        System.out.println(nama[x]+" Total     : " + laporan[x]);
    }
    
//=================================================================================================================================
    
    static void cariData() {
        //fungsi untuk menampilkan atau meneruskan dari data pencarian (menampilkanData(int x)).
        Scanner cari = new Scanner(System.in);
        System.out.print("Masukkan nama barang yang ingin dicari : ");
        String dataBarang = cari.nextLine();
        System.out.println("");
        //melakukan perulangan for dan pemilihan if else. agar bisa mengkoreksi bagian yang ingin di keluarkan
        for (int i = 0; i < nama.length; i++) {
            //equalsIgnoreCase
            //membandingkan String dengan String lain tanpa mempertimbangkan perbedaan besar atau kecilnya huruf
            if(nama[i].equalsIgnoreCase(dataBarang)){
                System.out.println("------- DATA ADALAH BARANG KE "+(i+1)+" -------");
                menampilkanData(i);
                break;
            }else{
                System.out.println("------- DATA BUKAN BARANG KE "+(i+1)+" -------");
            }
        }
    }
    
//=================================================================================================================================
    
    //melakukan pengulangan program menggunakan do while dan perulangan if, else if, dan else
    static void mengulangProgram(){
        Scanner sc = new Scanner(System.in);
        int ulang = 0;
        //melakukkan perulangan do untuk melakukan perulagan dan menentukkan pilihan menu 
        do{
            System.out.println("========== Pilihlah menu di bawah ini! ==========");
            System.out.println();
            System.out.println("1. Ingin mengulang program dari awal");
            System.out.println("2. Ingin mencari barang tadi yang sudah dijalankan");
            System.out.println("3. Keluar Dari Program!");
            System.out.println();
            System.out.println("------------------------------------------------------------------------------");
            //menginputan pilihan dari menu diatas
            System.out.print("Masukkan pilihan anda : ");
            int pilih = sc.nextInt();
            //akan mengulang program dari awal
            if(pilih==1){
                System.out.println("mengulang program dari awal");
                    System.out.println("--------------------------------------------");
                    System.out.println("==============================================================================");
                    System.out.println("\t\t\tLaporan Data Inventory");
                    System.out.println("==============================================================================");
                    namaBarang();
                    cariData();
                    System.out.println();
            }
            //akan mencari data yang sudah ada
            else if(pilih == 2){
                System.out.println("------------------------------------------------------------------------------");
                cariData();
                System.out.println();
            }
            //akan keluar dari menu program
            else if(pilih == 3){
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Anda telah keluar dari program!");
                System.out.println();
                //karena akan di berhentikkan jika memilih pemilihan ini dan akan masuk ke while
                break;
            }
            else{
                System.out.println();
                System.out.println("------------------------------------------");
                System.out.println("Inputan Yang Anda Masukkan Tidak Tersedia!");
                System.out.println("------------------------------------------");
                System.out.println();
            }
        }
        while(ulang!=0 || ulang<3);
    }
    
//=================================================================================================================================
    
    //menampilkan seluruh method fungsi diatas
    public static void main(String[] args) {
        System.out.println("==============================================================================");
        System.out.println("\t\t\tLaporan Data Inventory");
        System.out.println("==============================================================================");
        inputan();
        System.out.println("------------------------------------------------------------------------------");
        dataDiri();
        System.out.println("------------------------------------------------------------------------------");
        namaBarang();
        System.out.println();
        cariData();
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
        mengulangProgram();
    }
}
  