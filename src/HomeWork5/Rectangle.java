package HomeWork5;
import  java.util.Scanner;


public class Rectangle {
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt () ;
    int width = scanner.nextInt () ;


    public  Rectangle(){
    }

    public  Rectangle(int length ,int width){
        this.length = length;
        this.width = width;
    }

    public int perimeter(){
        return  length*2 + width*2;
    }

    public int area(){
        return length*width;
    }
}
