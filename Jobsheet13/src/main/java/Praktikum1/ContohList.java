package Praktikum1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class ContohList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(29);
        System.out.printf
        ("Element 0 : %d total elemen : %d elemen terakhir : %s \n"
                ,al.get(0),al.size(),al.get(al.size() - 1));
        al.add(4);
        al.remove(0);
        System.out.printf
        ("Element 0 : %d total elemen : %d elemen terakhir : %s \n"
                ,al.get(0),al.size(),al.get(al.size() - 1));
        LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
        
        System.out.printf
        ("Element 0 : %s total elemen : %s elemen terakhir : %s \n",names.get(0),names.size(),names.get(names.size() - 1));
        names.set(0, "My Kid");
        System.out.printf
        ("Element 0 : %s total elemen : %s elemen terakhir : %s \n",names.get(0),names.size(),names.get(names.size() - 1));
        System.out.println("Names : "+names.toString());
        
        names.push("Nauvan");
        System.out.printf
        ("Element 0 : %s total elemen : %s elemen terakhir : %s \n",
                names.get(0),names.size(),names.get(names.size() - 1));
        System.out.println("Names : "+names.toString());
    }
}
