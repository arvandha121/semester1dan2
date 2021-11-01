package Tugas2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class main {
    
    List<Mahasiswa> mhs = new ArrayList<>();
    List<mataKuliah> mk = new ArrayList<>();
    List<nilai> nli = new ArrayList<>();
    
    static void menu(){
        System.out.println("===============================================");
        System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("===============================================");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("0. Keluar!");
        System.out.println("-----------------------------------------------");
        System.out.println("pilih : ");
    }
    
    //membuat method untuk menampung data
    void setDataMHSdanMatkul(){
        mhs.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        mhs.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        mhs.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        mhs.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        mhs.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        mhs.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        mk.add(new mataKuliah("00001", "Internet of Things", "3"));
        mk.add(new mataKuliah("00002", "Algoritma dan Struktur Data", "2"));
        mk.add(new mataKuliah("00003", "Algoritma dan Pemrograman", "2"));
        mk.add(new mataKuliah("00004", "Praktikum Algoritma dan Struktur Data", "3"));
        mk.add(new mataKuliah("00005", "Praktikum Algoritma dan Pemrograman", "3"));
        }
    
    void menusatu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Data ");
        System.out.println("Kode : ");
        String kode = sc.next();
        System.out.println("Nilai : ");
        float nilai = sc.nextFloat();
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("-------------------------------------------------");
        System.out.println("NIM\tNama\t\tTelp");
        for (Mahasiswa mahasiswa : mhs) {
            System.out.println(mahasiswa.nim + "\t" + mahasiswa.nama + "\t\t" + mahasiswa.noTelp);
            }
        boolean ketemu = true;
        String pilihmahasiswa; int konfirmasi2 = 0;
        do {
            System.out.println("Pilih Mahasiswa by NIM : ");
            pilihmahasiswa = sc.next();
            for (Mahasiswa mahasiswa : mhs) {
                if(pilihmahasiswa.equals(mahasiswa.nim)) {
                    ketemu = false;
                    konfirmasi2++;
                }
            }
            if (konfirmasi2 == 0) {
                System.out.println("Data Kode NIM Tidak Ditemukan");
            }
        }while (ketemu);
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("-------------------------------------------------");
        System.out.println("Kode\tMata Kuliah\t\t\tSKS");
        for (mataKuliah matakuliah : mk) {
            System.out.println(matakuliah.kode+"\t" + matakuliah.matakuliah + "\t" + matakuliah.sks);
        }
        boolean ketemu2 = true;
        String pilihmatakuliah; int konfirmasi = 0;
        do {
            System.out.println("Pilih MK by Kode : ");
            pilihmatakuliah = sc.next();
            for (mataKuliah mklh : mk) {
                if (pilihmatakuliah.equals(mklh.kode)){
                    ketemu2 = false;
                    konfirmasi++;
                }
            }
            if (konfirmasi == 0) {
                System.out.println("Data Kode Matakuliah Tidak Ditemukan");
            }
        }while (ketemu2);
        nli.add(new nilai(kode, nilai, pilihmatakuliah, pilihmahasiswa));
     }
     void menudua(){
         Scanner sc = new Scanner(System.in);
         System.out.println("DAFTAR NILAI MAHASISWA");
         System.out.println("-------------------------------------------------");
         System.out.println("NIM\tNama Mahasiswa\t\tMata Kuliah\t\t\tSKS\tNilai");
         nli.forEach(nilaisatuan -> {
             System.out.println(nilaisatuan.nimmhs+"\t");
             for (Mahasiswa mahasiswa : mhs) {
                 if(mahasiswa.nim.equals(nilaisatuan.nimmhs)){
                     System.out.println(mahasiswa.nama+"\t\t\t");
                 }
             }
             for (mataKuliah matkul : mk) {
                 if (matkul.kode.equals(nilaisatuan.kodematakuliah)) {
                     System.out.println(matkul.matakuliah + "\t" + matkul.sks+"\t");
                 }
             }
             System.out.println(nilaisatuan.nilai);
         });
     }
     void menutiga(){
         Scanner sc = new Scanner(System.in);
         menudua();
         System.out.println("Masukkan Data Mahasiswa[nim] : ");
         String caridata = sc.next();
         int konfirmasi3 = 0;
         for (nilai carinilai : nli) {
             if (carinilai.nimmhs.equals(caridata)) {
                 System.out.println(carinilai.nimmhs+"\t");
                 for (Mahasiswa mahasiswa : mhs) {
                     if(mahasiswa.nim.equals(carinilai.nimmhs)){
                         System.out.println(mahasiswa.nama+"\t");
                     }
                 }
                 for (mataKuliah matkul : mk) {
                     if(matkul.kode.equals(carinilai.kodematakuliah)) {
                         System.out.println(matkul.matakuliah + "\t" + matkul.sks+"\t");
                     }
                 }
                 System.out.println(carinilai.nilai);
                 konfirmasi3++;
             }
         }
         if (konfirmasi3 == 0) {
             System.out.println("Data Dengan NIM " + caridata + " Tidak Ditemukan");
         }
     }
     void menuempat(){
         for (int i = 0; i < nli.size()-1; i++) {
             for (int j = 0; j < nli.size()-i-1; j++) {
                 if (nli.get(j).nilai > nli.get(j+1).nilai){
                     float swap = nli.get(j).nilai;
                     nli.get(j).nilai =
                             nli.get(j+1).nilai;
                     nli.get(j+1).nilai = swap;
                 }
             }
         }
         menudua();
     }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        List<mataKuliah> mk = new ArrayList<>();
        List<nilai> n = new ArrayList<>();
        
        main obj = new main();
        obj.setDataMHSdanMatkul();
        
        int ulang = 0;
        do{
            menu();
            int pilih = sc.nextInt();
            if(pilih == 1){
                obj.menusatu();
            }else if(pilih == 2){
                obj.menudua();
            }else if(pilih == 3){
                obj.menutiga();
            }else if(pilih == 4){
                obj.menuempat();
            }else if(pilih == 0){
                System.out.println("Anda telah keluar!");
                break;
            }else{
                System.out.println("Pilihan anda tidak tersedia!");
            }
        }while(ulang != 0 || ulang < 3);
    }
}
