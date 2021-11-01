import java.util.*;
public class tutorial48PengenalanString {

    private static String kataString = "hallo";
    static char[]kataChar = {'h','a','l','l','o'};
    public static void main(String[] args) {
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));
        
        //mengakses komponen dari string
        System.out.println("komponen pertama dari char[] = "+kataChar[0]);
        System.out.println("komponen pertama dari String = "+kataString.charAt(0));
        
        //merubah komponen dari string itu tidak bisa
        //karena string di java itu immutable
        kataChar[0] = 'c';
        System.out.println(Arrays.toString(kataChar));
        
        //kita bisa merubah komponen secara tidak langsung
        printAddress();
        kataString = "c"+kataString.substring(1,5);
        System.out.println(kataString);
        System.out.println("c"+kataString.substring(1,5));
        
        printAddress();
        
    }
    static String nama = "kataString", data = ("c"+kataString.substring(1,5));
    private static void printAddress(){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = "+ data +"\t|| address = "+Integer.toHexString(address));
    }
}