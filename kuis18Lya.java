import java.util.Scanner;

public class kuis18Lya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam = -1;
        int total = 0;
        int jumlahKendaraan = 0;
        int nim2 = 75;
        int batas = (nim2 % 3) + 2;

        while (jam != 0) {
            // Tarif: jam pertama Rp 5000, jam berikutnya Rp 3000 per jam
            do {
                System.out.print("Lama parkir (jam, 0 = selesai): ");
                jam = sc.nextInt();

                if (jam < 1 || jam > 24) {
                    System.out.println("Input tidak valid. Masukkan jam antara 1 hingga 24.");
                    
                    for (int i = 0; i < batas; i++) {
                        System.out.println("Kesempatan " + (i + 1) + " dari " + batas);
                    }
                    
                } else {
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

                
            } while (jam < 1 || jam > 24);
              
        }

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
    }
}