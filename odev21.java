
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
public class odev21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A MATRİSİNİN HER BİR SÜTUN ELEMANLARI ÇARPIMINDAN N ELEMANLI B DİZİSİNİ OLUŞTURAN PROGRAM
         Scanner input=new Scanner(System.in);
        System.out.println("satır ve sütun:");
        int n =input.nextInt();
        int[][] A= new int[n][n];
        int[] B=new int[n];
        System.out.println("A matrisi: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i+". satır"+j+".sütun: ");
                A[i][j]=input.nextInt();
                
            }
            
        }
        System.out.println("B dizisi");
        for (int i = 0; i < n; i++) {
            B[i]=1;
            for (int j = 0; j < n; j++) {
                B[i] *= A [i][j];
                
            }
            System.out.print(B[i]+" ");
        }
     
        
    }
    
}
