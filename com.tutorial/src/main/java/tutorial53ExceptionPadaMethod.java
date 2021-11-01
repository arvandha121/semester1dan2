import java.util.*;
public class tutorial53ExceptionPadaMethod {
    public static void main(String[] args) {
        int[]array = {0,1,2,3};
        Scanner sc = new Scanner(System.in);
        System.out.print("data ke- : ");
        int indexInput = sc.nextInt();
        
        //Exception biasa
        System.out.println("Exception biasa");
        try{
            System.out.printf("data dari array ke - %d adalah %d\n\n",indexInput, array[indexInput]);
        }
        catch(Exception e){
            System.err.println(e);
        }
        
        //Exception didalam fungsi
        System.out.println("Exception didalam fungsi");
        int data = ambilDataDariArray(array, indexInput);
        System.out.printf("data dari array ke - %d adalah %d\n\n",indexInput, data);
        
        //Exception throws by method
        int data2 = 0;
        System.out.println("\nException throws by method");
        try{
            data2 = ambilData(array, indexInput);
        }catch(Exception e){
            System.err.println("");
        }
        System.out.printf("data dari array ke - %d adalah %d\n\n",indexInput, data2);
        
        
        System.out.println("\n\nakhir dari program");
    }
    
    static int ambilDataDariArray(int[] array,int index){
        int hasil = 0;
        try{
            hasil = array[index];
        }
        catch(Exception e){
            System.err.println(e);
        }
        return hasil;
    }
    
    static int ambilData(int[] array, int index) throws Exception{
        int hasil = array[index];
        return hasil;
    }
}
