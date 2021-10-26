class BelajarMethod {
    public static void main(String[] args) {
        menampilkanTeks();
        cobacoba();
        teksDenganParameter("Azam");
        String teks = tambahKata("Kalimat Awal");
        System.out.println(teks);
        String teks2 = tambahKataDuaParameter("Kalimat Awal", " Kalimat Kedua");
        System.out.println(teks2);
    }

    public static void menampilkanTeks() {
        System.out.println("Halo");
        System.out.println("Selamat Pagi!");
        System.out.println("Saya sedang");
        System.out.println("mencoba");
    }

    public static void cobacoba() {
        System.out.println("Menampilkan teks lain");
    }

    public static void teksDenganParameter(String nama) {
        System.out.println("Nama anda adalah " + nama);
    } 

    public static String tambahKata(String kataAwal) {
        String kalimat = "ini adalah kalimat tambahan " + kataAwal;
        return kalimat;
    }

    public static String tambahKataDuaParameter(String kataPertama, String kataKedua) {
        String kalimat = "ini adalah kalimat tambahan " + kataPertama + kataKedua;
        return kalimat;
    }
}
