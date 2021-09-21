import java.util.Scanner;

public class CobaInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda : ");
        String namaDepan = scanner.nextLine();

        System.out.print("Masukkan umur Anda : ");
        int umur = scanner.nextInt();

        System.out.println("Nama Anda adalah " + namaDepan);
        System.out.println("Umur Anda adalah " + umur);

    }
}
