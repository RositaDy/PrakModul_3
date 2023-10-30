import java.util.Scanner;

/**
 * Program Java sederhana untuk mengonversi nilai dalam kilometer menjadi centimeter.
 * @author rosit
 *
 */
public class Konversii {
    /**
     * Metode utama program.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     *
     */
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nilai dalam kilometer: ");
            double kilometer = input.nextDouble();

            if (kilometer < 0) {
                System.out.println("Masukkan harus positif.");
            } else {
                double centimeter = kilometer * 100000; // 1 kilometer = 100,000 centimeter
                System.out.println(kilometer + " kilometer sama dengan " + centimeter + " centimeter.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan angka dalam bentuk desimal (misalnya, 5.5).");
        }
    }


}

