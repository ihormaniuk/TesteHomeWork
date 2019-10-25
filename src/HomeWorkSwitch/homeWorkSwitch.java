package HomeWorkSwitch;

import java.util.Scanner;

public class homeWorkSwitch {
        public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть день тижня");
            String day = scanner.nextLine();
            switch (day){
                case "понеділок" :
                    //System.out.println("Понеділок");
                    System.out.println("Зустріч");
                    break;
                case "вівторок" :
                    //System.out.println("Вівторок");
                    System.out.println("Вечеря");
                    break;
                case "середа" :
                    //System.out.println("Середа");
                    System.out.println("Зателефонувати Андрію");
                    break;
                case "четверг" :
                    //System.out.println("Четверг");
                    System.out.println("Відрядження");
                    break;
                case "пятнця" :
                    //System.out.println("Пятнця");
                    System.out.println("Перерахунок");
                    break;
                case "субота" :
                    //System.out.println("Субота");
                    System.out.println("Вихідний");
                    break;
                case "неділя" :
                    //System.out.println("Неділя");
                    System.out.println("Вихідний");
                    break;
                default:
                    System.out.println("Немає Планів або ведено невірне значення");
            }
        }
}
