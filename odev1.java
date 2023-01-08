
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
public class odev1 {
    // METOTLARDA N E KADAR OLAN SAYILARIN KARELERİ TOPLAMI
    public static void toplam(int n){
       
        int toplam=0;
        for (int i = 0; i <= n; i++) {
            toplam+= (i*i);
            
        }
        System.out.println("Kareleri toplamı: "+toplam);
    }

   
    public static void main(String[] args) {
        toplam(5);
        
    }
    
}
