import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
//==============================================================================
public class tutorial52MengenalException {
    public static void main(String[] args) {
        
        //----------------------------------------------------------------------
        
        int [] array = {0,1,2,3};
        
        //----------------------------------------------------------------------
        
        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.print("nilai array ke: ");
        int index = userInput.nextInt();
        
        //----------------------------------------------------------------------
        
        //exception handling(try, catch, finally)
        System.out.println("Handling out of bound");
        try{
            System.out.printf("index ke-%d, adalah %d\n",index,array[index]);
        }catch(Exception exception_message){
            System.err.println(exception_message);
        }
        
        //runtime error jika file tidak ada
        System.out.println("Handling IO not found");
        try{
            fileInput = new FileInputStream("input.txt");
        }catch(IOException e){
            System.err.println(e);
        }
        
        //----------------------------------------------------------------------
        
        //menggabungkan dua exception
        System.out.println("menggabunggkan dua buah exception");
        try{
            System.out.printf("index ke-%d, adalah %d\n",index,array[index]);
            fileInput = new FileInputStream("input.txt");
            
        }catch(IOException e){
            System.err.println("file yang anda cari tidak ditemukkan");
        }
        catch(Exception e){
            System.err.println("Index yang anda masukkan tidak sesuai dengan jumlah array");
        }
        
        //----------------------------------------------------------------------
        
        //finally
        System.out.println("Menambahkan finally");
        try{
            System.out.printf("index ke-%d, adalah %d\n",index,array[index]);
        }catch(Exception e){
            System.err.println("Index yang anda masukkan tidak sesuai dengan jumlah array");
        }finally{
            System.out.println("finally");
        }
        
        //----------------------------------------------------------------------
        
        System.out.println("\nakhir dari program");
    }
}
