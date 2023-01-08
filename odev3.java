
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
public class odev3 {
    // METOTLARDA KÜÇÜKTEN BÜYÜĞE SIRALAMA
    public static int[] siralama(int n){
        Scanner input=new Scanner(System.in);
        int[] dizi=new int[n];
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i+1)+". eleman: ");
            dizi[i]=input.nextInt();
            
            
        }
        System.out.println("Küçükten büyüğe sıralayalım.");
        int tmp;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i; j < dizi.length; j++) {
                if (dizi[j]<dizi[i]) {
                    tmp=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=tmp;
                    
                }
                
            }
            
            
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizinin "+ (i+1)+". elemanı: "+dizi[i]);
            
        }
        return dizi;
        
    }

   
    public static void main(String[] args) {
        siralama(3);
    }
    
}
