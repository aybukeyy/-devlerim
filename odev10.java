
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
public class odev10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ORTALAMA ÇEŞİTLERİ
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen terim sayısı giriniz.");
        int n = input.nextInt();
        int[] sayi = new int[n];

        for (int i = 0; i < sayi.length; i++) {
            System.out.print((i + 1) + "inci eleman:");
            sayi[i] = input.nextInt();

        }
        int t1 = 0;

        double t2 = 0;
        int c = 1;
        int c2 = 0;
        for (int i = 0; i < sayi.length; i++) {
            t1 = t1 + sayi[i];
            t2 += (double) 1 / sayi[i];
            c = c * sayi[i];
            c2 = c2 + sayi[i] ^ 2;

        }
        double ao = (double) t1 / sayi.length;
        System.out.println("aritmetik ortalamanız:" + ao);
        double go = (double) Math.pow(c, 1 / n);
        System.out.println("geometrik ortalamanız:" + go);
        double ho = (double) n / t2;
        System.out.println("harmonik ortalamanız:" + ho);
        double kho = (double) c2 / t1;
        System.out.println("kontraharmonik ortlamanız:" + kho);

    }

}
