import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int dik1 , dik2 ;
        double uzun3 ;
        Scanner veriler = new Scanner(System.in);
        System.out.println("Kenarı giriniz:  ");
        dik1 = veriler.nextInt();
        System.out.println("Kenar2 giriniz:  ");
        dik2 = veriler.nextInt();
        System.out.println("Uzun3 giriniz:  ");
        uzun3 = veriler.nextDouble();
        double u =  ( dik1 + dik2 + uzun3 ) / 2 ;
        double z = u*(u-dik1)*(u-dik2)*(u-uzun3);
        double a = Math.sqrt(z);
    System.out.println("Alan: "+ a);
    }
}
