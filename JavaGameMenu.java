package selesai;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int masuk;
        System.out.println("MENU");
        System.out.println("1.      Segitiga Siku - Siku Rapat Kanan ");
        System.out.println("2.      Segitiga sama kaki");
        System.out.println("3.      Pigora");
        System.out.println("4.      Keluar");
        System.out.println("Pilihan: ");
        int pilihan=input.nextInt();
        while(pilihan != 4) {
            if (pilihan == 1) {
                System.out.println("Masukkan angka untuk ukuran segitiga siku-siku rapat kanan: ");
                masuk = input.nextInt();
                for (int d = 1; d <= masuk; d++) {
                    for (int e = masuk; e >= d; e--) {
                        System.out.print(" ");
                    }
                    for (int f = 1; f <= d; f++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                System.out.println("MENU");
                System.out.println("1.      Segitiga Siku - Siku Rapat Kanan ");
                System.out.println("2.      Segitiga sama kaki");
                System.out.println("3.      Pigora");
                System.out.println("4.      Keluar");
                System.out.println("Pilihan: ");
                pilihan=input.nextInt();

            } else if (pilihan == 2) {
                System.out.println("Masukkan angka untuk ukuran segitiga sama kaki: ");
                masuk = input.nextInt();
                for (int a = 1; a <= masuk; a++)
                {
                    for (int b = masuk; b >= a; b--)
                    {
                        System.out.print (" ");
                    }
                    for (int c = 1; c <= a; c++)
                    {
                        System.out.print ("*" + " ");
                    }
                    System.out.println (" ");
                }
                System.out.println("MENU");
                System.out.println("1.      Segitiga Siku - Siku Rapat Kanan ");
                System.out.println("2.      Segitiga sama kaki");
                System.out.println("3.      Pigora");
                System.out.println("4.      Keluar");
                System.out.println("Pilihan: ");
                pilihan=input.nextInt();
            } else if (pilihan == 3) {
                System.out.println("Masukkan angka untuk ukuran pigora: ");
                int n = input.nextInt();
                for (int k = 1; k <= n; k++) {
                    System.out.println("");
                    if (k == 1 || k == n) {
                        for (int i = 0; i < n; i++) {
                            System.out.print("*");
                        }
                    } else {
                        for (int j = 1; j <= n; j++) {
                            if (j == 1 || j == n) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                }
                System.out.println("");
                System.out.println("MENU");
                System.out.println("1.      Segitiga Siku - Siku Rapat Kanan ");
                System.out.println("2.      Segitiga sama kaki");
                System.out.println("3.      Pigora");
                System.out.println("4.      Keluar");
                System.out.println("Pilihan: ");
                pilihan=input.nextInt();

            } else {
                System.out.println("Nomor pilihan tidak valid");
                pilihan=input.nextInt();
            }
        }
        System.out.println("Anda telah keluar");
    }
}
