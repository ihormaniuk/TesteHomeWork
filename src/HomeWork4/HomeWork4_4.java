package HomeWork4;

public class HomeWork4_4 {
    public static void main(String args[]){
        int [] number = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,18,20,298,1234,445,4453356};
        int a = number [0];
        for (int i = 0; i < number.length;i++){
            if (number[i]>=a){
                a=number[i];
            }
        }
        System.out.println(" " + a );
    }
}
