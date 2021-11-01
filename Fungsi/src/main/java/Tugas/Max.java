package Tugas;
import java.util.*;
public class Max{
    //==========================================================================
    static int Max3(
            int bil1,
            int bil2,
            int bil3)
        {
        int nilai;
        if(bil1>bil2 && bil2> bil3)
        {
        System.out.println("nilai terbesar : "+bil1);
        nilai = bil1;
        }
        else if(bil2>bil3){
        System.out.println("nilai terbesar : "+bil2);
        nilai = bil2;
        }else{
        System.out.println("nilai terbesar : "+bil3);
        nilai = bil3;
        }
        return nilai;
    }
    //==========================================================================
    static int Min3(
            int bil1, 
            int bil2, 
            int bil3)
        {
        int nilai=0;
        if(bil1<bil2 && bil2<bil3)
        {
        System.out.println("nilai terkecil : "+bil1);
        nilai = bil1;
        }else if(bil2<bil3)
        {
        System.out.println("nilai terkecil : "+bil2);
        nilai = bil2;
        }else if(bil1<bil2 && bil2<bil3 && bil3<bil1)
        {
        System.out.println("nilai terkecil : "+bil3);
        nilai = bil3;
        }
        return nilai;
    }
    //==========================================================================
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ulangan 1 : ");
        int bil1 = input.nextInt();
        System.out.println("ulangan 2 : ");
        int bil2 = input.nextInt();
        System.out.println("ulangan 3 : ");
        int bil3 = input.nextInt();
    //==========================================================================
        int terbesar = Max3(bil1,bil2,bil3);
        int terkecil = Min3(bil1,bil2,bil3);
        int rata = (bil1+bil2+bil3)/3;
    //==========================================================================
        int hasil = rata;
        System.out.println("nilai rata-rata = "+hasil);
    //==========================================================================
    }
}
