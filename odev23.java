
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus
 */
public class odev23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A MATRİSİNİN SİMETRİK OLUP OLMADIĞINI KONTROL EDEN PROGRAM
        Scanner input = new Scanner(System.in);
        System.out.println("satır ve sütun:");
        int n = input.nextInt();
        int[][] A = new int[n][n];
        System.out.println("A matrisi: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + ". satır" + j + ".sütun: ");
                A[i][j] = input.nextInt();

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && A[i][j] != A[j][i]) {
                     System.out.println("simetrik değildir.");
                     System.exit(0);

                }

            }
            System.out.println("simetriktir");

        }

    }
}
