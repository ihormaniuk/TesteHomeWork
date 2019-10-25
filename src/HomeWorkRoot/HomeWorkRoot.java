package HomeWorkRoot;

import java.util.Scanner;

public class HomeWorkRoot {
        public static void main(String args[]){
            System.out.println("a*x2+b*x+c=0");
            Scanner root = new Scanner(System.in);
            int a = root.nextInt();
            int b = root.nextInt();
            int c = root.nextInt();
            int d = (b*b)-(4*a*c);
            if(d > 0){
                double x1,x2;
                x1 = (-b+Math.sqrt(d))/(2*a);
                x2 = (-b-Math.sqrt(d))/(2*a);
                System.out.print("Корінь : "+((x1 > x2)?x2:x1)+" "+((x1>x2)?x1:x2));
            }else if (d == 0){
                System.out.print("Один Корінь: " +(-b/(2*a)));
            } else {
                System.out.print("Немає Корення");
            }
        }
}
