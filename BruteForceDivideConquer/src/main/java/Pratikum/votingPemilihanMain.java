package Pratikum;
import java.util.*;
import static Pratikum.NilaiAlgoritma.login;
public class votingPemilihanMain {
    
    static void menu(){
        Scanner sc = new Scanner(System.in);
        votingPemilihan vote = new votingPemilihan();
        int ulang = 0;
//        login();
        do{
            System.out.println("========================================");
            System.out.println("\tPEMILIHAN KETUA BEM ");
            System.out.println("========================================");
            System.out.println("List Home Menu : ");
            System.out.println("1. Pemilihan kandidat");
            System.out.println("0. Keluar Program!");
            System.out.println("Pilih menu : ");
            int pilih = sc.nextInt();
            if(pilih == 1){
                Kandidat();
                continue;
            }else if(pilih == 0){
                System.out.println("Anda telah keluar dari program");
                break;
            }else{
                System.out.println("-----------------------------");
                System.out.println("pilihan anda tidak tersedia!");
                System.out.println("-----------------------------");
            }
        }while(ulang !=0 || ulang<3);
    }
    
    static void Kandidat(){
        Scanner sc = new Scanner(System.in);
        votingPemilihan vote = new votingPemilihan();
        System.out.println("========================================");
        System.out.println("\tPEMILIHAN KETUA BEM ");
        System.out.println("========================================");
        System.out.println("Masukkan banyak orang yang akan melakukan pencoblosan : ");
        int coblos = sc.nextInt();
        int[] pilih = new int[coblos];
//        vote.kandidat = "";
        for (int i = 0; i < 4; i++) {
            System.out.println("Masukkan Kandidat ke-"+(i+1)+" = ");
            vote.kandidat = sc.next();
        }
        
        System.out.println("---- KANDIDAT -----");
        System.out.println("1. Haris");
        System.out.println("2. Dian");
        System.out.println("3. Rani");
        System.out.println("4. Bisma");
        for(int j = 0; j < coblos; j++){
            System.out.println("Pilih salah satu Kandidat(Masukkan angka 1 - 4) : ");
            pilih[j] = sc.nextInt();
        }
        
        vote.suara = vote.votingPemilihan(pilih, 0, coblos);
        if(vote.suara == 1){
            vote.kandidat = "Haris";
        }else if(vote.suara == 2){
            vote.kandidat = "Dian";
        }else if(vote.suara == 3){
            vote.kandidat = "Rani";
        }else if(vote.suara == 4){
            vote.kandidat = "Bisma";
        }
        System.out.println("=================================================================");
        System.out.println("Kandidat dengan suara terbanyak ("+vote.kandidat+") dengan nomor '"+vote.suara+"'");
        System.out.println("=================================================================");
        System.out.println("");
    }
    
    public static void main(String[] args) {
        menu();
    }
}
