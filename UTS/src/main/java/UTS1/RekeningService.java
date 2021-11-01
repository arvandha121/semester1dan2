package UTS1;
public class RekeningService {
    Rekening[] array = new Rekening[5];
    int a;
    
    void tambah(Rekening t){
        if (a<array.length){
            array[a] = t;
            a++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }
    
    void tampilrek(){
        for (Rekening t : array) {
            t.tampilRekening();
        }
    }
    
    void NamaBubbleSort() {
        for (int i=0; i<array.length-1; i++){
            for (int j=1; j<array.length-i; j++){
                if (array[j].nama.compareTo(array[j-1].nama)<0){
                    Rekening tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
    }
}
