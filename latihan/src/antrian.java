import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pelanggan {
    String nama;
    String jenisLayanan;

    Pelanggan(String nama, String jenisLayanan) {
        this.nama = nama;
        this.jenisLayanan = jenisLayanan;
    }
}

class AntrianRestoran {
    private Queue<Pelanggan> antrianReservasi = new LinkedList<>();
    private Queue<Pelanggan> antrianTanpaReservasi = new LinkedList<>();

    public void tambahPelanggan(String nama, String jenisLayanan) {
        Pelanggan pelanggan = new Pelanggan(nama, jenisLayanan);
        if (jenisLayanan.equalsIgnoreCase("Reservasi")) {
            antrianReservasi.offer(pelanggan);
        } else if (jenisLayanan.equalsIgnoreCase("Tanpa Reservasi")) {
            antrianTanpaReservasi.offer(pelanggan);
        } else {
            System.out.println("Jenis layanan tidak valid. Harap masukkan 'Reservasi' atau 'Tanpa Reservasi'.");
        }
    }

    public void panggilPelanggan() {
        if (!antrianReservasi.isEmpty()) {
            Pelanggan pelanggan = antrianReservasi.poll();
            System.out.println("Pelanggan yang dipanggil: " + pelanggan.nama + " (Reservasi)");
        } else if (!antrianTanpaReservasi.isEmpty()) {
            Pelanggan pelanggan = antrianTanpaReservasi.poll();
            System.out.println("Pelanggan yang dipanggil: " + pelanggan.nama + " (Tanpa Reservasi)");
        } else {
            System.out.println("Tidak ada pelanggan dalam antrian.");
        }
    }

    public void lihatAntrian() {
        System.out.println("Antrian Pelanggan:");
        for (Pelanggan p : antrianReservasi) {
            System.out.println(p.nama + " (Reservasi)");
        }
        for (Pelanggan p : antrianTanpaReservasi) {
            System.out.println(p.nama + " (Tanpa Reservasi)");
        }
    }

    public int jumlahPelanggan() {
        return antrianReservasi.size() + antrianTanpaReservasi.size();
    }
}

public class antrian {
    public static void main(String[] args) {
        AntrianRestoran antrian = new AntrianRestoran();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Panggil Pelanggan");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Keluar");

            System.out.print("Pilih opsi (1-4): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan jenis layanan (Reservasi/Tanpa Reservasi): ");
                    String jenisLayanan = scanner.nextLine();
                    antrian.tambahPelanggan(nama, jenisLayanan);
                    break;
                case 2:
                    antrian.panggilPelanggan();
                    break;
                case 3:
                    antrian.lihatAntrian();
                    break;
                case 4:
                    System.out.println("Terima kasih! Sampai jumpa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}