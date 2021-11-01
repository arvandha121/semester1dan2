package Tugas;

public class PencarianMhs {
    Mahasiswa []listMhs = new Mahasiswa[3];
    int idx;
    
    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    
    void tampil(){
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("---------------------");
        }
    }
    
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public void Tampilposisi(int x, int pos){
        if(pos!=-1){
            System.out.println("data : "+x+" ditemukan pada indeks "+pos);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
    
    public void TampilData(int x, int pos){
        if(pos!=-1){
            System.out.println("Nim\t : "+x);
            System.out.println("Nama\t : "+listMhs[pos].nama);
            System.out.println("Umur\t : "+listMhs[pos].umur);
            System.out.println("IPK\t : "+listMhs[pos].ipk);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
    
    int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (left + right)/2;
            if(cari == listMhs[mid].nim){
                return (mid);
            }else if(listMhs[mid].nim > cari){
                return FindBinarySearch(cari, left, mid-1);
            }else{
                return FindBinarySearch(cari, mid+1,right);
            }
        }
        return -1;
    }
    
    void selectionSort(){
        for (int i = 0; i < listMhs.length; i++) {
            int t = i;
            for (int j = i+1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk < listMhs[t].ipk) {
                    t = j;
                    
                }
            }
            Mahasiswa tmp = listMhs[t];
            listMhs[t] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    
    int FindSeqSearchName(String cari){
        int posisi = -1;
        for(int j = 0; j < listMhs.length; j++){
            if(cari.equalsIgnoreCase(listMhs[j].nama)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public void TampilPosisi1 (String x, int pos1){
        if(pos1 != -1){
            System.out.println("Data ditemukan pada indeks " + (pos1+1));
        }else{
            System.out.println("Data " + x + " Tidak ditemukan ");
        }
    }
    
    public void TampilData1(String x, int pos1){
        if(pos1 != -1){
            System.out.println("Nim\t : " + listMhs[pos1].nim);
            System.out.println("Nama\t : "+ x);
            System.out.println("Umur\t : "+ listMhs[pos1].umur);
            System.out.println("IPK\t : "+ listMhs[pos1].ipk);
        }else{
            System.out.println("data " + x + "Tidak ditemukan");
        }
    }
    
}

