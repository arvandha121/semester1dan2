import java.util.*;
public class tutorial32BreakContinueDanReturn {
    public static void main(String args[]){
        
        //break continue, dan return
        
        int a = 0;
        
        while(true){
            a++;
            if(a==10){
                break;
            //ini adalah keyword untuk memaksa keluar dari looping
            }else if (a==5){
                continue;
            //ini adalah keyword untuk memaksa mulai dari awal
            } else if(a==7){
                return;
            }
            System.out.println("looping ke-"+a);
        }
        System.out.println("akhir looping");
    }
}
