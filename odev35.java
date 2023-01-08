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

public class odev35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SESLİ VE SESSİZ HARFLERİ AYRI OLARAK SIRASILA YAZDIRMA
        Scanner input = new Scanner(System.in);
        System.out.println("küçük harflerle bir kelime giriniz.");
        String txt = input.nextLine();
        char[] sesli = {'a', 'e', 'i', 'u', 'o'};
        String k1 = " ";
        String k2 = " ";

        for (int i = 0; i < txt.length(); i++) {

            char h = txt.charAt(i);
            
            for (int j = 0; j < sesli.length; j++) {
                if (sesli[j] == h) {

                    k1 += h;
                } 
                else {
                    k2 += h;
                    
                }

            }

        }
        System.out.println("sesli harfleri: " + k1);
        System.out.println("sessiz harfler: " + k2);

    }

}
