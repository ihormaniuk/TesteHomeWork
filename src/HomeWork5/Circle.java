package HomeWork5;

import java.util.Scanner;

public class Circle {
    Scanner scanner = new Scanner(System.in);

    double Radius = scanner.nextDouble ();

    public Circle(){

    }

    public Circle(double Radius){
        this.Radius = Radius;
    }

    public double diameter(){
        return (Radius * 2);
    }

    public double area(){
        return  Math.PI * (Radius * Radius);
    }

    public double length(){
        return Math.PI * 2*Radius;
    }


}

/**         //Метод main
 public static void main(String[] args){
 System.out.println ( "ведіть радіус" );
 Circle c = new Circle ();
 c.scanner.nextLine ();
 System.out.println ( "діаметер - "  + c.diameter () );
 System.out.println ("площа - " + c.area () );
 System.out.println ( "довжина - " + c.length () );
 }**/