import java.util.*;
import static java.util.Arrays.deepToString;
public class Ketiga {
    public static void main(String[] args) {
        
        char []arr[] = {
            {'I','N','F','O','R'},
            {'M','A','T','I','K'},
            {'A','P','O','L','I'},
            {'N','E','M','A','M'},
        };
        System.out.println(deepToString(arr));
        System.out.println("---------------------------------------------------");
        for (char[] arr1 : arr) {
                System.out.println(Arrays.toString(arr1));
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Maka output yang akan ditampilkan pada baris 1 dan kolom 5 adalah: ");
        System.out.println(arr[0][4]);
        System.out.println("Maka output yang akan ditampilkan pada baris 2 dan kolom 3 adalah: ");
        System.out.println(arr[1][2]);
        System.out.println("Maka output yang akan ditampilkan pada baris 3 dan kolom 2 adalah: ");
        System.out.println(arr[2][1]);
        System.out.println("Maka output yang akan ditampilkan pada baris 4 dan kolom 1 adalah: ");
        System.out.println(arr[3][0]);
    }
}
