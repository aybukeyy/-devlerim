/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class odev2 {
    // METOTLARDA ASALLIK
    public static void asal(int n){
        int sayac=0;
        for (int i = 2; i <n ; i++) {
            if (n%i==0) {
                sayac++;
                break;
                
            }
           
            
            
        }
        if (sayac==0) {
            System.out.println("sayınız asaldır.");
            
        }
        else{
            System.out.println("sayınız asal değildir.");
        }
    }

   
    public static void main(String[] args) {
       asal(6);
    }
    
}
