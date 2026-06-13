import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array mahasiswa
        Mahasiswa[] daftar = new Mahasiswa[5];

        daftar[0] = new Mahasiswa(
                "Andi Pratama",
                "2440001",
                "Teknik Informatika",
                3.75);

        daftar[1] = new Mahasiswa(
                "Budi Santoso",
                "2440002",
                "Sistem Informasi",
                3.40);

        daftar[2] = new Mahasiswa(
                "Citra Lestari",
                "2440003",
                "Teknik Informatika",
                3.90);

        daftar[3] = new Mahasiswa(
                "Joni Suhartono",
                "2440004",
                "Teknik Industri",
                3.00);

        daftar[4] = new Mahasiswa(
                "Bulan Suci",
                "2440005",
                "Akuntansi",
                3.20);

        // Input NIM
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String cariNim = input.nextLine();

        boolean ditemukan = false;

        // Cari mahasiswa berdasarkan NIM
        for (Mahasiswa mhs : daftar) {

            if (mhs.getNim().equals(cariNim)) {

                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = input.nextDouble();

                // Update IPK
                mhs.updateIpk(ipkBaru);

                System.out.println("\nData berhasil diperbarui!\n");

                System.out.println("=== Data Mahasiswa ===");

                mhs.tampilkanInfo();

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("NIM tidak ditemukan!");
        }

        input.close();
    }
}