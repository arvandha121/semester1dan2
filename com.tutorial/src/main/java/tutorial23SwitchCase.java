import java.util.*;

public class tutorial23SwitchCase {
    public static void main(String args[]) {
        //  swith case
        
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.next();
        System.out.println("panggil nama: ");
        System.out.println(input);
        
        switch (input){
            case "otong":
                System.out.println("saya otong dan hadir bos!!");
            break;
            default:
            System.out.println(input+"otong tidak hadir bos!!!");
        }
        
    }
}