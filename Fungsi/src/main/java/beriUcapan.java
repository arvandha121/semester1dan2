public class beriUcapan {
    static void beriSalam(){
        System.out.println("Halo! Nauvan");
    }
    static void beriUcapan(String ucapan){
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        beriSalam();
        String salam = "Selamat datang di pemograman Java";
        beriUcapan(salam);
    }
}