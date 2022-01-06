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

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Masukkan data yang ingin diinput dengan benar!");
        System.out.print("Nama Lengkap     = ");
        String nama = scan.nextLine();
        System.out.print("NIM              = ");
        String nim = scan.nextLine();
        System.out.print("Dosen Pembimbing = ");
        String dosPem = scan.nextLine();
        System.out.print("Nilai IPK        = ");
        double ipk = scan.nextDouble();
        System.out.print("Semester         = ");
        int semester = scan.nextInt();
        System.out.print("Tinggi Badan     = ");
        double tinggi = scan.nextDouble();
        System.out.print("Berat Badan      = ");
        double berat = scan.nextDouble();
        DataMahasiswa inputMahasiswa = new DataMahasiswa(nim, nama, dosPem, ipk, semester);
        inputMahasiswa.setTinggiBadan(tinggi);
        inputMahasiswa.setBeratBadan(berat);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
        lihatData();
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

    private void cariData() {
        if (jumlahData==0) {
            System.out.println("Belum ada data");
        } else {
            int subMenu = 0;
            while (subMenu!=3) {
                subMenu = subMenuSearch();
                if (subMenu==1) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan Nama mahasiswa yang akan dicari = ");
                    String nama = scan.nextLine();
                    int index = getIndexByNama(nama);
                    if (index == -1) {
                        System.out.println("Nama yang anda cari tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                    }        
                } else if (subMenu==2) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa yang akan dicari = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("NIM yang anda cari tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                    }
                } else if (subMenu==3) {

                }
            }
        }
    }

    private static int subMenuSearch() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("-- Sub Menu Search --");
        System.out.println();

        System.out.println("1. Cari dengan Nama");
        System.out.println("2. Cari dengan NIM");
        System.out.println("3. Kembali ke menu utama");
        System.out.print("Masukkan Pilihanmu : ");
        int subMenu = scan.nextInt();
        return subMenu;
    }

    public int getIndexByNama(String nama) {
        for (int i = 0; i < jumlahData; i++) {
            if (mahasiswa[i].getNama().equals(nama)) {
                return i;
            }
        }
        return -1;
    }

    public int getIndexByNIM(String nim) {
        for (int i = 0; i < jumlahData; i++) {
            if (mahasiswa[i].getNIM().equals(nim)) {
                return i;
            }
        }
        return -1;
    } 

    public void hapusData() {
        if (jumlahData==0) {
            System.out.println("Belum ada data");
        } else {
            int subMenu = 0;
            while (subMenu!=9) {
                subMenu = subMenuRemove();
                if (subMenu==1) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data yang anda akan hapus tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.println("Apakah anda yakin untuk menghapus data diatas?");
                        int eks = 0;
                        eks = eksekusi();
                        if (eks==1) {
                            for (int i = index; i < jumlahData; i++) {
                                mahasiswa[i] = mahasiswa[i+1];
                            }
                            jumlahData--;
                            lihatData();;
                        } 
                    }
                } else if (subMenu==2) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data yang anda akan hapus tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.println("Apakah anda yakin untuk menghapus nama dari data diatas?");
                        int eks = 0;
                        eks = eksekusi();
                        if (eks==1) {
                            System.out.println();
                            mahasiswa[index].setNama("");
                            mahasiswa[index].getDetail();
                        }
                    }
                } else if (subMenu==3) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data yang anda akan hapus tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.println("Apakah anda yakin untuk menghapus NIM dari data diatas?");
                        int eks = 0;
                        eks = eksekusi();
                        if (eks==1) {
                            System.out.println();
                            mahasiswa[index].setNIM("");
                            mahasiswa[index].getDetail();
                        }
                    }
                } else if (subMenu==4) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data yang anda akan hapus tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.println("Apakah anda yakin untuk menghapus Nama Dosen Pembimbing dari data diatas?");
                        int eks = 0;
                        eks = eksekusi();
                        if (eks==1) {
                            System.out.println();
                            mahasiswa[index].setDosPem("");
                            mahasiswa[index].getDetail();
                        }
                    }
                } else if (subMenu==5) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data yang anda akan hapus tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.println("Apakah anda yakin untuk menghapus Nilai IPK dari data diatas?");
                        int eks = 0;
                        eks = eksekusi();
                        if (eks==1) {
                            System.out.println();
                            mahasiswa[index].setIPK(0);
                            mahasiswa[index].getDetail();
                        }
                    }
                } else if (subMenu==6) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data yang anda akan hapus tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.println("Apakah anda yakin untuk menghapus Semester dari data diatas?");
                        int eks = 0;
                        eks = eksekusi();
                        if (eks==1) {
                            System.out.println();
                            mahasiswa[index].setSemester(0);
                            mahasiswa[index].getDetail();  
                        }
                    }
                } else if (subMenu==7) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data yang anda akan hapus tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.println("Apakah anda yakin untuk menghapus Tinggi Badan dari data diatas?");
                        int eks = 0;
                        eks = eksekusi();
                        if (eks==1) {
                            System.out.println();
                            mahasiswa[index].setTinggiBadan(0);
                            mahasiswa[index].getDetail();
                        }
                    }
                } else if (subMenu==8) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data yang anda akan hapus tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.println("Apakah anda yakin untuk menghapus Berat Badan dari data diatas?");
                        int eks = 0;
                        eks = eksekusi();
                        if (eks==1) {
                            System.out.println();
                            mahasiswa[index].setBeratBadan(0);
                            mahasiswa[index].getDetail();
                        }
                    }
                } else if (subMenu==9) {

                }
            }
        }
    }

    private static int subMenuRemove() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("-- Sub Menu Remove --");
        System.out.println();

        System.out.println("1. Hapus semua data");
        System.out.println("2. Hapus Nama");
        System.out.println("3. Hapus NIM");
        System.out.println("4. Hapus Dosen Pembimbing");
        System.out.println("5. Hapus IPK");
        System.out.println("6. Hapus Semester");
        System.out.println("7. Hapus Tinggi Badan");
        System.out.println("8. Hapus Berat Badan");
        System.out.println("9. Kembali ke menu utama");
        System.out.print("Masukkan Pilihanmu : ");
        int subMenu = scan.nextInt();
        return subMenu;
    }

    private static int eksekusi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Iya");
        System.out.println("2. Tidak");
        System.out.print("Masukkan pilihanmu = ");
        int eks = scan.nextInt();
        return eks;
    }

    public void editData() {
        if (jumlahData==0) {
            System.out.println("Belum ada data");
        } else {
            int subMenu = 0;
            while (subMenu!=8) {
                subMenu = subMenuEdit();
                if (subMenu==1) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data NIM yang anda akan edit tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.print("Masukkan Nama Mahasiswa yang baru = ");
                        String nama = scan.nextLine();
                        mahasiswa[index].setNama(nama);
                        mahasiswa[index].getDetail();
                    }
                } else if (subMenu==2) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan Nama mahasiswa yang akan diedit = ");
                    String nama = scan.nextLine();
                    int index = getIndexByNama(nama);
                    if (index == -1) {
                        System.out.println("Data mahasiswa yang anda akan edit tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.print("Masukkan NIM Mahasiswa yang baru = ");
                        String nim = scan.nextLine();
                        mahasiswa[index].setNIM(nim);
                        mahasiswa[index].getDetail();
                    }
                } else if (subMenu==3) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data NIM yang anda akan edit tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.print("Masukkan Dosen Pembimbing Mahasiswa yang baru = ");
                        String dosPem = scan.nextLine();
                        mahasiswa[index].setDosPem(dosPem);
                        mahasiswa[index].getDetail();
                    }
                } else if (subMenu==4) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data NIM yang anda akan edit tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.print("Masukkan IPK Mahasiswa yang baru = ");
                        double ipk = scan.nextDouble();
                        mahasiswa[index].setIPK(ipk);
                        mahasiswa[index].getDetail();
                    }
                } else if (subMenu==5) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data NIM yang anda akan edit tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.print("Masukkan Semester Mahasiswa yang baru = ");
                        int semester = scan.nextInt();
                        mahasiswa[index].setSemester(semester);
                        mahasiswa[index].getDetail();
                    }
                } else if (subMenu==6) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data NIM yang anda akan edit tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.print("Masukkan Tinggi Badan Mahasiswa yang baru = ");
                        double tinggiBadan = scan.nextDouble();
                        mahasiswa[index].setTinggiBadan(tinggiBadan);
                        mahasiswa[index].getDetail();
                    }
                } else if (subMenu==7) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println();
                    System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
                    String nim = scan.nextLine();
                    int index = getIndexByNIM(nim);
                    if (index == -1) {
                        System.out.println("Data NIM yang anda akan edit tidak ada.");
                    } else {
                        mahasiswa[index].getDetail();
                        System.out.println();
                        System.out.print("Masukkan Berat Badan Mahasiswa yang baru = ");
                        double beratBadan = scan.nextDouble();
                        mahasiswa[index].setBeratBadan(beratBadan);
                        mahasiswa[index].getDetail();
                    }
                } else if (subMenu==8) {
                    
                }
            }
            
        }
    }

    private static int subMenuEdit() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("-- Sub Menu Edit --");
        System.out.println();

        System.out.println("1. Edit Nama");
        System.out.println("2. Edit NIM");
        System.out.println("3. Edit Dosen Pembimbing");
        System.out.println("4. Edit IPK");
        System.out.println("5. Edit Semester");
        System.out.println("6. Edit Tinggi Badan");
        System.out.println("7. Edit Berat Badan");
        System.out.println("8. Kembali ke menu utama");
        System.out.print("Masukkan Pilihanmu : ");
        int subMenu = scan.nextInt();
        return subMenu;
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