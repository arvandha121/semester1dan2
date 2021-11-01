import java.util.*;
public class UTS {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int minimarket1,minimarket2,i;
        
        System.out.println("====JARAK TEMPUH MINIMARKET TERDEKAT====");
        System.out.println("Masukkan jarak minimarket pertama: ");
        minimarket1 = sc.nextInt();
        System.out.println("Masukkan jarak minimarket kedua: ");
        minimarket2 = sc.nextInt();
        
        for(i=1; i<=1; i++){
            if (i>100){
                System.out.printf("jarak tempuh minimarket %d terlalu jauh\n",i);
            }
            System.out.printf("jarak tempuh minimarket %d sesuai harapan\n",i);
        }
    }
}
