package latihanPraktikum;
import java.util.*;
public class PremiereLeagueService {
    
    PremiereLeague[] leagues = new PremiereLeague[20];
    int a;
    
    void tambah(PremiereLeague t){
        if (a<leagues.length){
            leagues[a] = t;
            a++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }
    
    void tampilAll(){
        
        for (int i = 0; i < leagues.length; i++) {
            int b = 1;
            b = b+i;
            System.out.println("============ Premiere League Match ============");
            System.out.println(b+". Team = "+leagues[i].team);
            System.out.println("   Play = "+leagues[i].play);
            System.out.println("   goal = "+leagues[i].goal);
            System.out.println("   points = "+leagues[i].points);
        }
    }
    
    void InsertSort(boolean asc){
        if(asc == true){
            System.out.println("============ Data Ascending ============");
            for (int i = 1; i < leagues.length; i++) {
                PremiereLeague temp = leagues[i];
                int j = i;
                while(j>0 && leagues[j-1].points >temp.points){
                    leagues[j] = leagues[j-1];
                    j--;
                }
                leagues[j] = temp;
            }
        }else if(asc == false){
            System.out.println("============ Data Descending ============");
            for (int i = 1; i < leagues.length; i++) {
                PremiereLeague temp = leagues[i];
                int j = i;
                while(j>0 && leagues[j-1].points < temp.points){
                    leagues[j] = leagues[j-1];
                    j--;
                }
                leagues[j] = temp;
            }
        }
        
    }
    
}
