import java.util.Scanner;

public class KartuHasilStudi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String nDepan, nBelakang, nim, pStudi, fakultas;
        int    thnMasuk, thnLulus;
        double ipk;
        String end = "======================================";

        // scan biodata
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("             Biodata Diri"             );
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("Masukkan data anda dengan benar!");
        System.out.println();
        System.out.print("Nama Depan     : ");
        nDepan=scan.nextLine();
        System.out.print("Nama Belakang  : ");
        nBelakang=scan.nextLine();
        System.out.print("NIM            : ");
        nim=scan.nextLine();
        System.out.print("Program Studi  : ");
        pStudi=scan.nextLine();
        System.out.print("Fakultas       : ");
        fakultas=scan.nextLine();
        System.out.print("Tahun Masuk    : ");
        thnMasuk=scan.nextInt();
        System.out.print("Tahun Lulus    : ");
        thnLulus=scan.nextInt();
        System.out.print("IPK            : ");
        ipk=scan.nextDouble();
        System.out.println();
        
        // output scan
        System.out.println("======================================");
        System.out.println("          Kartu Hasil Studi           ");
        System.out.println("======================================");
        System.out.println("Nama Lengkap    : " + nDepan + " " + nBelakang);
        System.out.println("NIM             : " + nim);
        System.out.println("Program Studi   : " + pStudi);
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("IPK             : " + ipk + "0");

        // program if, else, else if
        int lamaStudi = thnLulus - thnMasuk + 1; 
        if (ipk >= 3.51 && lamaStudi <= 4) {
            System.out.println("Predikat Lulus  : Dengan Pujian Tertinggi (Summa Cumlaude)");
            System.out.println(end);
        } else if (ipk >= 3.51) {
            System.out.println("Predikat Lulus  : Dengan Pujian (Cumlaude)");
            System.out.println(end);
        } else if (ipk >= 3.01 && ipk < 3.51) {
            System.out.println("Predikat Lulus  : Sangat Memuaskan");
            System.out.println(end);
        } else if (ipk >= 2.76 && ipk < 3.01) {
            System.out.println("Predikat Lulus  : Memuaskan");
            System.out.println(end);
        } else if (ipk >= 2.00 && ipk < 2.76) {
            System.out.println("Predikat Lulus  : Cukup");
            System.out.println(end);
        } else if (ipk < 2.00) {
            System.out.println("Predikat Lulus  : Tidak Lulus");
            System.out.println(end);
        } else if (ipk > 4.00 && ipk < 0) {
            System.out.println("Predikat Lulus  : Tidak Valid");
            System.out.println(end);
        }

        System.out.println("======================================");
        System.out.println();
    }
}
