package pertemuan14;

import java.util.Scanner;

public class NilaiMahasiswa16 {

    static void isianArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    static void tampilArray(int[] arr) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int nilai : arr) {
            System.out.println("- " + nilai);
        }
    }

    static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] nilaiMhs = new int[N];

        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);

        int totalNilai = hitTot(nilaiMhs);
        System.out.println("\nTotal nilai seluruh mahasiswa = " + totalNilai);
    }
}

