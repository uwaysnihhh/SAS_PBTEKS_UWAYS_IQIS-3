import java.util.Scanner;

public class MisiPenjagaHutan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahMakanan;

        do {
            System.out.print("Masukkan jumlah makanan (angka negatif untuk berhenti): ");
            jumlahMakanan = input.nextInt();

            if (jumlahMakanan >= 0) {
                if (jumlahMakanan % 2 == 0) {
                    System.out.println("Jumlah makanan " + jumlahMakanan + " adalah genap. Makanan dapat dibagi rata.");
                } else {
                    System.out.println("Jumlah makanan " + jumlahMakanan + " adalah ganjil. Cari satu makanan lagi agar bisa dibagi rata.");
                }
            }
        } while (jumlahMakanan >= 0);
    }
}