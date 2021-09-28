import java.util.Scanner;

public class BelajarOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai A : ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan nilai B : ");
        double b = scanner.nextDouble();
        System.out.println("A == B = " + (a==b));
        System.out.println("A != B = " + (a!=b));
        System.out.println("A > B = " + (a>b));
        System.out.println("A < B = " + (a<b));
        System.out.println("A >= B = " + (a>=b));
        System.out.println("A <= B = " + (a<=b));
        boolean hasil = (a < 5 && b > 2);
        System.out.println("Hasil dari A < 5 && B > 2 = " + hasil);
        System.out.println("Hasil dari A < 5 || B > 2 = " + (a < 5 || b > 2));
        System.out.println("Hasil dari !(A < 5 && B > 2) = " + !hasil);

    }
}
