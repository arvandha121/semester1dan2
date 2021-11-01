public class tutorial15OperatorLogika {
    public static void main(String args[]){
        
        // Operator logika --> operasi yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, XOR, negasi
        
        boolean a,b,c;
        
        // OR / atau (||)
        
        System.out.println("==== OR (||) ====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b +" = " + c );
        
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b +" = " + c );
        
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b +" = " + c );
        
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b +" = " + c );
        
        // AND / atau (&&)
        
        System.out.println("==== AND (&&) ====");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b +" = " + c );
        
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b +" = " + c );
        
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b +" = " + c );
        
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b +" = " + c );

        // XOR / exlusive (^)
        
        System.out.println("==== XOR (^) ====");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b +" = " + c );
        
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b +" = " + c );
        
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b +" = " + c );
        
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b +" = " + c );
        
        //NOT / negasi --> flipping (!)
        System.out.println("==== NEGASI (!) ====");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " + c);
        
        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " + c);
        
    }
}