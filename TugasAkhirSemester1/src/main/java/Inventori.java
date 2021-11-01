//menggunakan import library ini supaya bisa mencangkup seluruh isi library yang ada di java
import java.util.*;
public class Inventori{
    static void inputan() {
        String username;
        int pass;
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------- Login Akun ----------------------------------");
        do{
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
        }while (pass != 1234);
    }
    //=================================================================================================================================
    //fungsi dengan array menentukkan inputan barang
    static int menentukanBarang(int a){
        String[] barang = new String[a];
        Scanner sc = new Scanner(System.in);
         //rekursif
        for(int i=0; i<a; i++){
            //dengan menambahkan i+1, maka dari angka 0 berubah menjadi angka 1
            System.out.print("Masukkan input barang "+(i+1)+" : ");
            barang[i] = sc.nextLine();
        }
        return a;
    }
    //=================================================================================================================================
    //fungsi dengan array 1d menentukkan nilai masuk, keluar, rusak, dan hasil inputan data laporan barang
    static int barangMasuk(int a){
        int[] masuk = new int[a];
        int[] keluar = new int[a];
        int[] rusak = new int[a];
        int[] laporan = new int[a];
        Scanner sc = new Scanner(System.in);
        //rekursif
            for(int j=0; j<a; j++){
                //inputan user barang masuk
                System.out.print("Masukkan input barang masuk "+(j+1)+" : ");
                masuk[j] = sc.nextInt();
                //inputan user barang keluar
                System.out.print("Masukkan input barang keluar "+(j+1)+" : ");
                keluar[j] = sc.nextInt();
                //inputan user barang rusak
                System.out.print("Masukkan input barang rusak "+(j+1)+" : ");
                rusak[j] = sc.nextInt();
                //inputan user laporan data total barang
                laporan[j]=masuk[j]-keluar[j]-rusak[j];
                System.out.println("Laporan data barang : "+laporan[j]);
                System.out.println("------------------------------------------------------------------------------");
            }
        return a;
    }
    //=================================================================================================================================
    //fungsi untuk mencari data barang
    static void pencarianData(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Pencarian data barang : ");
            String data = sc.nextLine();
            String in = data.toUpperCase();//metode mengubah string menjadi huruf besar.
            //menggunakan boolean untuk melakukan pemilihan apakah benar atau tidak barang yang sedang dicari
            boolean i = true;
            if(i){
                System.out.println("barang ada");
            }else{
                System.out.println("tidak ada barang");
            }
    }
    static void laporan(){
        
    }
    //=================================================================================================================================
    //fungsi untuk menampilkan waktu
    static void waktu(){
        //script untuk menginputkan tanggal dan waktu
        int hari, bulan, tahun;
        int detik, menit, jam;
        GregorianCalendar date = new GregorianCalendar();
    	hari = date.get(Calendar.DAY_OF_MONTH);
    	bulan = date.get(Calendar.MONTH)+1;
        tahun = date.get(Calendar.YEAR);
        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam =  date.get(Calendar.HOUR_OF_DAY);
        //menampilkan tanggal
        System.out.println();
        System.out.println("Tanggal sekarang: " + hari + "-" + bulan + "-" + tahun);
        //menampilkan waktu
        System.out.println("Jam sekarang \t: " + jam + ":" + menit + ":" + detik);
    }
    //=================================================================================================================================
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        inputan();
        System.out.println("==============================================================================");
        //menampilkan data diri
        System.out.print("Masukkan nama pengguna : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = input.nextLine();
        System.out.print("Masukkan NIM : ");
        String NIM = input.nextLine();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Nama \t: "+nama);
        System.out.println("Kelas\t: "+kelas);
        System.out.println("NIM  \t: "+NIM);
    //=================================================================================================================================
        System.out.println("==============================================================================");
        int x = 0;
        waktu();//mengeluarkan fungsi keempat (waktu)
        System.out.println();
    //=================================================================================================================================
        System.out.println("==============================================================================");
        System.out.println("\t\t\tLaporan Data Inventory");
        System.out.println("==============================================================================");
        System.out.println();
        System.out.print("Masukkan jumlah barang : ");
        int a = input.nextInt();
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(menentukanBarang(a));//keluaran fungsi pertama
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(barangMasuk(a));//keluaran fungsi kedua
        System.out.println("------------------------------------------------------------------------------");
        pencarianData();//keluaran fungsi ketiga
        System.out.println("------------------------------------------------------------------------------");
    //=================================================================================================================================
        System.out.println("Apakah anda mau mengulang program diatas (Y/T)? : ");
        char program = input.next().charAt(0); 
        char ulang = 2;
        switch(program){
            case 'y':
            if(ulang == 2){
                System.out.println("==============================================================================");
                System.out.println("\t\t\tLaporan Data Inventory");
                System.out.println("==============================================================================");
                System.out.print("Masukkan jumlah barang : ");
                a = input.nextInt();
                System.out.println("------------------------------------------------------------------------------");
                System.out.println(menentukanBarang(a));//melakukan keluaran fungsi pertama perulangan 2
                System.out.println("------------------------------------------------------------------------------");
                System.out.println(barangMasuk(a));//melakukan keluaran fungsi kedua perulangan 2
                System.out.println("------------------------------------------------------------------------------");
                pencarianData();//melakukan keluaran fungsi ketiga perulangan 2
                break;
            }
            default:
                System.out.println("Anda telah keluar dari program!");
        }
    }
    //=================================================================================================================================
}