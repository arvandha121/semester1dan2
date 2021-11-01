package UTS1;
public class Rekening {
    String noRekening, nama, namaIbu, Phone, Email;
    
    Rekening(String a, String b, String c, String d, String e){
        noRekening = a;
        nama = b;
        namaIbu = c;
        Phone = d;
        Email = e;
    }
    
    void tampilRekening(){
        System.out.println("no Rekening          Nama          NamaIbu          Phone          Email");
        System.out.println(noRekening+"        "+nama+"       "+namaIbu+"      "+Phone+"      "+Email);
        System.out.println("---------------------------------------------------------------------------------------------------");
    }
}