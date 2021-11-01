import java.util.Scanner;
public class tugas2{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int s1, s2, s3;
        //============================================================
        System.out.println("\t\t\tMENENTUKKAN SEGITIGA\t\t\t");
        System.out.println("Masukkan segitiga pertama\t: ");
        s1 = sc.nextInt();
        System.out.println("Masukkan segitiga kedua\t: ");
        s2 = sc.nextInt();
        System.out.println("Masukkan segitiga ketiga\t: ");
        s3 = sc.nextInt();
        //============================================================
        if (s1==s2)
            if (s2==s3){
            System.out.println("Sisi yang anda masukkan adalah Segitiga Sama Sisi");
        } else if (s1==s2)
            if (s3!=s1){
            System.out.println("Sisi yang anda masukkan adalah sisi Segitiga Sama kaki");
        } else{
            System.out.println("Sisi yang anda masukkan adalah sisi Segitiga Sembarang");
        }
    }
}