import java.util.Scanner;

public class programIdentitas {
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);
      
        String nDepan, nBelakang, nim, angkatan, pStudi, jurusan, fakultas, ipkHarapan;

        // scan biodata
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("    Program menampilkan biodata");
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
        System.out.print("Angkatan       : ");
        angkatan=scan.nextLine();
        System.out.print("Program Studi  : ");
        pStudi=scan.nextLine();
        System.out.print("Jurusan        : ");
        jurusan=scan.nextLine();
        System.out.print("Fakultas       : ");
        fakultas=scan.nextLine();
        System.out.print("IPK Harapan    : ");
        ipkHarapan=scan.nextLine();
        System.out.println();
        
        // output scan
        System.out.println("======================================");
        System.out.println("       Identitas Mahasiswa UNY           ");
        System.out.println("======================================");
        System.out.println("Nama Lengkap    : " + nDepan + " " + nBelakang);
        System.out.println("Nama Panggilan  : " + nBelakang);
        System.out.println("NIM             : " + nim);
        System.out.println("Angkatan        : " + angkatan);
        System.out.println("Program Studi   : " + pStudi);
        System.out.println("Jurusan         : " + jurusan);
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("IPK Harapan     : " + ipkHarapan);
        System.out.println("======================================");
        System.out.println();

        // deskripsi
        System.out.println("Deskripsi :");
        System.out.println("Halo temen-temen!");
        System.out.print("Perkenalkan nama saya " + nDepan + " " + nBelakang + ", ");
        System.out.print("saya biasa dipanggil " + nBelakang + ". ");
        System.out.print("NIM saya " + nim + ". \n");
        System.out.print("Saya berasal dari angkatan " + angkatan);
        System.out.print(" dari Program Studi " + pStudi + " " + fakultas + ". \n");
        System.out.print("IPK harapan saya pada semester ini adalah " + ipkHarapan + ".");
        System.out.println();
    }
}
