package ArrayTanah;
public class Tanah {
    public int panjang;
    public int lebar;
    int luasTanah(){
       int volume = panjang*lebar;
        return volume;
    }
    int luasTanah2(int p, int l){
        return p * l;
    }
        int tanahTerluas(Tanah[] luas){
        int x=0;
        for(int i =0; i<luas.length; i++)
        {
            if(luasTanah2(luas[i].panjang, luas[i].lebar)> x)
            {
                x =luasTanah2(luas[i].panjang, luas[i].lebar) ;
            }
            
        }
        return x;
    }
}
