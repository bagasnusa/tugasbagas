import java.util.Scanner;

public class segitiga06 {
    public static void main(String[] args) {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang alas garasi (meter): ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi garasi (meter): ");
        double tinggi = input.nextDouble();

        // Proses
        double luas = 0.5 * alas * tinggi;

        // Output
        System.out.println("Luas garasi adalah: " + luas + " meter persegi");

        // Tutup scanner
        input.close();
    }
}
