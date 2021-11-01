package ArrayMahasiswa;
import java.util.*;
public class dataMahasiswaMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //============================================================
        
        float total = 0;
        
        //============================================================
        
        System.out.println("Masukkan array : ");
        int array = sc.nextInt();
        dataMahasiswa[] data = new dataMahasiswa[array];
        
        //============================================================
        
        for(int i=0; i<data.length; i++){
            data[i] = new dataMahasiswa();
            System.out.println("Masukkan data mahasiswa ke-"+(i+1));
            System.out.println("Masukkan nama : ");
            data[i].Nama = sc.next();
            System.out.println("Masukkan nim : ");
            data[i].nim = sc.nextInt();
            System.out.println("Masukkan jenis kelamin : ");
            data[i].Kelamin = sc.next();
            System.out.println("Masukka IPK : ");
            data[i].IPK = sc.nextFloat();
            total = total + data[i].IPK;
        }
        System.out.println("--------------------------------");
        
        //============================================================
        
        System.out.println("");
        for(int i=0; i<data.length; i++){
            System.out.println("Data Mahasiswa ke-"+(i+1));
            System.out.println("nama : "+data[i].Nama);
            System.out.println("nim : "+data[i].nim);
            System.out.println("Jenis Kelamin : "+data[i].Kelamin);
            System.out.println("Nilai IPK : "+data[i].IPK);
        }
        System.out.println("--------------------------------");
        
        //============================================================
        
        float rata = total/data.length;
        System.out.println("nilai rata-rata IPK mahasiswa = "+rata);
    }
}
