package ArrayMahasiswa;

public class dataMahasiswa {
    String Nama, Kelamin;
    int nim;
    float IPK;
    
    void rata(){
        dataMahasiswaMain[] mahasiswa = new dataMahasiswaMain[3];
        float total = 0;
        for (int i = 0; i < mahasiswa.length; i++) {
            total = total/IPK;
        }
        float rata = mahasiswa.length/IPK;
    }
}
