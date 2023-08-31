/**
 *
 * @author @briella.yb
 */
import java.util.Scanner;

public class cabangIF {

    public static void main(String[] args) {

        // membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Total Belanjaan: Rp ");
        belanja = scan.nextInt();

        // cek apakah dia belanja di atas 100000
        if ( belanja < 10000 ) {
            System.out.println("Belanja segini doang mah gak dapet apa apa dong");
        }
        if ( belanja > 50000 ) {
            System.out.println("duhh, naikin lg belanjanya dong biar dapet hadiahh");
        }
        if ( belanja > 100000 ) {
            System.out.println("Selamat, anda mendapatkan hadiah berupa kepo deh xixi");
        }

        System.out.println("Terima kasih...");
    }
}
