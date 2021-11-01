package tugas;
import java.util.*;
public class Tugas4Array2{
   public static void main (String args[]){
    Scanner input=new Scanner(System.in);
    //==========================================================================
    System.out.print("Masukan Jumlah Mahasiswa : ");
    int n=input.nextInt();
    //==========================================================================
    String nama[]=new String[n];
    String duduk[]=new String[n];
    int nilai[]=new int[n];
    //==========================================================================
    for (int i=0;i<n;i++){
         System.out.println("Mahasiswa Ke : "+(i+1));
        System.out.print("Nama : ");
        nama[i]=input.next();
        System.out.print("Nilai : ");
        nilai[i]=input.nextInt();
        if(nilai[i]>=80) {
            duduk[i]="Duduk Berada di paling depan";
        }else if(nilai[i]>=50){
            duduk[i]="Duduk Berada di tengah";
        }else{
            duduk[i]="duduk berada di belakang";
	}
    }
    //==========================================================================
    System.out.println("DAFTAR NILAI MAHASISWA");
    System.out.println("======================");
    System.out.println("No |\tNama\t|  Nilai |  Duduk  ");
    //==========================================================================
    for (int i=0; i<n;i++) {
        System.out.println((i+1)+"    "+nama[i]+"     "+nilai[i]+"       "+duduk[i]);
    }
    } 
}