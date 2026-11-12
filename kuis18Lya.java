import java.util.Scanner;

public class kuis18Lya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam = -1;
        int total = 0;
        int jumlahKendaraan = 0;

        while (jam != 0) {
            // Tarif: jam pertama Rp 5000, jam berikutnya Rp 3000 per jam
            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt();

            int biaya = 5000 + (jam - 1) * 3000;
            total += biaya;
            
            if (biaya == 0) {
                biaya = 0;
            }
            
            System.out.println("Biaya parkir: Rp " + biaya);
            if (jam != 0) {
                jumlahKendaraan++;
            }     
        }

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
    }
}