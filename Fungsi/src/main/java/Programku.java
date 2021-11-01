public class Programku {
    public static void TampilHinggaKei(int i){
        for(int j=0; j<i; j++){
            System.out.print(j);
        }
    }
    public static int jml(int bil1, int bil2){
        return (bil1+bil2);
    }
    public static void TampilJumlah(int bil1, int bil2){
        TampilHinggaKei(jml(bil1, bil2));
    }
    public static void main(String args[]){
        int temp = jml (1,1);
        TampilJumlah(temp,5);
    }
}
