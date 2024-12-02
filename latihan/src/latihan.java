import java.util.Scanner;  // Mengimpor kelas Scanner dari paket java.util untuk menerima input dari pengguna

public class latihan {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        int jumlahMakanan;  // Variabel untuk menyimpan jumlah makanan yang dimasukkan oleh pengguna
        
        // Program akan meminta input hingga pengguna memasukkan angka negatif
        while (true) {
            // Meminta input dari pengguna
            System.out.print("Masukkan jumlah makanan yang dikumpulkan oleh hewan (angka negatif untuk berhenti): ");
            jumlahMakanan = scanner.nextInt();  // Mengambil input angka dari pengguna
            
            // Jika pengguna memasukkan angka negatif, keluar dari perulangan
            if (jumlahMakanan < 0) {
                System.out.println("Program berhenti. Terima kasih telah menggunakan bantuan Owu'o.");
                break;  // Keluar dari perulangan
            }
            
            // Menggunakan pengondisian untuk memeriksa apakah jumlah makanan genap atau ganjil
            if (jumlahMakanan % 2 == 0) {
                // Jika angka genap
                System.out.println("Jumlah makanan " + jumlahMakanan + " adalah genap. Makanan dapat dibagi rata.");
            } else {
                // Jika angka ganjil
                System.out.println("Jumlah makanan " + jumlahMakanan + " adalah ganjil. Cari satu makanan lagi agar bisa dibagi rata.");
            }
        }
        
        // Menutup scanner setelah selesai digunakan
        scanner.close();
    }
}
