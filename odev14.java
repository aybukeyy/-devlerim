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
public class odev14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A MATRİSİNİN YEDEK KÖŞEGENİNİN ÜSTÜNDE KALAN ELEMAN TOPLAMI
        Scanner input=new Scanner(System.in);
        System.out.print("satır ve sütun: ");
        int n=input.nextInt();
        int[][] A= new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i+". satırı"+j+".sütunu: ");
                A[i][j]=input.nextInt();
                
                
            }
            
        }
        
        int toplam=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j<n-1) {
                    toplam += A[i][j];
                    
                }
                
            }
            
        }
        System.out.println("yedek köşegen altı toplamı: "+ toplam);
        
    }
    
}
