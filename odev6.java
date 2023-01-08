/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class odev6 {
    public static void yildiz(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println( );
            
        }
    }

   
    public static void main(String[] args) {
        yildiz(10);
    }
    
}
