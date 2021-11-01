package Jobsheet2Praktikum;

public class PacMan {
    int x, y;
    int width, height;
    
    void moveLeft(){
        if(x-1 >= x){
            System.out.println("Koordinat x PacMac Tidak Boleh Di Bawah 0");
        }
    }
    void moveRight(){
        if(x+1 > width){
            System.out.println("Anda Melebihi koordinat width");
        }
    }
    void moveUp(){
        if(y+1 > height){
            System.out.println("Anda Melebihi koordinat heigth");
        }
    }
    void moveDown(){
        if(y-1 >= y){
            System.out.println("Koordinat y PacMac Tidak Boleh Di Bawah 0");
        }
    }
    void printPosition(){
        if (height >= x && x >= 0 && width >= y && y >= 0){
            System.out.printf("\nPosisi pacman (x,y) = (%d,%d)", x,y);
        }else {
            System.out.println("Game Selesai");
        }
        moveLeft();
        moveRight();
        moveDown();
        moveUp();
    }
}
