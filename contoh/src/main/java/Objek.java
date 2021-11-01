public class Objek {
    String name;
    int speed, healthPoin;
    
    void run(){
        if(healthPoin<30){
            System.out.println("Running for the enemies");
        }else if(healthPoin <= 100){
            System.out.println("Keep to Fighting");
        }
    }
//    boolean isDead(){
//        if()
//    }
}
