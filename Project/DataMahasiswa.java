public class DataMahasiswa extends DataTubuh {
    private String nim;
    private String nama;
    private double ipk;

    public DataMahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public double getIPK() {
        return this.ipk;
    }

    public void getDetail() {
        System.out.println("Nama Lengkap : "+this.nama);
        System.out.println("NIM          : "+this.nim);
        System.out.println("IPK          : "+this.ipk);
        System.out.println("Tinggi Badan : "+this.tinggiBadan+" cm");
        System.out.println("Berat Badan  : "+this.beratBadan+" kg");
    }

}