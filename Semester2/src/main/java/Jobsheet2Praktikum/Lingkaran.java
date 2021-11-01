package Jobsheet2Praktikum;

public class Lingkaran{
    double PHI , r;
    
    double hitungLuas(){
        float Luas = (float) (PHI * r * r);
        System.out.println("Luas lingkaran = "+Luas);
        return Luas;
    }
    double hitungKeliling(){
        int d =(int) (2*r);
        float Keliling = (float)(2*PHI*d);
        System.out.println("Keliling lingkaran = "+Keliling);
        return Keliling;
    }
}
