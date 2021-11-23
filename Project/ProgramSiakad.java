/*
Nama    : Abdilah Azam
NIM     : 21537144026
Prodi   : S1-Teknologi Informasi; J2
*/

import java.util.Scanner;

public class ProgramSiakad {
    DataMahasiswa[] mahasiswa = new DataMahasiswa[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("=====================================");
        System.out.println("              SIAKAD                 ");
        System.out.println("     (Sistem Informasi Akademik)     ");
        System.out.println("=====================================");

        ProgramSiakad siakad = new ProgramSiakad();
        int menu = 0;
        while (menu!=7) {
            menu = tampilanMenu();
            if (menu==1) {
                siakad.tambahData();
            } else if (menu==2) {
                siakad.lihatData();
            } else if (menu==3) {
                siakad.cariData();
            } else if (menu==4) {
                siakad.hapusData();
            } else if (menu==5) {
                siakad.editData();
            } else if (menu==6) {
                siakad.rerataIPK();
            } else if (menu==7){
                System.out.println();
                System.out.println(":::::::::::::::: Selesai ::::::::::::::::");
            } else {
                System.out.println("Masukkan Menu Yang Tersedia");
            }
        }
    }

    private static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println(".: Menu :.");
        System.out.println();

        System.out.println("1. Input data");
        System.out.println("2. View data");
        System.out.println("3. Search data");
        System.out.println("4. Remove data");
        System.out.println("5. Edit data");
        System.out.println("6. Rerata IPK");
        System.out.println("7. Exit");
        System.out.print("Masukkan Pilihanmu : ");
        int menu = scan.nextInt();
        return menu;
    }

    private void lihatData() {
        if (jumlahData==0) {
            System.out.println("Belum ada data");
        } else {
            int a,b;
            a=1;
            System.out.println();
            System.out.println("Berikut data mahasiswa");
            for (int i=0; i<jumlahData;i++) {
                b=i+a;
                System.out.println("---"+b+"---");
                mahasiswa[i].getDetail();
            } System.out.println();
        }
        
    }

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Masukkan data anda dengan benar!");
        System.out.print("Nama         = ");
        String nama = scan.nextLine();
        System.out.print("NIM          = ");
        String nim = scan.nextLine();
        System.out.print("IPK          = ");
        double ipk = scan.nextDouble();
        System.out.print("Tinggi Badan = ");
        double tinggi = scan.nextDouble();
        System.out.print("Berat Badan  = ");
        double berat = scan.nextDouble();
        DataMahasiswa inputMahasiswa = new DataMahasiswa(nim, nama, ipk);
        inputMahasiswa.setTinggiBadan(tinggi);
        inputMahasiswa.setBeratBadan(berat);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
        lihatData();
    }

    private void cariData() {
        if (jumlahData==0) {
            System.out.println("Belum ada data");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.print("Masukan NIM mahasiswa yang akan dicari = ");
            String nim = scan.nextLine();
            for (int i = 0; i < jumlahData; i++) {
                if (nim.equals (mahasiswa[i].getNIM())) {
                    System.out.println();
                    System.out.println("Berikut Data yang Anda Cari");
                    mahasiswa[i].getDetail();
                    break;
                } else {
                    System.out.println();
                    System.out.println("Data yang Anda Cari Tidak Ada");
                }
            }
        }
    }

    public void hapusData() {
        System.out.println("Menu belum tersedia.");
    }

    public void editData() {
        System.out.println("Menu belum tersedia.");
    }

    public void rerataIPK() {
        if (jumlahData==0) {
            System.out.println("Belum ada data");
        } else {
            double total = 0.0;
            for(int i=0; i<jumlahData; i++) {
                total += mahasiswa[i].getIPK();
            }
            double rerata = total/jumlahData;
            System.out.println();
            System.out.println("Rerata IPK Mahasiswa = "+ rerata);
        }
    }

}