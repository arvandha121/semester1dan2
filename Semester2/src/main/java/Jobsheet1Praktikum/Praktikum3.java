package Jobsheet1Praktikum;
import java.util.*;
class Praktikum3{
    public static void main(String[] args) {
        //============================================================================================================
        int []arr[] = {{10,5,15,7},
                       {6,11,9,12},
                       {2,10,10,5},
                       {5,7,12,9}};
        //============================================================================================================
        float aglonema = 75000;
        float keladi = 50000;
        float alocasia = 60000;
        float mawar = 10000;
        //============================================================================================================
        int jmlagl = arr[0][0] + arr[1][0] + arr[2][0] + arr[3][0];
        int jmlkld = arr[0][1] + arr[1][1] + arr[2][1] + arr[3][1];
        int jmlalc = arr[0][2] + arr[1][2] + arr[2][2] + arr[3][2];
        int jmlMwr = arr[0][3]+ arr[1][3] + arr[2][3] + arr[3][3];
        //============================================================================================================
        System.out.println("A. Jumlah stok berdasarkan jenis bunganya diseluruh cabang?");
        System.out.println("    Bunga Aglonema -> RoyalGarden 1 : "+arr[0][0]+" + "+ "RoyalGarden 2 : "+arr[1][0]+
                            " RoyalGarden 3 : "+arr[2][0]+" + "+ "RoyalGarden 4 : "+arr[3][0]);
        System.out.println("    Total Bunga Aglonema = "+jmlagl);
        
        System.out.println("    Bunga Keladi -> RoyalGarden 1 : "+arr[0][1]+" + "+ "RoyalGarden 2 : "+arr[1][1]+
                            " RoyalGarden 3 : "+arr[2][1]+" + "+ "RoyalGarden 4 : "+arr[3][1]);
        System.out.println("    Total Bunga Keladi = "+jmlkld);
        
        System.out.println("    Bunga Alocasia -> RoyalGarden 1 : "+arr[0][2]+" + "+ "RoyalGarden 2 : "+arr[1][2]+
                            " RoyalGarden 3 : "+arr[2][2]+" + "+ "RoyalGarden 4 : "+arr[3][2]);
        System.out.println("    Total Bunga Alocasia = "+jmlalc);
        
        System.out.println("    Bunga Mawar -> RoyalGarden 1 : "+arr[0][3]+" + "+ "RoyalGarden 2 : "+arr[1][3]+
                            " RoyalGarden 3 : "+arr[2][3]+" + "+ "RoyalGarden 4 : "+arr[3][3]);
        System.out.println("    Total Bunga Mawar = "+jmlMwr);
        //============================================================================================================
        System.out.println("\nB. berapakah total pendapatan dari RoyalGarden 1 jika semua Bunga Terjual Habis?");
        float rg1 = ((arr[0][0]-1)*aglonema)+((arr[0][1]-2)*keladi)+((arr[0][2]-0)*alocasia)+((arr[0][3]-5)*mawar);
        System.out.println("    RoyalGarden1 = Aglonema ("+(arr[0][0]-1)+" * Rp.75000) + Keladi ("+(arr[0][1]-2)+" * Rp.50.000) + Alocasia ("+(arr[0][2]-0)+" * Rp.60.000) + Mawar ("+(arr[0][3]-5)+" * Rp.10.000)");
        System.out.println("    RoyalGarden1 = Rp."+rg1);
    }
}
