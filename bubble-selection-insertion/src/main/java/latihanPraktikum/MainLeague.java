package latihanPraktikum;
import java.util.*;
public class MainLeague {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        PremiereLeagueService list = new PremiereLeagueService();
        PremiereLeague m1 = new PremiereLeague("Liverpool", 29, 45, 82);
        PremiereLeague m2 = new PremiereLeague("Manchester city", 27, 39, 57);
        PremiereLeague m3 = new PremiereLeague("Leichester city", 28, 26, 50);
        PremiereLeague m4 = new PremiereLeague("Chelsea", 29, 9, 48);
        PremiereLeague m5 = new PremiereLeague("Wolverhampton Wanderers", 29, 7, 43);
        PremiereLeague m6 = new PremiereLeague("Sheffield United", 28, 5, 43);
        PremiereLeague m7 = new PremiereLeague("Manchester United", 28, 12, 42);
        PremiereLeague m8 = new PremiereLeague("Tottenham Hotspur", 29, 7, 41);
        PremiereLeague m9 = new PremiereLeague("Arsenal", 28, 4, 40);
        PremiereLeague m10 = new PremiereLeague("Burnley", 29, -6, 39);
        PremiereLeague m11 = new PremiereLeague("Crystal Palace", 29, -6, 39);
        PremiereLeague m12 = new PremiereLeague("Everton", 29, -6, 37);
        PremiereLeague m13 = new PremiereLeague("Newcastle United", 29, -16, 35);
        PremiereLeague m14 = new PremiereLeague("Southampton", 29, -17, 34);
        PremiereLeague m15 = new PremiereLeague("Brighton & Hove Albion", 29, -8, 29);
        PremiereLeague m16 = new PremiereLeague("West Ham United", 29, -15, 27);
        PremiereLeague m17 = new PremiereLeague("Watford", 29, -17, 27);
        PremiereLeague m18 = new PremiereLeague("AFC Bournemounth", 29, -18, 27);
        PremiereLeague m19 = new PremiereLeague("Aston Villa", 27, -18, 25);
        PremiereLeague m20 = new PremiereLeague("Norwich city", 29, -27, 21);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        list.tambah(m6);
        list.tambah(m7);
        list.tambah(m8);
        list.tambah(m9);
        list.tambah(m10);
        list.tambah(m11);
        list.tambah(m12);
        list.tambah(m13);
        list.tambah(m14);
        list.tambah(m15);
        list.tambah(m16);
        list.tambah(m17);
        list.tambah(m18);
        list.tambah(m19);
        list.tambah(m20);
        
        int ulang = 0;
        do{
            System.out.println("--------------------------------------------");
            System.out.println("Pilih menu dibawah ini!");
            System.out.println("1. Memunculkan Data Sebelum Sorting");
            System.out.println("2. Memunculkan Data SelectionSort Ascending");
            System.out.println("3. Memunculkan Data SelectionSort Descending");
            System.out.println("4. Keluar");
            System.out.println("Pilihah menu :");
            int pilih = sc.nextInt();
            System.out.println("--------------------------------------------\n");
            if(pilih == 1){
                System.out.println("Data mahasiswa sebelum sorting = ");
                list.tampilAll();
                continue;
            }else if(pilih == 2){
                System.out.println("============ SelectionSort Ascending ============");
                list.InsertSort(true);
                list.tampilAll();
                continue;
            }else if(pilih ==3){
                System.out.println("============ SelectionSort Descending ============");
                list.InsertSort(false);
                list.tampilAll();
            }else if(pilih==4){
                System.out.println("Anda telah keluar dari program");
                break;
            }else{
                System.out.println("Menu yang anda berikan tidak tersedia");
                System.out.println("");
            }
        }
        
        while(ulang !=0 || ulang<3);
    
    }
}
