package HomeWork4;

import java.util.Scanner;
public class HomeWork4_3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть число");
        int a = scanner.nextInt();
        if ((a%2)==0){
            System.out.println("Number " + a + " парне");
        }else {
            if ((a%1)==0){
                System.out.println("Number " + a + " не парне");
            }
        }
    }
}
