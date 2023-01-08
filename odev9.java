
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
public class odev9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  İKİ DİZİ SKALER ÇARPIMI
        Scanner input = new Scanner(System.in);
        System.out.print("terim sayısı: ");
        int n = input.nextInt();
        int diziA[] = new int[n];
        int diziB[] = new int[n];
        int scarpim;
        System.out.println("A dizisinin elemanları:");
        for (int i = 0; i < diziA.length; i++) {
            System.out.print((i + 1) + ". terim: ");
            diziA[i] = input.nextInt();

        }
        System.out.println("B dizisinin elemanları: ");
        for (int i = 0; i < diziB.length; i++) {

            System.out.print((i + 1) + ". terim: ");
            diziB[i] = input.nextInt();
        }
         System.out.println("skaler çarpım sonuçları: ");
        for (int i = 0; i <diziA.length; i++) {
            scarpim=diziA[i]*diziB[i];
            System.out.println(scarpim);
            
            
        }
               
    }

}
