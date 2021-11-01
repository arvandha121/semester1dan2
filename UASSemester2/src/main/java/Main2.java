import java.util.*;

public class Main2 {
 static Scanner sc = new Scanner(System.in);
 static String tnbk;
 static int bulanBayar,Pajak,Denda,penguranganBulan,totPendapatan,totPen;
 static int counter = 1;
 static Kendaraan[] kdr = {new Kendaraan("AG 1244 YAC", "SUPRA", "Roda 2", 120,2021, 10),
 new Kendaraan("AG 1432 YJ", "INOVA", "Roda 4", 1200,2019, 1),
 new Kendaraan("AG 4564 YC", "JAZZ", "Roda 4",5000, 2021,9),
 new Kendaraan("AG 5564 YAJ", "SOCPY", "Roda 2", 250, 2017,6),
 new Kendaraan("AG 6675 YJ", "GENIO", "Roda 2", 50, 2010,3),
 new Kendaraan("AG 6537 YAJ", "PANTHER", "Roda 4", 1100,2009, 12),
 };
 static Pajak pjk[] = new Pajak[7];
 static void menu() {
 System.out.println("==================================");
 System.out.println("               SAMSAT             ");
 System.out.println("==================================");
 System.out.println(" 1. Menampilan Data Kendaaraan");
 System.out.println(" 2. Menginputkan Pajak ");
 System.out.println(" 3. Menampilkan Pajak ");
 System.out.println(" 4. Menampilkan Seluruh Transaksi ");
 System.out.println(" 5. Menampilkan Total Pendapatan ");
 System.out.println(" 6. Keluar ");
 System.out.println("==================================");
 }
 public static void main(String[] args) {
 int pilih = 0;
 while (pilih != 6) {
 menu();
 System.out.print(" Pilih menu : ");
 pilih = Integer.parseInt(sc.nextLine());
 System.out.println("==================================");
 System.out.println();
 System.out.println();
 switch (pilih) {
 case 1 : 
     DataKendaraan();
     break;
 case 2 : 
     inputPajak();
     break;
 case 3 : 
     tampilPajak();
     break;
 case 4 : 
     tampilTransaksi();
     break;
 case 5 : 
     totalPendapatan();
     break;
 case 6 : 
     System.out.println("Anda Berhasil Keluar");
     break;
 }
 }
 }
static void DataKendaraan(){
 System.out.println("-------------------------------------------------------------------");
 System.out.println("| DATA KENDARAAN|");
 System.out.println("-------------------------------------------------------------------");
 System.out.println("| PLAT | NAMA | JENIS |CC | TAHUN | BULAN |");
System.out.println("===================================================================");
 for (int i = 0; i < kdr.length; i++) {
 kdr[i].printKdr();
 System.out.println();
 }
 System.out.println();
 System.out.println();
}

 static void inputPajak() {
 System.out.println("-------------------------------");
 System.out.println("MASUKKAN DATA PAJAK");
 System.out.println("-------------------------------");
 System.out.print(" Nomor TNBK :");
 tnbk = sc.nextLine();
 System.out.print(" Bulan Bayar :");
 bulanBayar = sc.nextInt();
 sc.nextLine();
 System.out.println("===============================");
 System.out.println();
 System.out.println();
 }
 static void tampilPajak() {
 for (int i = 0; i < kdr.length; i++) {
 if (kdr[i].getTNKB().contains(tnbk)) {
 System.out.println("-------------------------------------------------------------------");
 System.out.println("DATA KENDARAAN");
 System.out.println("-------------------------------------------------------------------");
 System.out.println("| PLAT | NAMA | JENIS | CC | TAHUN | BULAN |");
System.out.println("===================================================================");
System.out.printf("|"+kdr[i].getTNKB()+"|"+kdr[i].getNama()+"|"+kdr[i].getJenis()+"|"+kdr[i].getCc()+"|"+kdr[i].getTahun()+"|"+kdr[i].getBulanHarusBayar()+"|\n");
System.out.println("===================================================================");
 if (kdr[i].getJenis().equals("Roda 2")) {
 if (kdr[i].getCc() <= 100) {
 Pajak = 100000;
 } else if (kdr[i].getCc() <= 250) {
 Pajak = 250000;
 } else {
 Pajak = 500000;
 }
 } else if (kdr[i].getJenis().equals("Roda 4")) {
 if (kdr[i].getCc() <= 1000) {
 Pajak = 750000;
 } else if (kdr[i].getCc() <= 2500) {
 Pajak = 1000000;
 } else {
 Pajak = 1500000;
 }
 }
 System.out.printf("| PAJAK KENDARAAN = "+Pajak+"|\n");
 penguranganBulan = bulanBayar -kdr[i].getBulanHarusBayar();
 if (penguranganBulan >= 1 && penguranganBulan <= 3) {
 Denda = 50000;
 } else if (penguranganBulan > 3) {
 Denda = penguranganBulan * 50000;
 } else {
 Denda = 0;
 }
 System.out.printf("DENDA ="+Denda+"\n");
System.out.println("===================================================================");
 totPendapatan = Pajak + Denda;
 totPen += totPendapatan;
 pjk[i] = new Pajak(counter, kdr[i].getTNKB(),kdr[i].getNama(), Pajak, Denda, totPen);
 counter++;
 }
 }
 System.out.println();
 System.out.println();
 }
static void tampilTransaksi() {
 System.out.println("======================");
 System.out.println("TOTAL TRANSAKSI");
 System.out.println("=======================");
System.out.println("---------------------------------------------------");
 System.out.println("| KODE | PLAT | NAMA |NOMINAL | DENDA |");
System.out.println("----------------------------------------------------");
 for (int i = 0; i < pjk.length; i++) {
 Pajak pjk1 = pjk[i];
 if (pjk1 == null) {
 System.out.println(" ");
 return;
 }
 pjk[i].printpjk();
 }
 }
 static void totalPendapatan() {
 tampilTransaksi();
System.out.println("==================================================================");
 System.out.printf("| TOTAL PENDAPATAN ="+totPen+"|\n");
 System.out.println("==================================================================");
 System.out.println();
 System.out.println();
 }
}