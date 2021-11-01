import java.util.Scanner;
public class RR{
    public static void main (String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("\nJumlah data yang diinput : ");
        int n=input.nextInt();
        //=========================================================================================================================
	String cari;
	String cari2;
        String nama[]=new String[n];
        int nilai[]=new int[n];
	int keluar[]=new int[n];
	int rusak[]=new int[n];
	int total[]=new int[n];
        //=========================================================================================================================
        for (int i=0;i<n;i++){
            System.out.println("\nInput Data Barang : "+(i+1));
            System.out.print("Nama Barang : ");
            nama[i]=input.next();
            cari2=nama[i];
            System.out.print("\nJumlah barang yang masuk : ");
            nilai[i]=input.nextInt();
		
            System.out.print("\nJumlah barang yang Keluar : ");
            keluar[i]=input.nextInt();
		
            System.out.print("\nJumlah barang yang Rusak : ");
            rusak[i]=input.nextInt();
		
            total[i]=((nilai[i]-keluar[i])-rusak[i]);
        }
        //=========================================================================================================================
//	System.out.print("\033[H\033[2J");  
//        System.out.flush();
        System.out.println("==============================================================================");	
        System.out.println("Laporan data Inventory");
        System.out.println("==============================================================================");
        System.out.println("No		Nama		Masuk		Keluar		Rusak		Total		\n");
        //=========================================================================================================================
        for (int i=0; i<n;i++) {
        System.out.println((i+1)+"		"+nama[i]+"		"+nilai[i]+"		"+keluar[i]+"		"+rusak[i]+"		"+total[i]);
            //=========================================================================================================================
        String cariBarang = nama[i];
        mencari(cariBarang);
        }
    }
    static void mencari(String cari2) {
        Scanner input = new Scanner(System.in);
	System.out.print("Cari Barang : ");
        int cari=input.nextInt();
        int i;
        if (cari==0){
            System.out.print("Barang ditemukkan");
        }
	else{
            System.out.print("Barang tidak ditemukkan");
        }
    }
}