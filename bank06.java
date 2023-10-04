import java.util.Scanner;

public class bank06 {
    public static void main(String[] args) {
        // Langkah 1: Input jumlah tabungan awal dan lama menabung
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah tabungan awal (Rp): ");
        int jml_tabungan_awal = input.nextInt();
        System.out.print("Masukkan lama menabung (tahun): ");
        int lama_menabung = input.nextInt();

        // Data lain
        double persentase_bunga = 0.02;

        // Langkah 2: Hitung bunga
        double bunga = lama_menabung * persentase_bunga * jml_tabungan_awal;

        // Langkah 3: Hitung jumlah tabungan akhir
        double jml_tabungan_akhir = jml_tabungan_awal + bunga;

        // Langkah 4: Output bunga dan jumlah tabungan akhir
        System.out.println("Bunga yang didapat (Rp): " + bunga);
        System.out.println("Jumlah tabungan akhir (Rp): " + jml_tabungan_akhir);
    }
}


   


