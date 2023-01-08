/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class odev5 {

    public static int[][] dizitoplam(int diziuzunluk) {
        int[][] A = new int[diziuzunluk][diziuzunluk];
        int[][] B = new int[diziuzunluk][diziuzunluk];
        int[][] C = new int[diziuzunluk][diziuzunluk];
        for (int i = 0; i < diziuzunluk; i++) {
            for (int j = 0; j < diziuzunluk; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }

        }
        for (int i = 0; i < diziuzunluk; i++) {
            for (int j = 0; j < diziuzunluk; j++) {
                System.out.print(C[i][j] + " ");

            }
            System.out.println();

        }

        return C;
    }

    public static void main(String[] args) {
        int[][] A = {{5, 10, 15}, {20, 25, 30}, {35, 40, 45}};
        int[][] B = {{10, 15, 25}, {40, 45, 55}, {60, 50, 80}};
       // int[][] C = new int[3][3];

        dizitoplam(3);

    }
}
