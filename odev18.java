/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class odev18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A MATRİSİNDEN ALT ÜÇGEN B MATRİSİNİ OLUŞTURMA
        Scanner input = new Scanner(System.in);
        System.out.print("satır ve sütun: ");
        int n = input.nextInt();
        int[][] A = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + " .satır" + j + ".sütun: ");
                A[i][j] = input.nextInt();

            }

        }
        int[][] B = new int[n][n];
        System.out.println("B matrisi");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    B[i][j] = 0;

                } else {
                    B[i][j] = A[i][j];
                }

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(B[i][j] + " ");

            }
            System.out.println(" ");
        }

    }

}
