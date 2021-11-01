package Jobsheet3Tugas;

public class BangunPrisma {
    int alas, lebar, tinggi, sisi;
    
    BangunPrisma(int a, int l, int t, int s){
        a=alas;
        l=lebar;
        t=tinggi;
        s=sisi;
    }

    BangunPrisma() {
        
    }
    
    float volumePrisma(){
        return (1/2 * (alas*lebar*tinggi));
    }
    int luasPrisma(){
        return ((3*sisi)*tinggi)+(2*(3*sisi)*tinggi);
    }
}
