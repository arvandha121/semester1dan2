package UTS1;
import java.util.*;
public class Transaksi {
    
    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type;
    
    Transaksi(double a, double b, double c, String d,  String e){
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
        type = e;
    }
    
   void tampilRekening(){
        System.out.println("no Rekening          saldo          Saldo Awal          Saldo Akhir          Tanggal Transaksi");
        System.out.println(type+"        "+saldo+"       "+saldoAwal+"            "+saldoAkhir+"             "+tanggalTransaksi);
        System.out.println("---------------------------------------------------------------------------------------------------");
    }
}
