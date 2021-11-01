package Jobsheet3Tugas;

public class BangunKubus {
    int sisi;
    
    public BangunKubus(int s){
        sisi = s;
    }

    BangunKubus() {
        
    }
    float volumeKubus(){
        return sisi*sisi*sisi;
    }
    float LuasKubus(){
        return 6*sisi;
    }
}
