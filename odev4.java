
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class odev4 {
    public static int[][] ikiboyut(int ustsinir,int dizi1uzunluk,int dizi2uzunluk){
        int[][] dizi=new int[dizi1uzunluk][dizi2uzunluk];
         Random r= new Random();
         for (int i = 0; i < dizi1uzunluk; i++) {
             for (int j = 0; j < dizi2uzunluk; j++) {
                 dizi[i][j]=r.nextInt(ustsinir);
                 
             }
             
            
        }
         return dizi;
        
    }

   
    public static void main(String[] args) {
      int[][] dizi=ikiboyut(50,4,4);
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(dizi[i][j]+" ");
                
            }
            System.out.println( );
            
        }
    }
    
}
