package Tugas;

import java.util.*;

public class array1dmain {

    static void menu() {
        Scanner sc = new Scanner(System.in);
        array1dservice list = new array1dservice();

        array1d t0 = new array1d(12);
        array1d t1 = new array1d(17);
        array1d t2 = new array1d(2);
        array1d t3 = new array1d(1);
        array1d t4 = new array1d(70);
        array1d t5 = new array1d(50);
        array1d t6 = new array1d(90);
        array1d t7 = new array1d(17);
        array1d t8 = new array1d(2);
        array1d t9 = new array1d(90);

        list.tambah(t0);
        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);
        list.tambah(t6);
        list.tambah(t7);
        list.tambah(t8);
        list.tambah(t9);

        int ulang = 0;
        do {
            System.out.println("=======================================================================");
            System.out.println("    PENCARIAN DATA ARRAY 1 DIMENSI DENGAN MENGGUNAKAN SEARCH BINARY    ");
            System.out.println("=======================================================================");
            System.out.println("Pilih menu dibawah ini!");
            System.out.println("1. List Data Array");
            System.out.println("2. List Setelah Diurutkan dengan Selection Sort (Asc)");
            System.out.println("3. Mencari Array");
            System.out.println("0. Keluar");
            System.out.println("--------------------------------------------");
            System.out.println("Pilihah menu :");
            int pilih = sc.nextInt();
            System.out.println("--------------------------------------------");
            if (pilih == 1) {
                System.out.println("Array tampil");
                list.tampil();
                System.out.println();
                continue;
            } else if (pilih == 2) {
                System.out.println("Data menggunakan selection sort ascending");
                list.selectionSort();
                list.tampil();
                System.out.println();
            } else if (pilih == 3) {
                System.out.println("_________________________________________________");
                System.out.println("_________________________________________________");
                System.out.println("Pencarian Data : ");
                System.out.println("Masukkan array yang dicari: ");
                System.out.println("array : ");
                int cari = sc.nextInt();
                System.out.println("================================================");
                System.out.println("\tmenggunakan binary search");
                System.out.println("================================================");
                cari = list.FindBinarySearch(cari, 0, 10);
                list.tampil();
                System.out.println();
                list.Tampilposisi(cari, cari);
                list.Tampilposisi(cari, cari + 1);
            } else if (pilih == 0) {
                System.out.println("Anda telah keluar dari program");
                break;
            } else {
                System.out.println("Menu yang anda berikan tidak tersedia");
            }
        } while (ulang != 0 || ulang < 3);
    }

    public static void main(String[] args) {
        menu();
    }
}
