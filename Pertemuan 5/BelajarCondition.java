import java.util.Scanner;

public class BelajarCondition {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat = ");
        int x = scanner.nextInt();
        int sisa = x % 2;
        if (sisa==0) {
            System.out.println("Anda memasukkan bilangan genap");
        } else {
            System.out.println("Anda memasukkan bilangan ganjil");
        }
        System.out.println("Terima kasih");

    }
}
