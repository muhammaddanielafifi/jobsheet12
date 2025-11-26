package pertemuan14;

public class kubus16 {
    static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    public static void main(String[] args) {
        int sisi = 5;
        int luas = hitungLuasPermukaan(sisi);
        int volume = hitungVolume(sisi);
        System.out.println("Luas permukaan kubus dengan sisi " + sisi + " adalah: " + luas);
        System.out.println("Volume kubus dengan sisi " + sisi + " adalah: " + volume);
    }
}

