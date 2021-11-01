package UTS1;
import java.util.*;
public class TransaksiService {
    Transaksi[] array2 = new Transaksi[5];
    int a;
    
    void tambah(Transaksi t){
        if (a<array2.length){
            array2[a] = t;
            a++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }
    
    void tampilser(){
        for (Transaksi t : array2) {
            t.tampilRekening();
        }
    }
    
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j=0;j<array2.length;j++){
            if(array2[j].saldo>cari){
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    
//    static int SearchingSaldo() {
//            for (int i = 0; i < array2.length; i++) {
//                for (int j = 0; j < array2.length; j++) {
//                    if (array2[i].getSaldoAkhir() < 500000) {
//                        System.out.printf("%-15d %-15s %-15s %-15s %-15s",balance[i].getNoRekeningAwal(),balance[i].getSaldoAwal(),balance[i].getSaldo(),balance[i].getSaldoAkhir(),balance[i].getTanggal());
//                        System.out.println();
//                        }break;
//                    }
//                }
//            return 0;
//    }
    void SearchSaldo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nominal : ");
        double nominal = sc.nextDouble();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(nominal < array2[i].saldo){
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s",array2[i].type, array2[i].saldo ,array2[i].saldoAwal ,array2[i].saldoAkhir ,array2[i].tanggalTransaksi);
                    System.out.println();
                    break;
                }
            }
        }
    }
}
