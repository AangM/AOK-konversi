
// Aang Maulana : 235150200111036
package Latihan;

import java.util.Scanner;

public class konversiBil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Pilih konversi yang diinginkan:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Heksadesimal");
            System.out.println("4. Heksadesimal ke Biner");
            System.out.println("5. Desimal ke Heksadesimal");
            System.out.println("6. Heksadesimal ke Desimal");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    String biner = input.nextLine();
                    int desimalFromBiner = Integer.parseInt(biner, 2);
                    System.out.println("Hasil konversi ke desimal: " + desimalFromBiner);
                    System.out.println("==========================================");
                    break;
                /* Contoh: Untuk mengkonversi 1101 (dalam biner) ke desimal:
                    1 * 2^0 + 0 * 2^1 + 1 * 2^2 + 1 * 2^3 = 1 + 0 + 4 + 8 = 13
                 */
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimal = input.nextInt();
                    String binerFromDesimal = Integer.toBinaryString(desimal);
                    System.out.println("Hasil konversi ke biner: " + binerFromDesimal);
                    System.out.println("==========================================");
                    break;
                /*Untuk mengkonversi bilangan desimal ke biner, Anda dapat menggunakan metode pembagian berulang 
                    Contoh: Untuk mengkonversi 13 (dalam desimal) ke biner:

                    13 ÷ 2 = 6 (sisa 1)
                    6 ÷ 2 = 3 (sisa 0)
                    3 ÷ 2 = 1 (sisa 1)
                    1 ÷ 2 = 0 (sisa 1)
                    Membaca hasil sisa dari bawah ke atas, kita mendapatkan 1101 (dalam biner).                 
                */
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    String binerToHex = input.nextLine();
                    int desimalFromBinerToHex = Integer.parseInt(binerToHex, 2);
                    String hexFromBiner = Integer.toHexString(desimalFromBinerToHex);
                    System.out.println("Hasil konversi ke heksadesimal: " + hexFromBiner);
                    System.out.println("==========================================");
                    break;
                /* Untuk mengkonversi bilangan biner ke heksadesimal, terlebih dahulu konversi bilangan biner ke desimal, 
                    lalu konversi desimal ke heksadesimal.
                */
                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String hexToBiner = input.nextLine();
                    int desimalFromHexToBiner = Integer.parseInt(hexToBiner, 16);
                    String binerFromHex = Integer.toBinaryString(desimalFromHexToBiner);
                    System.out.println("Hasil konversi ke biner: " + binerFromHex);
                    System.out.println("==========================================");
                    break;
                /* Untuk mengkonversi bilangan heksadesimal ke biner, terlebih dahulu konversi bilangan heksadesimal ke desimal,
                    lalu konversi desimal ke biner.
                 */
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimalToHex = input.nextInt();
                    String hexFromDesimal = Integer.toHexString(desimalToHex);
                    System.out.println("Hasil konversi ke heksadesimal: " + hexFromDesimal);
                    System.out.println("==========================================");
                    break;
                /* Contoh: Untuk mengkonversi 255 (dalam desimal) ke heksadesimal:
                    255 ÷ 16 = 15 (sisa 15, yang dapat ditulis sebagai F dalam heksadesimal)
                    15 ÷ 16 = 0 (sisa 15, juga dapat ditulis sebagai F dalam heksadesimal)
                    Membaca hasil sisa dari bawah ke atas, kita mendapatkan F15 (dalam heksadesimal).
                 */    
                case 6:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String hexToDesimal = input.nextLine();
                    int desimalFromHex = Integer.parseInt(hexToDesimal, 16);
                    System.out.println("Hasil konversi ke desimal: " + desimalFromHex);
                    System.out.println("==========================================");
                    break;
                /* Untuk mengkonversi heksadesimal ke desimal, dapat mengikuti cara yang sama dengan konversi dari biner ke desimal,
                    hanya kali ini menggunakan dasar 16 (16^0, 16^1, 16^2, dst.) daripada dasar 2.
                 */
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    System.out.println("==========================================");
            }
        } while (pilihan != 0);
    }
}
