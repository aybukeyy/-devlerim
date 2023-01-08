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
public class odev16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A MATRİSİNİN SONDAN BİR ÖNCEKİ SATIR VE SÜTUN ELEMAN TOPLAMI
        Scanner input=new Scanner(System.in);
        System.out.println("satır ve sütun: ");
        int n=input.nextInt();
        int[][] A= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i+". satırı"+j+". sütunu: ");
                A[i][j]=input.nextInt();
                
            }
            
        }
        int toplam=0;
        int sonuc=0;
        for (int i = 0; i < n-1; i++) {
             
              toplam += A[i][n-2]+A[n-2][i];      
               sonuc=toplam-A[n-2][n-2];
                
            
            
        }
       
        System.out.println("toplam"+ sonuc);
    }
    
}
