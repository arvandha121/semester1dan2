import java.util.Scanner;
public class tugas4{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int umur, status1, status2;
        int pendapatan, tanggungan, biaya;
        //===============================================================================
        System.out.println("Masukkan umur\t\t: ");
        umur = sc.nextInt();
        //===============================================================================
        if (umur>=18){
            System.out.println("Status pekerja (1), status pelajar(2)");
            status1 = sc.nextInt();
            if(status1 != 2){
                System.out.println("jumlah pendapatan perbulan\t\t: ");
                pendapatan = sc.nextInt();
                System.out.println("jumlah tanggungan perbulan\t\t: ");
                tanggungan = sc.nextInt();
                biaya = pendapatan/tanggungan;
                System.out.println("biaya hidup\t\t\t\t: " + biaya);
                    if(biaya >= 300000){
                        System.out.println("Anda termasuk penduduk miskin");
                    }else {
                        System.out.println("Anda bukan termasuk penduduk miskin");
                    }
            }
        }
        else{
            System.out.println("Status sekolah (Masih sekolah(1), status tidak sekolah(2)");
            status2 = sc.nextInt();
            if(status2 != 2){
                System.out.println("Anda bukan termasuk penduduk miskin");
            }else{
                System.out.println("Anda termasuk penduduk miskin");
            }
        }
    }
}