package Tugas;
import java.util.*;
public class array1dservice {
    
    array1d[] array = new array1d[10];
    int a;
    
    void tambah(array1d t){
        if (a<array.length){
            array[a] = t;
            a++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }
    
    void tampil(){
        for (array1d t : array) {
            t.tampil();
        }
    }
    
    void selectionSort(){
        for (int i=0; i<array.length-1; i++){
            int t = i;
            for (int j=i+1; j<array.length; j++){
                if(array[j].kolom < array[t].kolom){
                    t = j;
                }
            }
            array1d tmp = array[t];
            array[t] = array[i];
            array[i] = tmp;
        }
    }
    
    public void Tampilposisi(int x, int pos){
        if(pos!=-1){
            System.out.println("data ditemukan pada indeks "+pos);
        }else{
            System.out.println("data tidak ditemukan");
        }
    }
    
    int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (left + right)/2;
            if(cari == array[mid].kolom){
                return (mid);
            }else if(array[mid].kolom > cari){
                return FindBinarySearch(cari, left, mid-1);
            }else{
                return FindBinarySearch(cari, mid+1,right);
            }
        }
        return -1;
    }

}
