import java.util.Scanner;

public class programKalkulator {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner (System.in);

        System.out.println(":::::::::: Kalkulator Sederhana ::::::::::");
        System.out.println();

        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");
        System.out.println();

        System.out.print("Masukkan Pilihanmu : ");
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                Penjumlahan();
                break;
            case 2:
                Pengurangan();
                break;
            case 3:
                Perkalian();
                break;
            case 4:
                Pembagian();
                break;
            case 5:
                Modulus();
                break;
            
        }
        System.out.println();
        System.out.println(":::::::::::::::: Selesai ::::::::::::::::");
    }

    public static void Penjumlahan() {
        Scanner scanner = new Scanner (System.in);
        System.out.println();
        System.out.println("----- Penjumlahan -----");
        System.out.println();
        
        System.out.print("Nilai a = ");
        int a = scanner.nextInt();
        System.out.print("Nilai b = ");
        int b = scanner.nextInt();
        int hasil = a + b;
        System.out.println();
        System.out.println("Hasil penjumlahan dari " + a + " + " + b + " = " + hasil);
    }
    
    public static void Pengurangan() {
        Scanner scanner = new Scanner (System.in);
        System.out.println();
        System.out.println("----- Pengurangan -----");
        System.out.println();
        
        System.out.print("Nilai a = ");
        int a = scanner.nextInt();
        System.out.print("Nilai b = ");
        int b = scanner.nextInt();
        int hasil = a - b;
        System.out.println();
        System.out.println("Hasil pengurangan dari " + a + " - " + b + " = " + hasil);
    }
    
    public static void Perkalian() {
        Scanner scanner = new Scanner (System.in);
        System.out.println();
        System.out.println("----- Perkalian -----");
        System.out.println();
        
        System.out.print("Nilai a = ");
        int a = scanner.nextInt();
        System.out.print("Nilai b = ");
        int b = scanner.nextInt();
        int hasil = a * b;
        System.out.println();
        System.out.println("Hasil perkalian dari " + a + " * " + b + " = " + hasil);
    }
    
    public static void Pembagian() {
        Scanner scanner = new Scanner (System.in);
        System.out.println();
        System.out.println("----- Pembagian -----");
        System.out.println();
        
        System.out.print("Nilai a = ");
        int a = scanner.nextInt();
        System.out.print("Nilai b = ");
        int b = scanner.nextInt();
        int hasil = a / b;
        System.out.println();
        System.out.println("Hasil pembagian dari " + a + " / " + b + " = " + hasil);
    }
    public static void Modulus() {
        Scanner scanner = new Scanner (System.in);
        System.out.println();
        System.out.println("----- Modulus -----");
        System.out.println();
        
        System.out.print("Nilai a = ");
        int a = scanner.nextInt();
        System.out.print("Nilai b = ");
        int b = scanner.nextInt();
        int hasil = a % b;
        System.out.println();
        System.out.println("Hasil modulus dari " + a + " % " + b + " = " + hasil);
    }
}
