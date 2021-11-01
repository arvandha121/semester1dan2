public class Persegi {
    static int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }
    public static void main(String[] args) {
        int luasan = luasPersegi(10);
        System.out.println("Luas Persegi dengan sisi 5 = "+luasan);
    }
}
